package CursoPOOUber.Java;

public class User extends Account{

    String nickName;

    public User (String id, String name, String document, String nickName) {
        super(id, name, document);
        this.nickName = nickName;
    }
}
