package kopo.kimsojeong_prj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/index")
    public String main() throws Exception {
        log.info(this.getClass().getName() + ".index 페이지 보여주는 함수 실행");
        return "/index";
    }


}
