import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fName1, fName2;
        int dmg1,hlth1,w1,dodge1;
        int dmg2, hlth2, w2, dodge2;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk savaşçının adını giriniz: ");
        fName1 = input.nextLine();
        System.out.print(fName1 + " Savaşcısının hasar değerini giriniz: ");
        dmg1 = input.nextInt();
        System.out.print(fName1 + " Savaşcısının sağlık değerini giriniz: ");
        hlth1 = input.nextInt();
        System.out.print(fName1 + " Savaşçısının ağırlığını giriniz: ");
        w1 = input.nextInt();
        System.out.print(fName1 + " Savaşçısının hasar bloklama yüzdesini giriniz: ");
        dodge1 = input.nextInt();

        input.nextLine(); //

        System.out.print("İkinci savaşçının adını giriniz: ");
        fName2 = input.nextLine();
        System.out.print(fName2 + " Savaşcısının hasar değerini giriniz: ");
        dmg2 = input.nextInt();
        System.out.print(fName2 + " Savaşcısının sağlık değerini giriniz: ");
        hlth2 = input.nextInt();
        System.out.print(fName2 + " Savaşçısının ağırlığını giriniz: ");
        w2= input.nextInt();
        System.out.print(fName2 + " Savaşçısının hasar bloklama yüzdesini giriniz: ");
        dodge2 = input.nextInt();


        Fighter f1 = new Fighter(fName1, dmg1 ,hlth1, w1,dodge1 );
        Fighter f2 = new Fighter (fName2, dmg2 , hlth2, w2, dodge2);
        Match match = new Match(f1,f2, 40, 100);
        match.run();
    }


}