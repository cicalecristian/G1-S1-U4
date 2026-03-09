import java.util.Scanner;

public class Es2 {
    static String concat(String prima, String seconda, String terza){
        return prima + " " + seconda + " " + terza;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la prima stringa: ");
        String firstString = scanner.nextLine();
        System.out.println("inserisci la seconda stringa: ");
        String secondString = scanner.nextLine();
        System.out.println("inserisci la terza stringa: ");
        String thirdString = scanner.nextLine();
        System.out.println();
        String concatenazione = concat(firstString, secondString, thirdString);
        String invertita = concat(thirdString, secondString, firstString);
        System.out.println(concatenazione);
        System.out.println(invertita);
    }
}
