import javax.crypto.spec.DESKeySpec;

class Pen{
    String color;
    String type;

    public void write() {
    System.out.println("Writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    //Copy Constructor 
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    //Constuctor (non parametarised)  
     Student(){

     }


    //Constructor (Parametarised)

    // Student(String name, int age){
    //     this.name=name;
    //     this.age=age;
    // }


}
public class oop{

    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen1.write();


        // Pen pen2 = new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        //Student s1 = new Student("vina",20);
        // s1.name="Vina";
        // s1.age=20;

        //s1.printInfo();


        // Student s1 = new Student();
        // s1.name="vina";
        // s1.age=20;

        // Student s2 = new Student(s1);
        // s2.printInfo();




            
        //we do not write destructors in java because there is garbage collector in java



        //Polymorphism




    }

}