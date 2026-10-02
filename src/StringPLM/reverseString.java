package StringPLM;

public class reverseString {
//    static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("vivek");
//        System.out.println("before reversing string =="+ sb);
//        for(int i= 0; i<sb.length()/2; i++){
//            int front=i;
//            int back = sb.length()-1-i;
//
//            char frontchar = sb.charAt(front);
//            char backchar= sb.charAt(back);
//
//            sb.setCharAt(front,backchar);
//            sb.setCharAt(back,frontchar);
//
//
//        }
//        System.out.println("after reversing string =="+ sb);
//
//
//    }

    public static void ReverseString(char[] s) {

        int n = s.length;
        for (int i = 0; i < n / 2; i++) {

            int front = i;
            int rear = n - 1 - i;

            // swap concept//
            char temp = s[front];
            s[front] = s[rear];
            s[rear] = temp;

        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        ReverseString(s);
        System.out.println(s);
    }
}