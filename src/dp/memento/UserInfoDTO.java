package dp.memento;
//原发器,用户信息类
public class UserInfoDTO {
    private String account;
    private String password;
    private String telNO;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNO() {
        return telNO;
    }

    public void setTelNO(String telNO) {
        this.telNO = telNO;
    }

    public Memento saveMemento(){
        return new Memento(account,password,telNO);
    }

    public void restoreMemento(Memento memento){
        this.account=memento.getAccount();
        this.password=memento.getPassword();
        this.telNO=memento.getTelNo();
    }

    public void show(){
        System.out.println("Account:"+this.account);
        System.out.println("Password:"+this.password);
        System.out.println("telNo:"+this.telNO);
    }
}
