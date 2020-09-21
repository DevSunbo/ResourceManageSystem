package project.kimjinbo.kimjinbo.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.kimjinbo.kimjinbo.domain.User;
import project.kimjinbo.kimjinbo.domain.UserRepositoryImpl;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepositoryImpl userRepository;

    @GetMapping("/users")
    public List<User> list(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/user/{id},{pw}")
    public User userInfo(@PathVariable("id") String id, @PathVariable("pw") String pw){
        User user = userRepository.findByLogin(id, pw);
        return user;
    }
}
