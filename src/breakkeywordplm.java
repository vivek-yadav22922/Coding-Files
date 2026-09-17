public class breakkeywordplm {
    static void main() {
        int num =1;
        while(true){
            if((num%5==0)&&(num%7==0)){
                System.out.print("multiple of 5 and 7 =");
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
