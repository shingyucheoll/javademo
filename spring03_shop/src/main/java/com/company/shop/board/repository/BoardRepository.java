package com.company.shop.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.company.shop.board.dto.BoardDTO;
import com.company.shop.board.dto.PageDTO;

@Mapper
@Repository
public interface BoardRepository {

	public int count();

	public List<BoardDTO> list(PageDTO pv);

	public void readCount(int num);

	public BoardDTO content(int num);

	public void reStepCount(BoardDTO dto);
	
	public int refPlus();

	public void save(BoardDTO dto);

	public void update(BoardDTO dto);

	public void delete(int num);

	public String getFile(int num);

}
