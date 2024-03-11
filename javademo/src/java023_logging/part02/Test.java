package java023_logging.part02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

//	private final Logger log = LoggerFactory.getLogger(getClass());

	private static final Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		log.trace("trace message");   	// 상세한 정보 표시
		log.debug("debug", "message");	// 디버깅 정보 표시
		log.info("info message");		// 정보성 로그 표시
		log.warn("warn message");		// 시스템 에러 표
	    log.error("error message");		// 요청 처리 발생
		
		
	}

}
