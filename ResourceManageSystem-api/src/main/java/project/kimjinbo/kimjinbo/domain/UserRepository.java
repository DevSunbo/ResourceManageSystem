package project.kimjinbo.kimjinbo.domain;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findByLogin(String id, String pw);
}
