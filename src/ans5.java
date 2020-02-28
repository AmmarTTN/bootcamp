import java.util.*;

//Q5. Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
class Employee{
    Double age;
    Double salary;
    String name;
    Employee(Double age,Double salary,String name){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

}
class myComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        if(e1.salary>e2.salary){
            return +1;
        }else if(e1.salary<e2.salary){
            return -1;
        }else{
            return 0;
        }
    }
}
class ans5 {
    public static void main(String[] args) {
        Employee e1=new Employee(27.0,90000.0,"Ammar");
        Employee e2=new Employee(30.0,78000.0,"Anuj");
        Employee e3=new Employee(28.0,100000.0,"Ayush");
        List <Employee> list= new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Collections.sort(list,new myComparator());
        for (Employee employee : list) {
            System.out.println(employee.name+" "+employee.salary);
        }
    }
}
