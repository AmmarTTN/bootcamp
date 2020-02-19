//Q13. Create a custom exception that do not have any stack trace.
package ans13;
public class customException {
    public static void main(String[] args){
        customException exp=new customException();
        try{
            exp.getUser();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    String getUser() throws UserNotFoundException{
        throw new UserNotFoundException("user not found");
    }
}
