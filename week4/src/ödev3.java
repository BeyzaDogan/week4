//Adım1=Başla
//Adım2=kümeye ait eleman sayisini(n) klavyeden al ve oku
//Adım3=klavyeden beliritlen kombinasyon sayısını(r) al ve oku
//Adım4=f1=1,f2=1,f3=1,k=0
//Adım5=eğer i=1, 
//Adım6=eğer i>n ise git adım11
//Adım7=f1*=i hesapla
//Adım8=i++ ve git adım6
//Adım9=eğer i<=r f2*=i hesapla
//Adım10=eğer i<=n- r ise f3*=i hesapla
//Adım11=k=f1/(f2*f3) hesapla ve yazdır
//Adım12=bitir




import java.util.Scanner;

public class ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System .in);
      System.out.println("kümeye ait eleman sayısını giriniz:");
      int n=input.nextInt();
      System.out.println("belirtmek istediğiniz kombinasyon sayısını giriniz:");
      int r=input.nextInt();
      int f1=1;
      int f2=1;
      int f3=1;
      int k=0;
      
      for ( int i=1;i<=n;i++){
          f1*=i;
      
      if( i<=r){
          f2*=i;
      }
      if(i<=n-r){
          f3*=i;
      }
      }
      k=f1/(f2*f3);
      
      
      System.out.println(""+n+"in "+r+"li kombinasyonu:"+k);
          
      
    
}
}
