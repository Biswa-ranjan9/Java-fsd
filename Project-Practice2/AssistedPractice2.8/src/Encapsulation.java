
public class Encapsulation {
    private String name;
    private int age;
    private String studentId;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public static void main(String[] args) {

    	Encapsulation student = new Encapsulation();
        student.setName("Bablu");
        student.setAge(24);
        student.setStudentId("123456");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
