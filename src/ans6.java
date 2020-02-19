import java.io.IOException;

public class ans6 {
    public static void main(String[] args) {
        try{
            throw new IOException("Throw IO Exception.....");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }
}
