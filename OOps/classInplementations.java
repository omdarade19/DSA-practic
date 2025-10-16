package OOPs;

//Class initialization is the process where the Java Virtual Machine (JVM)
//loads a class into memory and sets up its static variables, static blocks,
//and other class-level configurations before any object of that class
//is created or static method is called.

public class classInplementations {
    static int a = 10;  // static variable
    static int b;       // static variable

    static {
        System.out.println("Static block executed");
        b = a * 2;
    }

    static void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        classInplementations.display();
    }

}
