
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public class StudentApplication {

        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Nivi");
            Student s3 = new Student("Anu", 19, 5.0);
            s1.display();
            s2.display();
            s3.display();
        }
    }
}
