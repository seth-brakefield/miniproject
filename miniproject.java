//import java.util.Scanner;
public class miniproject {

    public static void main(String[] args) {
        /*   Scanner scanner = new Scanner(System.in);
        String userInput;
        int inputLength;
        String imputValue = String.valueOf(userInput);       
        System.out.println("Enter card number:  ");
        userInput = scanner.next();
        inputLength = userInput.length();

        scanner.close();
        */
        long[] userCard = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6}; // temp value still need to figure out how to add a users input as a array
        long evenTotal = 0;
        long oddTotal = 0;
        long total;
        for (int i = userCard.length - 2; i >= 0; i-=2) { // multiplying evens place array numbers by 2
            total = 2 * userCard[i];
            long splitTotal = 0;
            if (total >= 10) {
                long tens = total / 10;
                long ones = total % 10;
                splitTotal = tens + ones;
                evenTotal += splitTotal;
            } 
            else {
                evenTotal += total;
            }
        }

        for (int i = userCard.length - 1; i >= 0; i-=2) { // this takes all of the odd placed numbers and adds them together
            total = userCard[i];
            oddTotal += total;
        }
        System.out.println(evenTotal);
        System.out.println(oddTotal);


        /*
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
        myList[i] = input.nextDouble();
        */
    }
}
