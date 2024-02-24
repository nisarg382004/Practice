import java.util.*;

class ReverseS {
    public static void main(String[] args) {
        String s, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        s = sc.nextLine();
        System.out.println("The Original string:" + s);
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        System.out.println("The reverse string is:" + reverse);
    }
}