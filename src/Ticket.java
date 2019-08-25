import javax.swing.*;
public class Ticket {
    public static void main(String[] args) {
        int age;
        int count = 0;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            age = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE AGE"));


            if (age >= 18) {
                System.out.println("ENTRY ALLOWED");
                count++;
            } else if(age<18) {
                System.out.println("NO ENTRY ALLOWED");
                c++;
            }
        }
        System.out.println(count +""+"are allowed");
        System.out.println(c+""+"are not allowed");
        System.out.println(count*20 +"% are allowed");



    }
}