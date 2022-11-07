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

public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner (System .in);
          System.out.println("bir n sayısı al:");
          int n=input.nextInt();
          int S=1;
          int tek_toplam=0;
          int cift_toplam=0;
          while(S<=n)
          {
              if(S%2!=0)
              {
              tek_toplam=tek_toplam+S;
              }
              else
              {
               cift_toplam=cift_toplam+S;   
                  
              } 
              S=S+1;
          }
              
             System.out.println("tek toplam:"+tek_toplam+"ve çift toplam:"+cift_toplam);
            
                
                          
                  
                      
                     
                   
                  
                  
                      
              }    
          }

        
    
    

