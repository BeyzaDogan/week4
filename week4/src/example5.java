//Adım1=Başla
//Adım2=Klavyeden bir n sayısı al ve oku
//Adım3=n  

 import java.util.Scanner;

public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System .in);
         System.out.println("bir pozitif tamsayı girin:");
         int N=input.nextInt();
         int toplam=0;
         
         while (N>0)
         {
        int kalan=N%10;
        toplam+=kalan;
        N=N/10;
         
         
         }
         
       System.out.println("basamak toplamı:"+toplam);

    }
    
}
