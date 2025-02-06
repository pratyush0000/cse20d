package classbasics;

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


public class Schoolx {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name="Giva";
        teacher1.salary=12000;

        teacher1.teach(teacher1.name, teacher1.salary);
        teacher1.printSalary();
    }

}
