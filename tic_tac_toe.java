/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concredito;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class tic_tac_toe 
{
    public static void main(String[] args)
    {
        int [] gato = new int [9];
        int bandera = 0;
        
        for (int x=0; x<gato.length; x++)
        {
            Scanner valor = new Scanner(System.in);
            int mama = valor.nextInt();
            if (mama == 1 || mama == 0)
            {
                gato[x] = valor.nextInt();
            }
            else
            {
                System.out.println("Por favor ingrese 1 o 0");
            }
        }
        
        //Horizontales
        if (gato[0] == 1 && gato[1] == 1 && gato[2] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (gato[3] == 1 && gato[4] == 1 && gato[5] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (gato[6] == 1 && gato[7] == 1 && gato[8] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (bandera == 1)
        {
            System.out.println("Ganaste");
        }
        
        //Verticales
        else if (gato[0] == 1 && gato[3] == 1 && gato[6] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (gato[1] == 1 && gato[4] == 1 && gato[7] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (gato[2] == 1 && gato[5] == 1 && gato[8] == 1)
        {
            System.out.println("Ganaste");
        }
        
        //Esquineadas
        else if (gato[0] == 1 && gato[4] == 1 && gato[8] == 1)
        {
            System.out.println("Ganaste");
        }
        else if (gato[2] == 1 && gato[4] == 1 && gato[6] == 1)
        {
            System.out.println("Ganaste");
        }
        
        for(int a=0; a<gato.length; a++)
        {
            System.out.print("Gato" + gato[a]);
        }
    }
}
