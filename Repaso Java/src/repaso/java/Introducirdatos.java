
package repaso.java;

import java.util.Scanner;
public class Introducirdatos {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Dame un número: ");
        int num=scn.nextInt();
        System.out.println("Has introducido el número: "+num);
    }
}
