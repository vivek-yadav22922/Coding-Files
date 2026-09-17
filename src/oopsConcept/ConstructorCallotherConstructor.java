package oopsConcept;

public class ConstructorCallotherConstructor {
     public class Student{
         int roll;
         String name;
         float marks;



         Student(int roll, String name,float  marks){ // first construtor
             this.roll=roll;
             this.name=name;
             this.marks=marks;
         }

         Student(){
             this(13,"default value",99.8f);// here call first constructor//
         }

     }

           public  void main(String[] args) {
         Student Random= new Student();

               System.out.println(Random.marks);
               System.out.println(Random.roll);
               System.out.println(Random.name);

    }


}
