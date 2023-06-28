package day_01;

public class C03_Ortalama {

    /*
    double num1 = 23.4;
    double num2 = 24.0;
    double num3 = 12;
    double num4 = 450.3;
    double num5 = 100;
    Bu sayılarin ortalamasini hesaplayan bir kod yaziniz.
    */

    public static void main(String[] args) {

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        //double data turunde ismi toplam olan bir variable olusturalim
        //ve bu variable ye yazdigimiz sayinin toplamini assign (atayalim) edelim

        double toplam = num1 + num2 + num3 + num4 + num5;
        // sayisal (numeric) datalarda "+" isareti matematiksel toplama islemi yapar
        System.out.println("toplam = " + toplam);//609.7

        //ortalama = toplam / sayi adedi
        double ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama);//121.94000000000001
        System.out.println("ortalama = " + ortalama);
        System.out.println(ortalama);


    }

}
