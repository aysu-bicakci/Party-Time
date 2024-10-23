import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        User user = new User();

        System.out.println("---------PARTY TİME---------\n");
        System.out.println("""

                Kendi parti düzeninizi oluşturmak için harika bir yolculuğa çıkın!\s
                Bu eğlenceli oyunda amacınız, çeşitli yiyecek, içecek, tatlı ve dekorasyon malzemeleri alarak unutulmaz bir parti hazırlamak.

                Nasıl Oynanır:

                Çalış ve Para Kazan:

                İlk adım olarak, karakterinizle çalışarak para kazanın.\s
                İş yerine giderek, biriken paralarla parti malzemelerini almak için bütçe oluşturun.

                Market Alışverişi:

                Kazandığınız paraları kullanarak yerel markete gidin.
                İhtiyacınız olan yiyecek, içecek ve dekorasyon malzemelerini seçin.
                Farklı kategoriler arasında dolaşarak en lezzetli ürünleri ve en güzel dekorasyonları bulun.

                Parti Zamanı:

                Market alışverişinizden sonra, eve dönün ve harika bir parti atmosferi yaratıp partinizi düzenleyin

                """);

        System.out.println("Karakterinizi tasarlayın!!");
        System.out.println("\nKarakterinizin adı ne olsun: ");
        System.out.println("İsim girmeden devam etmek için 1");
        String name = scan.nextLine();
        if (name.equals("1")) {

            start();

        } else {
            start(name);

        }
    }
    public static void start() {
        Character character = new Character();
        character.desing();
        Home home = new Home(character);
    }


    public static void start(String name) {
        Character character = new Character(name);
        character.desing();
        Home home = new Home(character,name);
    }

}