package oopsConcept;


public class Student { //create a class of student name and store marks,roll,name//

        int roll;
        String name;
        float marks = 90;// defaullt set value//



 public  void main(String[] args) {
     Student s1 = new Student();
     Student s2= new Student();
//     s1.roll = 123; // student s1 detals//
//     s1.marks = 96.5f;
//     s1.name = "vivek yadav";
//     System.out.println("name=" + s1.name);
//     System.out.println("marks=" + s1.marks);
//     System.out.println("roll=" + s1.roll);

     s2.marks=99.5f;
     s2.name="abhishek";
     s2.roll=145;
     System.out.println("name=" + s2.name);
     System.out.println("marks=" + s2.marks);
    System.out.println("roll=" + s2.roll);



 }

 }
