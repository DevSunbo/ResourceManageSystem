package project.kimjinbo.kimjinbo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User("sunbo", "1234", "심선보", 24, "CS", "PC"));
        users.add(new User("taehoon", "abcd", "김태훈", 24, "CS", "노트북"));
        users.add(new User("jinyoung", "ㄱㄴㄷㄹ", "김진영", 24, "CS", "아이패드"));
    }
    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findByLogin(String id, String pw) {
        return null;
    }
}
