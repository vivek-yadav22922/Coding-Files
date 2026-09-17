package oopsConcept;

public class INHERITANCESPLM {
    public class Boy {
        int roll;
        int marks;
        String name;

    }

    public class Girls extends Boy {
        String Addres;

    }

     void main(String[] args) {
        Boy B= new Boy();
        B.marks=45;
        B.name="vivek";
        B.roll=1234;
        Girls G= new Girls();
        G.name="prity";
        G.marks=46;
        G.roll=321;
        G.Addres="belghat";
         System.out.println(B.name);
         System.out.println(G.name);
         System.out.println(B.marks);
         System.out.println(G.marks);
         System.out.println(B.roll);
         System.out.println(G.roll);
         System.out.println(G.Addres);


     }
}