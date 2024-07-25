package m16_polymorphism;

/*
Object can take many forms:
Reference is PARENT class/interface
Object is CHILD class

WebDriver driver = new ChromeDriver();
 */

public class StudentObjects {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mike");
        student.setAge(33);
        student.setSchool("Cydeo");

        Person person = new Student();
        person.setAge(44);
        person.setName("Mike");
        //person.setSchool("MIT"); cannot access. reference decides accessible methods

        //UPCASTING. changing reference from child to parent class type
        Person p = student;
        System.out.println(p.getAge());

        //DOWNCASTING. changing reference from parent to child
        //benefit is ability to access child reference methods

        Student st = (Student) person;
        st.setSchool("Oxford");
        System.out.println(st.getName());

        //Student student2 = (Student) new Person(); classcast exception
    }
}
