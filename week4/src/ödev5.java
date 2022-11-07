//Adım1=Başla
//Adım2=klavyeden m cinsinden bir a uzunluğu al
//Adım3=mm,cm,dm,km seçtir
//Adım4=eğer mm seçtiyse a*1000 hesapla ve yazdır
//Adım5=eğer dm seçtiyse a*10 hesapla ve yazdır
//Adım6=eğer km seçtiyse a/1000 hesapla ve yazdır
//Adım7=eğer cm seçtiyse a*100 hesapla ve yazdır
//Adım8=bitir


import java.util.Scanner;
public class ödev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen m cinsinden bir uzunluk giriniz:");
        int a=input.nextInt();
      
       
       System.out.printf("\nDönüştürme\n1-cm\n2-mm\n3-dm\n4-km\n");
        
        
        System.out.println("\nSeciminiz:");
         int  secim=input.nextInt();
      
        if(secim==1){
            int cm=a*100;
          
            System.out.println("cm cinsinden değeri:"+cm);
            
        }
        else if (secim==2){
            int mm=a*1000;
               System.out.println("mm cinsinden değeri:"+mm);
        }
       else if(secim==3){
              int dm=a*10;
             System.out.println("dm cinsinden değeri:"+dm);
    }
        else if (secim==4){
            int km=a/1000;
            System.out.println("km cinsinden değeri:"+km);
        }
        else{
            System.out.println("sonuç sıfır");
        }
    
}
}

