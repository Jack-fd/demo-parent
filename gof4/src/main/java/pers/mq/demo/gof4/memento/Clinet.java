package pers.mq.demo.gof4.memento;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:58
 */
public class Clinet {

    public static void main(String[] args) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setAccount("test1");
        userInfoDTO.setPassword("test1");
        userInfoDTO.setTelNo("test1");
        userInfoDTO.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(userInfoDTO.saveMemento());

        userInfoDTO.setAccount("test2");
        userInfoDTO.setPassword("test2");
        userInfoDTO.setTelNo("test2");
        userInfoDTO.show();

        userInfoDTO.restoreMemento(caretaker.getMemento());
        userInfoDTO.show();
    }
}
