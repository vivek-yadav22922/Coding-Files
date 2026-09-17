package BACKTRACKING;


// question is that suppose we have 3 students ABC arrange these students  3 possible space //
// Total permutation = n! //
public class backtracking {
    public static void print_permutation(String str,String perm,int idx){
        if(str.length() ==0){
            System.out.println(perm);
            return;
        }
for(int i=0; i<str.length(); i++){
    char currchar= str.charAt(i);// store first charater because first charater not repeat again//
    String newStr = str.substring(0,i)+str.substring(i+1);// here add string //
    print_permutation(newStr,perm+currchar,idx); // recusively call //


}

    }

    static void main(String[] args) {
        String str= "ABC";


        print_permutation(str,"",0);
    }

}
