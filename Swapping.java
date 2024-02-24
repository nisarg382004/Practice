import java.util.*;

class Swapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter 1st String:");
        s1 = s.nextLine();
        System.out.println("Enter 2nd String:");
        s2 = s.nextLine();
        System.out.println("Before swapping,s1=" + s1 + ",s2=" + s2);

        // Swapping two strings using third variable temp.
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("After swapping,s1=" + s1 + ",s2=" + s2);
    }
}