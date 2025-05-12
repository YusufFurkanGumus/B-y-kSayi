import java.util.Scanner;

public class BüyükSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç sayı gireceğini al
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        // En küçük ve en büyük değerleri tanımla
        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        // Sayıları al ve karşılaştır
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            // Sayma sayısı kontrolü
            if (sayi <= 0) {
                System.out.println("Lütfen sadece pozitif tamsayı (sayma sayısı) giriniz.");
                i--; // geçerli bir giriş yapılmadı, aynı adım tekrar edilecek
                continue;
            }

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları yazdır
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }
}
