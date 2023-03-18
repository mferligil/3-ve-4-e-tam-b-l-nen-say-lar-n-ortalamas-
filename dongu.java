import java.util.Scanner;

public class dongu {
    public static void main(String[] args) {
        int k;
        double toplam=0;
        double sayac=0;
        Scanner inp=new Scanner(System.in);

        System.out.println("Sayı giriniz :");
        k=inp.nextInt();

        for (int i=0; i<=k; i++){
            if((i % 3==0) && ( i % 4==0)){
              toplam+=i;
              sayac+=1;
            }


        }
        double ort=toplam/sayac;
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4e tam olarak bölünen sayıların ortalaması:"+ort);

    }
}
