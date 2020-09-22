package project.kimjinbo.kimjinbo.domain;

import java.util.List;
import java.util.stream.Stream;

public interface UserRepository {
    List<User> findAll();
    //void signUp(String id, String pw, String name, int age, String major, String haveHW, String haveSW);
    void signUp(String id, String pw);
    User findByLogin(String id, String pw);
    Stream<User> findBorrowHW();
    Stream<User> findBorrowSW();
}
