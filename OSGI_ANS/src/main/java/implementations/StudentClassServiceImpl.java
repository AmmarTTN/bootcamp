package implementations;

import bean.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import services.ClassConfigurationService;
import services.StudentClassService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@Component(service= StudentClassService.class)
public class StudentClassServiceImpl implements StudentClassService {

    @Reference
    ClassConfigurationService classConfigurationService;

    ArrayList<Student> list=new ArrayList<Student>();

        public void addStudent () {
            if(!classConfigurationService.isClassLimitReached(list)) {
                System.out.println("enter id name age and marks respectively");
                Scanner sc = new Scanner(System.in);
                Student student = new Student();
                student.setId(sc.nextInt());
                sc.nextLine();
                student.setName(sc.nextLine());
                student.setAge(sc.nextInt());
                student.setMarks(sc.nextInt());
                list.add(student);
            }else{
                System.out.println("Limit reached");
            }
    }

    public void deleteStudent(int id){
        list.remove(getStudent(id));
    }


    Boolean isStudentPassed(int id){
        if(getStudent(id).getMarks() >= classConfigurationService.getPassingMarks()){
                return true;
        }else{
            return false;
        }
    }

     public Student getStudent(int id){
        return list.stream().filter(student -> student.getId()==id).findFirst().orElse(null);
    }

    public void getAllStudents(){
        list.stream().forEach(System.out::println);
    }
    @Activate
    void demoStudents(){
        Student student=new Student(1,22,"Adnan",100);
        list.add(student);
        Student student1=new Student(2,22,"Don",10);
        list.add(student1);
        Student student2=new Student(3,22,"zack",80);
        list.add(student2);

    }
    @Activate
    void activate(){
        demoStudents();

        int id;
        while(true) {
            System.out.println("choose\n1.add student\n2.delete student\n3.get student\n4.display all students\n5.get passing marks\n6.Is student passed");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                   addStudent();
                    break;
                case 2:
                    System.out.println("enter id");
                    id = sc.nextInt();
                    deleteStudent(id);
                    break;
                case 3:
                    System.out.println("enter id");
                    id = sc.nextInt();
                    System.out.println(getStudent(id));
                    break;
                case 4:
                    getAllStudents();
                    break;
                case 5:
                        System.out.println(classConfigurationService.getPassingMarks());
                    break;
                case 6:
                    System.out.println("enter id");
                    System.out.println(isStudentPassed(sc.nextInt()));
                    break;
                default:
                    System.out.println("wrong choice");
                    System.exit(0);
                    break;
            }
        }

    }


}
