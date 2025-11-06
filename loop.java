import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Time's up! ⏰");

        scanner.close();
    }
}
