package m11_oop_constructor_static;

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
