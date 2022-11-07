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

public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner input = new Scanner (System .in);
     System.out.println("BİR SAYI GİRİN:");
     int n=input.nextInt();
     boolean asalmi=true;//varsayim
     for(int i=2;i<n;i++){
         if (n%i==0){
             asalmi=false;
         }
     }
     if (asalmi==true && n!=0)  {   
              System.out.println("sayı asaldır");
     }
         else {
         System.out.println("sayı asal değildir");
                 
     }
    }
}
     
        

   
    
