import java.util.Scanner;

class main{
    public static void main(String args[]){
        Fib fibObject = new Fib();
        int number;
        Scanner userInput = new Scanner(System.in);
        do{
            System.out.println("How many Fib numbers do you want: ");
            while(!userInput.hasNextInt()){
                System.out.println("Invalid input! Enter positive ints, less than or equal to 46 only");
                userInput.next();
            }
            number = userInput.nextInt();
        }while(number <= 0 && number < 46);
        fibObject.nthFibNumber(number);


    }   
}