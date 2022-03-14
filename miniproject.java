import java.util.Scanner;
public class miniproject {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String userInput;
            int inputLength;
            System.out.println("Enter card number:  ");
            userInput = scanner.next();
            String imputValue = String.valueOf(userInput);       

            inputLength = userInput.length();

            scanner.close();
            
        long[] userCard = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};

        long total;
        for (int i = userCard.length - 1; i >= 0; i-=2) { // multiplying everyother array numbers by 2
            total = 2*userCard[i];
                if (total>=10) {
                    long tens = total/10;
                    long ones = total%10;
                    long splitTotal = tens + ones;
                    System.out.println(splitTotal);
            } 
                else {
                    System.out.println(total);
            }
        }


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