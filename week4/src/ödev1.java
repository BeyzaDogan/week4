//Adım1=Başla
//Adım2=klavyeden bir pozitif sayi al
//Adım3=eğer i=1,
//Adım4=i>sayi ise git adım7
//Adım5= eğer sayi mod"i"sıfıra eşit ise "tam bölenidir" yazdır
//Adım6=i++ ;
//Adım6=git adım4
//Adım7=bitir




import java.util.Scanner;

public class ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System .in);
      System.out.println("bir pozitif sayı giriniz:");
      int x=input.nextInt();
      
      
      for(int i=1;i<=x;i++){
          if(x%i==0) {
           System.out.println("tam bölenidir:"+i);
          }
      }
              

    }
    
}
