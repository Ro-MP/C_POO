package CursoPOOUber.Java;

public class Driver extends Account {
    String nickName;
    int score;
    

    public Driver (String id, String name, String document, String nickName) {
        super(id, name, document);
        this.nickName = nickName;
    }
    
}
