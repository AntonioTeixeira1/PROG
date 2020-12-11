
package repaso.java;

import java.util.Scanner;
public class General {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.print("Dame un número: ");
        int a=scn.nextInt();
        System.out.println("Voy a repetir la palabra hola "+a+" veces");
        for (int i = 0; i < a; i++) {
            System.out.println("hola");
        }
        System.out.println("¿Es "+a+" mayor que 10?");
        if (a>10) {
            System.out.println("Si lo es");
        }else{
            System.out.println("No lo es");
        }
        long blv=a*1312158;
        System.out.println("Sabías que "+a+" euros son "+blv+" bolivares(aprox)");
        System.out.println("Voy a crear un array con "+a+"posiciones");
        int[]arr= new int [a];
        System.out.println("Ahora la voy a llenar de numeros entre 0 y 10");
        for (int i = 0; i < a; i++) {
            arr[i]=(int)(Math.random()*10);
        }
        System.out.println("Ahora te enseño el contenido");
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
