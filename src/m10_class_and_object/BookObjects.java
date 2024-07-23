package m10_class_and_object;

public class BookObjects {
    public static void main(String[] args) {
        Book book1 = new Book(100, "Mike");
        Book book2 = new Book();
        //instance variable are accessed using object
        System.out.println(book1.author);
        System.out.println(book1.length);

        //static variable can be accessed using class name
        System.out.println(Book.publisher);
        //can also access using object
        System.out.println(book1.publisher);

        //instance method is called using object
        book1.read();

        //static method can be called using classname
        Book.entertainment();
    }
}
