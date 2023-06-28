package day_01;

public class C01_Variables {


    public static void main(String[] args) {

        //Bir variable olustur, yazdir
        int yas = 36;
        //syntax : veriable data turu + variable data isim =(atama operatörü) + variable deger  ;
        int sayi = 50;
        //Variable mizi "sayi" olarak tanimlamamizin sebebi dinamik olmasi icindir

        System.out.println(yas); //ctrl d ile satiri alt alta cogaltabiliriz
        System.out.println(yas); //ln => line next, yani islemi yap ve alt satira gec demektir
        System.out.println(yas);
        System.out.print(yas); //alt satira inmeden cikti yazmaya devam eder
        System.out.println(sayi);


        //sayi = 50 seklinde yazdır, sayi variable ini etiketiyle birlikte yazdirmaktir
        System.out.println("sayi = " + sayi);
        //tirnak icindeki ifadeler "string ifade" lerdir
        //"+" concatenation (birlestirme) yapar
        //ctrl alt L => kodlarimizi duzenlemeye yarar
        //soutv variable i etiketiyle birlikte yazdirma islemi yapar
        //variable data ismini yazıp nokta(.) ya bastıgımızda kısayolla saoutv secenekleri cikar
        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("yas = " + yas);

        //String bir variable olusturalim => non primitive bir data turu, "" icinde yazilir, buyuk harfle baslar
        String isim = "Ali";
        //isim variable ini etiketiyle yazdir
        System.out.println(isim);
        System.out.println(isim);
        System.out.println(isim);
        System.out.println("isim = " + isim);
        System.out.println("isim = " + isim);


        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagim: benimYasim ve bu variable in degeri yas variable nin degerine esit olsun
        //benimYasim variable degeri de yas variable nin degeri gibi 36 olsun
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);

        //onunIsmi variable nin degeri "Ali" olsun ve bunu kopyalama islemi ile yapalim
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);


        //camelCase  : buttonPrimaryHover
        //PascalCase : ButtonPrimaryHover
        //snake_case : button_primary_hover
        //kebab-case : BUTTON_PRIMARY_HOVER


        //Aynı satırda coklu variable deklare et
        int yil = 2023, ay = 5, gun = 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gün = " + gun);
        System.out.println("yil = " + yil);
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.print(gun+".");
        System.out.print(ay+".");
        System.out.println(yil);


        //Bir variable degerini guncelle
        //az önce olusturdugumuz isim variable nin degerini Veli olarak güncelle
        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        //Java yukaridan asagi ve soldan saga calisir (run-time programming)


        //Degişkenleri(variable) yazdır


        //Bir variable deklere et : x --> deklere etmek = tanimlamak -> data turu + data ismi
        double x;

        //Bir variable baslat : y
        double y = 12.5;

        //Başka bir variable başlat : z
        double z = 33; // java buraya yazdigimiz 33 degerini 33.00 olarak algıladı ve hata vermedi

        //x degişkenini y degişkeni ile başlat
        x = y; // bir variable, scope(kapsam) da / main method da sadece bir kez deklere edilebilir

        //Variable y'i guncelle
        y = 13.9; // ondalikli sayilarda "." kullaniriz

        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

}
