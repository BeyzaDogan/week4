//Adım1=Başla
//Adım2=klavyeden bir tamsayı al
//Adım3=t1=0,t2=0,t3=0
//Adım4=eğer i=1;
//Adım5=i>n ise git adım15
//Adım6=ti+=i hesapla
//Adım7=i++ ve git adım5
//Adım8= eğer i=1 ve i+=2;
//Adım9=t2+=i hesapla
//Adım10=i=i+2 ve git adım5
//Adım11=eğer i=2 ve i=i+2; 
//Adım12=t3+=i hesapla
//Adım13=i=i+2 ve git adım5
//Adım14=t1,t2,t3 yazdır
//Adım15=bitir




import java.util.Scanner;

public class ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System .in);
      System.out.println("Bir adet tamsayı giriniz:");
      int n=input.nextInt();
      int t1=0;
      int t2=0;
      int t3=0;
     
      for(int i=1;i<=n;i++){
          t1+=i;
          
      }
      for(int i=1;i<=n;i+=2){
        t2+=i;
    }
      for(int i=2;i<=n;i+=2){
         t3+=i;
      }
      System.out.println("1 'den "+n+"e kadar olan sayıların toplamı:"+t1);
      System.out.println("1'den "+n+"e kadar olan tek sayıların toplamı:"+t2);
      System.out.println("1'den "+n+"e kadar olan çift sayıların toplamı:"+t3);
      

           
      
      }
      
              

    }
    

