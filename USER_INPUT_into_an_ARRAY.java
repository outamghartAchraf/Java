public class USER_INPUT_into_an_ARRAY {

    import java.util.Scanner;
    import java.util.Random;

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] foods;
        int size;

        System.out.print("How many foods do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();  

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nYou entered:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }


    
}
