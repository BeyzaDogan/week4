//Adım1=Başla
//Adım2=klavyeden n sayısını gir ve oku
//Adım3=S=1 ; faktoriyel=1;
//Adım4=eğer S>n,Adım 9'a git
//Adım5=faktöriyel=faktoriyel*S;
//Adım6=S=S+1;
//Adım7=Adım 4'e git
//Adım8=faktoriyel yazdır
//Adım9=Bitir
 import java.util.Scanner;

public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System.out.print("bir n sayısı giriniz:");
        int n=input.nextInt();
        int S=1;
        int faktoriyel=1;
        while(S<=n)
        {
       faktoriyel*=S;
        S=S+1;
        }
      
 
        System.out.println("faktoriyel çarpım:"+faktoriyel);
                
        
        
         
                

    }
    
}
