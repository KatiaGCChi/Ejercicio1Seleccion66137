/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66137;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class Ejercicio1Seleccion66137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 ;
        int num2 ;
        int num3 ;

        Scanner MiConsola= new Scanner (System.in) ;
        System.out.println ("Dime el primer numero: ") ;
        num1=MiConsola.nextInt();
        
        System.out.println ("Dime el segundo numero: ") ;
        num2=MiConsola.nextInt() ;
        
        System.out.println ("Dime primer numero: ") ;
        num3 = MiConsola.nextInt() ;
        
        if (num1>num2 && num1>num3) {
           
            System.out.println ( "El numero con mayor valor es: " + num1) ;
            
    } else if (num2>num1 && num2>num3){ 
        
            System.out.println ( "El numero con mayor valor es: " + num2) ; 
            
        } else {
        
            System.out.println ( "El numero con mayor valor es: " + num3) ;
            
            
            }
    
}
}
    

