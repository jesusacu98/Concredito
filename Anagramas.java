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
public class Anagramas 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        String cadena1;
        String cadena2;
        int bandera = 0;
        
        System.out.println("Metodo para saber si dos cadenas son anagramas");
        
        System.out.println("ingrese el valor para cadena 1: ");
        Scanner valor = new Scanner(System.in);
        cadena1 = valor.nextLine();
        int n = cadena1.length();
        char[] palabra1 = new char[n];
        
        System.out.println("ingrese el valor para cadena 1: ");
        Scanner valor2 = new Scanner(System.in);
        cadena2 = valor2.nextLine();
        int n2 = cadena2.length();
        char[] palabra2 = new char[n2];
        
        if (palabra1.length == palabra2.length)
        {
            for (int x=0; x<cadena1.length(); x++)
            {   
                char c = cadena1.charAt(x);
                palabra1[x] = c;

                for (int y=0; y<cadena2.length(); y++)
                {
                    char s = cadena2.charAt(y);
                    palabra2[y] = s;
                    if(palabra1[x] == palabra2[y])
                    {
                        bandera = bandera + 1;
                        break;
                    }
                    
                }
            }   
        }
        else
        {
            System.out.println("Las palabras deben de ser con la misma longitud");
        }
        System.out.println("valor de bandera= " + bandera);
        if (bandera == cadena1.length())
        {
            System.out.println("Las palabras son anagramas");
        }
        else
        {
            System.out.println("Las palabras no son anagramas");
        }        
    }   
}
