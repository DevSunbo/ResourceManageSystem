package project.kimjinbo.kimjinbo.domain;

import java.util.List;
import java.util.stream.Stream;

public interface UserRepository {
    List<User> findAll();
    User findByLogin(String id, String pw);
    Stream<User> findBorrowHW();
    Stream<User> findBorrowSW();
}
