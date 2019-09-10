import java.util.Scanner;

public class logbok {
    public static void main(String[] args){
        System.out.println(
                "1 Visa \n" +
                "2 Lägg till post \n" +
                "3 Uppdatera \n" +
                "4 Spara \n" +
                "5 Läs in \n" +
                "6 Avsluta");


        Scanner visa = new Scanner(System.in);
        int val = visa.nextInt();
        if (val == 1){
            System.out.println("Du har valt Visa");
        }
        if (val == 2){
           System.out.println("Du har valt Lägg till post");
        }
        if (val == 3){
            System.out.println("Du har valt Uppdatera");
        }
        if (val == 4){
            System.out.println("Du har valt Spara");
        }
        if (val == 5){
            System.out.println("Du har valt Läs in");
        }
        if (val == 6){
            System.out.println("Du har valt Avsluta");
        }
    }
}
