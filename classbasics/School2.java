// package classbasics;

class Teacher{
    String name;
    int salary;
    

    public void teach(String name, int salary) {
        // use parameters to print info
        System.out.println(name + " is teaching with a salary of " + salary);
    }

    public void printSalary(){
        System.out.println(this.salary);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("The name is " + this.name + " and age is " + this.age);
    }

    Student(){
        System.out.println("Default constructor called");
    }
    Student(String name, int age){
        System.out.println("Parametrized constructor called");
        this.name=name;
        this.age=age;
    }
    Student(Student realstudent){
        System.out.println("Copy Constuctor called");
        this.name=realstudent.name;
        this.age=realstudent.age;
    }
}

public class School2 {
    public static void main(String[] args) {
        // Teacher teacher1 = new Teacher();
        // teacher1.name="Giva";
        // teacher1.salary=12000;
        //teacher1.teach(teacher1.name, teacher1.salary);
        //teacher1.printSalary();

        // Student student1 = new Student();
        // student1.name = "Piyush";
        // student1.age = 23;
        Student student2 =new Student("Ayush",19);

        // student1.printInfo();
        // student2.printInfo();

        Student student3 = new Student(student2);
        student3.printInfo();
    }

}
