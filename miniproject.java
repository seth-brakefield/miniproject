import java.util.Scanner; 
public class miniproject { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        long evenTotal = 0; 
        long oddTotal = 0; 
        long total; 

        System.out.print("Enter a credit card number as a long integer: "); // user is prompted to input their card number 
        String userInput = scanner.nextLine(); 
        scanner.close();  
        char[] charList = userInput.toCharArray(); // user input is converted into a char array 
        long userCard[] = new long[userInput.length()]; // user input is converted into long array 

            for (int i = 0; i < userInput.length(); i++) { // converts char array to long array 
                userCard[i] = Character.digit(charList[i], 10); 
            } 
            for (int i = userCard.length - 2; i >= 0; i-=2) { // multiplying evens place array numbers by 2 
                total = 2 * userCard[i]; 
                long splitTotal = 0; 
                if (total >= 10) { // this splits the numerical value of the double-digit number and adds the values together
                    long tens = total / 10; 
                    long ones = total % 10; 
                    splitTotal = tens + ones; 
                    evenTotal += splitTotal; // adds to the evan total
                } 
                else { 
                    evenTotal += total; // single digits get added to the even total right away
                } 
            } 
            for (int i = userCard.length - 1; i >= 0; i-=2) { // this takes all of the odd placed numbers and adds them together 
                total = userCard[i]; 
                oddTotal += total; 
            } 
            if ((evenTotal + oddTotal )%10 == 0){ // this adds the two values together and divides them by 10 
                System.out.println(userInput + " is valid"); 
                } 
            else { 
                System.out.println(userInput + " is invalid"); 
            } 
    } 
} 
