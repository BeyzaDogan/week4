//Adım1=başla
//Adım2=bir x değeri al ve oku
//Adım3= fx=x^2-5*x+3
//Adım4=eğer fx<0 ise "fonksiyon negatif"yazdır
//Adım5=eğer fx>0 ise "fonksiyon pozitf"yazdır
//Adım6=aksi takdirde "fonksiyon sıfırdır" yazdır
//Adım7=bitir



import java.util.Scanner;
public class ödev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir x değeri giriniz:");
        int x=input.nextInt();
      
        
         int fx=x*x-5*x+3;
         System.out.println("fonksiyon sonucu:"+fx);
        
        if(fx<0){
            System.out.println("fonksiyon negatif");
        }
        else if(fx>0){
            System.out.println("fonksiyon pozitif");
        }
        else {
            System.out.println("fonksiyon sıfıra eşittir");
        }
       
        
}
}
