import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner agescan = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int age =-1;
        while (age < 0){
            try {
                age = Integer.parseInt(agescan.nextLine());
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a valid number");
            }
        }


        int page = (100-age);
        System.out.println("You should read " + page + " pages");

    }
}



