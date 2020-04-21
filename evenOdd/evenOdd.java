import java.util.Scanner;

class evenOdd{
     public static void main(String args []){
        Scanner userInput = new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter a positive number!");
            while (!userInput.hasNextInt()){
                System.out.println("Invalid! Try again");
                userInput.next();
            }
            number = userInput.nextInt();

        } while (number <= 0);
        
        if (number % 2 ==0){
            System.out.println("You have entered: " + number + " which is even");
        }
        else{
            System.out.println("You have entered: " + number + " which is odd");
        }



    }


}