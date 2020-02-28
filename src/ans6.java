import java.util.*;

//Q6. Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age}.
class Student implements Comparable<Student>{
    String name;
    Double score;
    Double age;
    Student(String name,Double score,Double age){
        this.name=name;
        this.score=score;
        this.age=age;
    }

    @Override
    public int compareTo(Student s1) {
        if(score<s1.score){
            return -1;
        }else if(score>s1.score){
            return +1;
        }else{
            return name.compareTo(s1.name);
        }
    }
}
class ans6 {
    public static void main(String[] args) {
        Student s1=new Student("Ammar",82.0,23.0);
        Student s2=new Student("Yasir",86.0,24.0);
        Student s3=new Student("Shayan",86.0,25.0);
        List <Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        for (Student s:list) {
            System.out.println(s.name+" "+s.score);
        }
    }
}




