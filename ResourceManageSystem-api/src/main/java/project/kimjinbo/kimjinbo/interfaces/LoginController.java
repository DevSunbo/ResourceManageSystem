package project.kimjinbo.kimjinbo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/")
    public String hello(){
        return "아이디를 입력하세요 : \n 비밀번호를 입력하세요";
    }

}
