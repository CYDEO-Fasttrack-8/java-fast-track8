package m11_oop_constructor_static;
/*
BY DEFAULT Compiler adds:
    - no args default constructor
    - super() call to parent class constructor
    - extending Object class
    - importing java.lang package
*/
import java.lang.*;

public class Student extends Object {
    //if we do not add any constructor, compiler will add one.
    //no-args default constructor
    public Student(){
        super();//call to Object class constructor
    }
}

class StudentObjects {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
    }
}
