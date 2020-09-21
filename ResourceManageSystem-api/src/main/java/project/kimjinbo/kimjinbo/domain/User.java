package project.kimjinbo.kimjinbo.domain;

public class User {
    private final String id;
    private final String pw;
    private final String name;
    private final int age;
    private final String major;
    private String haveHW;
    private String haveSW;


    public User(String id, String pw, String name, int age, String major, String haveHW, String haveSW) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.major = major;
        this.haveHW = haveHW;
        this.haveSW = haveSW;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getHaveHW() {
        return haveHW;
    }

    public String getHaveSW() {
        return haveSW;
    }
}
