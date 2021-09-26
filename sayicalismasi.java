import java.util.Scanner;

public class sayicalismasi {
    public static void main(String[] args) {
        // import sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // değişkenleri tanımla
        int n, total = 0;

        // kullanıcıdan input,hesap

        do{
            System.out.println("Sayı giriniz ");
            n = inp.nextInt();
            if(n%4==0){
                total += n;            
            }
        }while(n%2==0);

        System.out.println("Toplam = " + total);

    }
    
}
