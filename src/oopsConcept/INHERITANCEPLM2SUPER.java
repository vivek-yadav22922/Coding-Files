package oopsConcept;

public class INHERITANCEPLM2SUPER {
    public class Box {
      double length;
      double weidth;
      double height;



        public Box(double length, double weidth, double height) {
            this.length = length;
            this.weidth = weidth;
            this.height = height;
        }
    }
    public class BoxWight extends Box {
        double weight;

        /*public BoxWight(double weight) {
            this.weight = weight;
        }*/

        public BoxWight( double length, double weidth, double height, double weight){
                super(length, weidth, height);// super class automatically call//
                this.weight = weight;
            }
        }


     void main(String[] args) {
        BoxWight box= new BoxWight(45.2,25.6,12,36);
         System.out.println(box.height);
         System.out.println(box.length);
         System.out.println(box.weidth);
         System.out.println(box.weight);
    }

}

