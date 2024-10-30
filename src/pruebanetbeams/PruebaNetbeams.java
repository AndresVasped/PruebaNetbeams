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
        System.out.println("la multiplicacion es "+multiplica(5,6));
    }
    private static int suma(int x,int y)
    {
        return x+y;
    }
     private static int resta(int x,int y)
    {
        return x-y;
    }
    private static int multiplica(int x, int y)
    {
        return x*y;
    }
    
}
