//Adım1=Başla
//Adım2=kesrin pay(a) kısmını klavyeden al
//Adım3=klavyeden payda(b) kısmını al
//Adım4=c=a/b
//Adım5=r=0
//Adım6=belirtmek istenen basamağı(n)klavyeden al
//Adım7=eğer i=1;
//Adım8=eğer i>n ise git adım12
//Adım9=r=c%10 hesapla
//Adım10=c=c/10 hesapla
//Adım11=i++ ve git adım8
//Adım12=sonuç yazdır
//Adım13=bitir




import java.util.Scanner;

public class ödev7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner input=new Scanner(System.in);
               System.out.println("kesrin pay kısmını giriniz:");
               double a=input.nextDouble();
               System.out.println("kesrin payda kısmını giriniz:");
               double b=input.nextDouble();
               double c=a/b;
               double r=0;
               System.out.println("kaçıncı basamağı öğrenmek istiyorsunuz:");
               double n=input.nextInt();
               for(double i=1;i<=n;i++){
               r=c%10;
               c=c/10;
               }
               System.out.println(r);
                      
                       

    }
    
}
