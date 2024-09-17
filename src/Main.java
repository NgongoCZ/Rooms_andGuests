import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner myScanner = new Scanner(System.in);
        UI newUi = new UI(myScanner);

        newUi.start();
    }
}
