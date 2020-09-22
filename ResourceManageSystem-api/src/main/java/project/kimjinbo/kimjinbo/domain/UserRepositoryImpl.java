package project.kimjinbo.kimjinbo.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User("sunbo", "1234", "심선보", 24, "CS", "computer01", ""));
        users.add(new User("taehoon", "abcd", "김태훈", 24, "CS", "monitor01", ""));
        users.add(new User("jinyoung", "ㄱㄴㄷㄹ", "김진영", 25, "CS", "", "OS_01_02"));
    }
    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void signUp(String id, String pw) {
        users.add(new User(id, pw, "", 0, "", "", ""));
    }


    @Override
    public User findByLogin(String id, String pw) {
        return users.stream().filter(r -> r.getId().equals(id)).filter(r -> r.getPw().equals(pw)).findFirst().orElse(null);
    }

    @Override
    public Stream<User> findBorrowHW() {
        return users.stream().filter(r -> !r.getHaveHW().isEmpty());
    }

    @Override
    public Stream<User> findBorrowSW() {
        return users.stream().filter(r -> !r.getHaveSW().isEmpty());
    }

}
