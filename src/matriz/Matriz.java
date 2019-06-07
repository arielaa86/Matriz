/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre un valor impar y mayor que cero");
        int cant = teclado.nextInt();

        
        while (cant % 2 == 0 || cant<1) {

            System.out.println("Entre un valor impar y mayor que cero");
            cant = teclado.nextInt();

        }
        
        
        
        

        String matriz[][] = new String[cant][2 * cant];

        for (int f = 0; f < cant; f++) {

            for (int c = 0; c < cant * 2; c++) {

                matriz[f][c] = " ";

            }

        }

        int paso = 0;
        int resta = 0;

        while (paso != cant) {

            if (paso % 2 == 0) {

                for (int f = resta; f < cant - resta; f++) {

                    matriz[f][paso] = "1";

                    matriz[f][cant * 2 - paso - 1] = "1";

                }

            } else {

                for (int f = resta; f < cant - resta; f++) {

                    matriz[f][paso] = "1";
                    matriz[f][cant * 2 - paso - 1] = "1";

                }

                resta = resta + 1;

            }

            paso++;

        }

        
        System.out.println("\n");
        
        for (int f = 0; f < cant; f++) {

            for (int c = 0; c < cant * 2; c++) {

                System.out.print(matriz[f][c] + " ");

            }

            System.out.println(" ");

        }
        
        System.out.println("\n");

    }

}
