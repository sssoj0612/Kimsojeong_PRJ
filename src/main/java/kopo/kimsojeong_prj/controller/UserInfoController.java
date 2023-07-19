package kopo.kimsojeong_prj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class UserInfoController {
    /* 회원가입 화면으로 이동 */
    @GetMapping(value = "/login_register_modal")
    public String login_register_modal() {
        log.info(this.getClass().getName() + ".login_register_modal 페이지 보여주는 함수 실행");
        return "/login_register_modal";
    }
}
