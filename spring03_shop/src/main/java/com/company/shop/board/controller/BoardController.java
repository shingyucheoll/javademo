package com.company.shop.board.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.company.shop.board.dto.BoardDTO;
import com.company.shop.board.dto.PageDTO;
import com.company.shop.board.service.BoardService;
import com.company.shop.common.file.FileUpload;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

//@CrossOrigin("*")
@Slf4j
@RestController
public class BoardController {

	@Autowired
	private BoardService boardService;

	@Autowired
	private PageDTO pDto;

	private int currentPage;
	
	// 파일 저장하는 폴더의 위치를 사용하겠다. properties
	@Value("${spring.servlet.multipart.location}")
	private String filePath;

	public BoardController() {

	}
	// http://localhost:8090/board/list/1

	@GetMapping("/board/list/{currentPage}")
	public ResponseEntity<Map<String, Object>> listExecute(@PathVariable("currentPage") int currentPage) {
		Map<String, Object> map = new HashMap<>();
		int totalRecord = boardService.countProcess();
		log.info("totalRecord : {}", totalRecord);

		if (totalRecord >= 1) {
			map.put("boardList", boardService.listProcess(pDto));
			log.info("\n\nBoardList :: " + map.get("boardList"));
		}

		return ResponseEntity.ok(map);
	}
	
	
	
 
	@PostMapping("/board/write")  	// 첨부파일이 있을떈 @RequestBody 사용하면 안된다. 405 error 발생함
	public ResponseEntity<String> writeProExecute(BoardDTO dto, PageDTO pv, HttpServletRequest req, HttpSession session) {
		
		MultipartFile file = dto.getFilename();
		log.info("\n\n subject : {}, content : {}", dto.getSubject(), dto.getContent());
		log.info("\n\n file : {}",file.getOriginalFilename());
		
		// 첨부파일이 있을 떄 같은 이름의 파일이 저장될 때 중복 방지
		if(file != null && !file.isEmpty()) {
			UUID random = FileUpload.saveCopyFile(file, filePath);
			dto.setUpload(random + "_" + file.getOriginalFilename());			
		}
		
		
		dto.setIp(req.getRemoteAddr());		
		boardService.insertProcess(dto);		
		return ResponseEntity.ok(String.valueOf(1));
		
	}

}

//<bean id = "boardService" class="com.company.shop.board.service.BoardService"/>
//<bean id = "boardController" class="com.company.shop.board.Controller">
//	<constructor ref = "boardService"/>
//</bean>

//file.transferTo(new File(random + "_" + file.getOriginalFilename()));