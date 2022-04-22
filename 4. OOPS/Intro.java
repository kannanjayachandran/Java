// Introduction to Object oriented programming.

public class Intro {

    public static void main(String[] args) {

        // Creating a new object of the class student
        Student s = new Student();

        // Printing the default values of the variable inside the object
        System.out.println(s.marks);
        System.out.println(s.roll_no);
        System.out.println(s.name);

        // Adding new data to the object
        s.marks = 80.5f;
        s.roll_no = 207022;
        s.name = "Godzilla";

        // Printing out the newly added values
        System.out.println(s.marks);
        System.out.println(s.roll_no);
        System.out.println(s.name);

        // Creating a new class while passing parameters to the constructor
        Student n = new Student(2000, "hello", 60.3f);
        System.out.println(n.marks);
        System.out.println(n.roll_no);
        System.out.println(n.name);

        // creating a new object without passing any parameters, it would call the
        // constructor with parameters through 'this' form the empty parameter
        // constructor.
        Student random = new Student();
        System.out.println(random.marks);
        System.out.println(random.roll_no);
        System.out.println(random.name);
    }

}

// Creating a new class
class Student {
    int roll_no;
    float marks;
    String name;

    // Creating a constructor
    Student() {
        this.name = "Godzilla";
        this.roll_no = 207022;
        this.marks = 89.5f;
    }

    // Creating a constructor with parameters and using this keyword to reference
    // the reference variable.
    Student(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    // This is an empty constructor -> inorder to run this comment out the student
    // constructor without any parameter

    // Student(){
    // // This is how we call a constructor from another constructor
    // this(100, "default name", 100f);
    // }

}
