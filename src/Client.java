import dp.memento.UserInfoDTO;
import dp.memento.Caretaker;

public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();  //创建负责人

        user.setAccount("gao123");
        user.setPassword("123456");
        user.setTelNO("12345678909");
        System.out.println("状态一:");
        user.show();
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("=============================================");

        user.setPassword("000000");
        user.setTelNO("09876543212");
        System.out.println("状态二:");
        user.show();
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("=============================================");

        user.restoreMemento(c.getMemento());//从备忘录里面恢复
        System.out.println("回到状态一:");
        user.show();
        System.out.println("=============================================");
    }
}
