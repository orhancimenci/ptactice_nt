package day_01;

public class C06_MethodCreation {

    public static void main(String[] args) {
        //kare prizmanın hacmini bulan ve donduren bir method yaziniz
        //not: kare prizma hacmi -> taban alanı x yukseklık -> a*a*h
        int tabanKenar=4;
        int yukseklik=7;
        // tabankenarı 3 yukseklıgı 4 olan prızmanın hacmı-> 3*3*4=36
        System.out.println(karePrizmaHacimBul(4, 7));
        System.out.println(karePrizmaHacimBul(tabanKenar, yukseklik));
    }

    //access mod + static keyword + return type + isim (){}
    //public, default, private, protected

    public static int karePrizmaHacimBul(int tabanKenar, int yukseklik){
        int hacim=tabanKenar*tabanKenar*yukseklik;
        return hacim;


    }

}
