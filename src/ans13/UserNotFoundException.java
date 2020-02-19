package ans13;

public class UserNotFoundException extends Exception {
    private String message;
    public UserNotFoundException(String message){
        this.message=message;
    }
    @Override
    public String toString(){
        return message;
    }
}
