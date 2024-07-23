package m12_oop_inheritance;

public class Parent {
    String word = "hi";

    public void methodA() {
        System.out.println("MethodA from Parent");
    }
}

class ChildA extends Parent {
}

class ChildB extends Parent {
}

class Runner {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("word from Parent = " + p.word);
        p.methodA();

        ChildA childA = new ChildA();
        ChildB childB = new ChildB();

        System.out.println("word from childA = " + childA.word);
        System.out.println("word from childB = " + childB.word);
        childA.methodA();
        childB.methodA();
    }
}
