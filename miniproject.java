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
            } else {
                evenTotal += total;
            }
        }

        for (int i = userCard.length - 1; i >= 0; i-=2) { // this needs to be changed it doesn't need to have usercard multiplied by 2
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


                /*
                for (int i = 0; i < inputLength; i++) {
                    if (userInput.charAt(i) <= '9'){
                        System.out.print("error ");
                        break;
                    }
                    else if (userInput.charAt(i) <= 'C'){
                        System.out.print("2");
                    }
                    else if (userInput.charAt(i) <= 'F'){
                        System.out.print("3");
                    }
                    else if (userInput.charAt(i) <= 'I'){
                        System.out.print("4");
                    }
                    else if (userInput.charAt(i) <= 'L'){
                        System.out.print("5");
                    }
                    else if (userInput.charAt(i) <= 'O'){
                        System.out.print("6");
                    }
                    else if (userInput.charAt(i) <= 'S'){
                        System.out.print("7");
                    }
                    else if (userInput.charAt(i) <= 'V'){
                        System.out.print("8");
                    }
                    else if (userInput.charAt(i) <= 'Z'){
                        System.out.print("9");
                    }      
                        
                } 
                */
    }
}
