import bean.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import services.StudentClassService;
import java.util.Scanner;

@Component
public class MainComponent {

    @Reference
    StudentClassService studentClassService;

}
