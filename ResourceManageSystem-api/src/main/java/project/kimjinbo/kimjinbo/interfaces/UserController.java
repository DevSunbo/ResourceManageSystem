package project.kimjinbo.kimjinbo.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.kimjinbo.kimjinbo.domain.User;
import project.kimjinbo.kimjinbo.domain.UserRepositoryImpl;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class UserController {
    @Autowired
    private UserRepositoryImpl userRepository;

    @GetMapping("/users")
    public List<User> list(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/user/id:{id}?pw:{pw}")
    public User userInfo(@PathVariable("id") String id, @PathVariable("pw") String pw){
        User user = userRepository.findByLogin(id, pw);
        return user;
    }

    @PostMapping("/user")
    public void postUserInfo(@RequestBody User userRequest){
        userRepository.signUp(userRequest.getId(), userRequest.getPw());
        return;
    }

    @GetMapping("/users/hw")
    public Stream<User> borrowHWUser(){
        Stream borrowHwUsers = userRepository.findBorrowHW();
        return borrowHwUsers;
    }

    @GetMapping("/users/sw")
    public Stream<User> borrowSWUser(){
        Stream borrowSwUsers = userRepository.findBorrowSW();
        return borrowSwUsers;
    }

    @GetMapping("/users/nowResource")
    public Stream<User> borrowAll(){
        Stream borrowHwUsers = userRepository.findBorrowHW();
        Stream borrowSwUsers = userRepository.findBorrowSW();
        return Stream.concat(borrowHwUsers, borrowSwUsers).distinct();
    }

}
