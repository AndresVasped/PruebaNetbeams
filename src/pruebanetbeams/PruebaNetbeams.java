/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebanetbeams;

/**
 *
 * @author VASQUEZ
 */
public class PruebaNetbeams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //sstem.out.println();
        System.out.println("La suma es "+suma(5,6));
        System.out.println("la resta es "+resta(5,6));
        for(int i=0;i<5;i++)
        {
           System.out.println("eso que hpts");
        }
  
    }
    private static int suma(int x,int y)
    {
        return x+y;
    }
     private static int resta(int x,int y)
    {
        return x-y;
    }
    
}
