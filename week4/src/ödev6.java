//Adım1=Başla
//Adım2=klavyeden bir sayı al
//Adım3=a<0 ise git adım7
//Adım4=a%10;
//Adım5=a/=10;
//Adım6=alınan sayının tersini yazdır
//Adım7=bitir






import java.util.Scanner;
public class ödev6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       System.out.print("Lütfen bir sayı giriniz:");
       int a=input.nextInt();
       
        while(a>0){
            System.out.print(a%10);
             a/=10;
        }
        
          
           
       
       
            System.out.print("seçtiğiniz sayının ters yazılışı");
               
       
       
      
           
    
    }
}
       
    

       
       
       
           
       

    
    

