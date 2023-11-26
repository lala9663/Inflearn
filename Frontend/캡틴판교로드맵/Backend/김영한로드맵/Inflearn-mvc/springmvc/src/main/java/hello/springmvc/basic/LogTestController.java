package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController     // restController 는 반환 값으로 뷰를 찾는 것이 아니라, HTTP 메세지 바디에 바로 입력한다. 따라서 ok 메세지를 받을 수있다.
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // 이 부분이 Slf4j

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
//        System.out.println("name = " + name);   // 가능하면 이거 쓰지말고 log 사용하기

        log.trace(" trace log ={}", name);
//        log.trace(" trace log ={}"+ name);  // 자바에서는 + 가 우선이기 떄문에 name 인 Spring이 더해진다. 그래서 출력할 필요 없는 곳에서도 연산됨
        log.debug(" debug log ={}", name);  // 개발서버에서 보기 debug
        log.info(" info log ={}", name);    // 운영시스템에서 봐야할 정보
        log.warn(" warn log ={}", name);    // 경고
        log.error(" error log ={}", name);  // 에러(빨리 확인)

        return "ok";
    }
}
