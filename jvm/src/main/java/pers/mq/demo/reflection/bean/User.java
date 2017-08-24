package pers.mq.demo.reflection.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-24
 * Time: 下午2:04
 */
public class User {

    private Integer id;
    private Integer age;
    private String userName;

    public User() {

    }

    public User(Integer id, Integer age, String userName) {
        this.id = id;
        this.age = age;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
