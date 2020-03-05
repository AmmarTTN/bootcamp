package services;

import bean.Student;
import org.osgi.service.component.annotations.Component;


public interface StudentClassService {
    void addStudent();
    void deleteStudent(int id);
    Student getStudent(int id);
    void getAllStudents();

}
