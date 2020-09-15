import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int n = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='b' ||str.charAt(i)=='c'){
                n+=1;
            }
        }
        return n;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int n = 0;
        for (int i = 0; i < str.length()-2; i++){
            if((str.charAt(i)=='T' | str.charAt(i)=='t') & (str.charAt(i+1)=='h' & str.charAt(i+2)=='e') ){
                n+=1;
            }
        }
        return n > 0;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String str_1 = "";
        for(int i = 0; i < str.length(); i++){
            str_1 += str.charAt(str.length() - i - 1);
        }
        return str_1.equals(str);
    }
    
    
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        System.out.println("Your string contains "+countABC(n)+" a's, b's, or c's");

        String b = new String();
        if(containsThe(n)){b = "DOES";}
        else{ b = "DOESNOT"; }
        System.out.println("Your string "+b+" contain the");

        String c = new String();
        if(isPalindrome(n)){ c ="";}
        else{c = "NOT";}
        System.out.println("Your string IS "+c+"a palindrome");

        // YOUR CODE HERE
    }
}
