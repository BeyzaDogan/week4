/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
 import java.util.Scanner;

public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner (System .in);
           System.out.println("alt sınırı giriniz:");
           int alt_sinir=input.nextInt();
           System.out.println("üst sınırı giriniz:");
           int ust_sinir=input.nextInt();
          
          for(int i=alt_sinir; i<=ust_sinir;i++) {
              if (i%3==0 || i%4==0) {
                  System.out.println(i);
              }
               
           }

    }
    
    
}
