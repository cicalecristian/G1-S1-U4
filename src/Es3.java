import java.util.Scanner;

public class Es3 {
//    static double perimetroRettangolo(double base, double altezza){
//        return base * altezza;
//    }

//    static int pariDispari(int number){
//        if (number % 2 == 0){
//            return 0;
//        } else {
//            return 1;
//        }
//    }

    static double areaTriangolo(double a, double b, double c){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("inserisci la base: ");
//        double base = Double.parseDouble(scanner.nextLine());
//        System.out.println("inserisci l'altezza: ");
//        double altezza = Double.parseDouble(scanner.nextLine());
//        double perimetro = perimetroRettangolo(base, altezza);
//        System.out.println("il perimetro del rettangolo è: " + perimetro);

//        System.out.println("inserisci un numero: ");
//        int number = Integer.parseInt(scanner.nextLine());
//        int result = pariDispari(number);
//        System.out.println(result);

        System.out.println("inserisci la misura del lato: ");
        double lato1 = Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci la misura del lato: ");
        double lato2 = Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci la misura del lato: ");
        double lato3 = Double.parseDouble(scanner.nextLine());

        double area = areaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
    }
}
