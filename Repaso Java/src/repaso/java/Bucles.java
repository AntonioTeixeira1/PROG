
package repaso.java;

import java.util.Scanner;
public class Bucles {
   
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        System.out.print("Dame un número: ");
        int a=scn.nextInt();
        System.out.print("Dame otro número: ");
        int b=scn.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("REPITE ESTO N VECES SIENDO N EL PRIMER NUMERO INTRODUCIDO");
        }
        while(b>0){
            System.out.println("REPITE ESTO N VECES SIENDO N EL SEGUNDO NUMERO INTRODUCIDO");
            b--;
        }
    }
}
