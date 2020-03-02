import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
public class Dummy {
    public static void main(String[] args) {
      BasicConfigurator.configure();
        Logger l=Logger.getLogger(Dummy.class.getName());
        l.info("hello");
    }
}
