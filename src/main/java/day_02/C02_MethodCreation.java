package day_02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn    : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10
        */


        Scanner scan = new Scanner(System.in);
        //kullanicidan veri alacaksak mutlaka scanner objesini olusturmaliyiz

        //mesaj
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        //Ikinci sayi icin mesaj
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("swaptan once sayi1: "+ sayi1);
        System.out.println("swaptan once sayi2: "+ sayi2);

        swaplaYazdir(sayi1,sayi2);

        //main method ıcınden method olustururken
        //1. methoda verecegın ismi yaz(ozelısım)
        //2. method parantezini koy
        //3.parantezin içine varsa argumentlerini yaz
        swaplaYazdir(sayi1, sayi2);//main methodun icinde argument
    }
    private static void swaplaYazdir(int sayi1, int sayi2) //parametre
    {
        int sayi3;
        sayi3 = sayi1;//burdan sonra sayi1 i bosaltabilirim degistirebilirim sayi3 =10
        sayi1 = sayi2;//sayi1 de 20 var, sayi2 yi degıstırebılırım
        sayi2 = sayi3;//sayi2 10 olmus oldu
        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);
    }
}
