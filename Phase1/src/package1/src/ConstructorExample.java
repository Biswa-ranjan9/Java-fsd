package package1.src;

public class ConstructorExample {
    private int id;
    private String name;
   

    // Default Constructor
    public ConstructorExample() {
        this.id = 0;
        this.name = "Default Name";
        
    }

    // Parameterized Constructor
    public ConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public ConstructorExample(ConstructorExample other) {
        this.id = other.id;
        this.name = other.name;
        
    }

    // Instance method to display id, name
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
       
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        ConstructorExample defaultConstructorExample = new ConstructorExample();
        System.out.println("Default Constructor Output:");
        defaultConstructorExample.displayInfo();
        System.out.println();

        // Creating an object using the parameterized constructor
        ConstructorExample parameterizedConstructorExample = new ConstructorExample(1, "Ranjan");
        System.out.println("Parameterized Constructor Output:");
        parameterizedConstructorExample.displayInfo();
        System.out.println();

        // Creating an object using the copy constructor
        ConstructorExample originalExample = new ConstructorExample(2, "Biswa");
        ConstructorExample copyConstructorExample = new ConstructorExample(originalExample);
        System.out.println("Copy Constructor Output:");
        copyConstructorExample.displayInfo();
    }
}
