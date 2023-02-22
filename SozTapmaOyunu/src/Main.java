import java.util.Scanner;

class SozTapmaOyunu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sozler = {"Shamil", "Elcin", "Cavidan", "Orxan"};
        String soz = sozler[(int) (Math.random() * sozler.length)];
        char[] gizliSoz = new char[soz.length()];
        for (int i = 0; i < soz.length(); i++) {
            gizliSoz[i] = '_';
        }
        int yalnishGedish = 0;
        while (yalnishGedish < 6) {
            System.out.println("Tam soz: " + new String(gizliSoz));
            System.out.print("Herfi texmin edin ve yazin: ");
            char letter = sc.nextLine().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < soz.length(); i++) {
                if (soz.charAt(i) == letter) {
                    gizliSoz[i] = letter;
                    correctGuess = true;
                }
            }
            if (!correctGuess) {
                yalnishGedish++;
            }
            if (!new String(gizliSoz).contains("_")) {
                System.out.println("Tebrikler! Siz Qalibsiniz!");
                break;
            }
        }
        if (yalnishGedish == 6) {
            System.out.println("Teesufler olsun, Meglub Gekdiniz. Soz " + soz + "'idi");
        }
    }
}
