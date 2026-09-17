package StringPLM;

public class reverseString {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vivek");
        System.out.println("before reversing string =="+ sb);
        for(int i= 0; i<sb.length()/2; i++){
            int front=i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar= sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);


        }
        System.out.println("after reversing string =="+ sb);


    }
}
