import java.util.Scanner;

class main{
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        double distance;
        do{
            System.out.printf("Distance to subject [m]: ");
            while(!userInput.hasNextDouble()){
                System.out.println("Invalid input!");
                System.out.printf("Distance to subject [m]: ");
                userInput.next();
            }
            distance = userInput.nextDouble();
            if(distance < 0.0){
                System.out.println("Distance can't be negative, try again \n");
            }
        }while(distance < 0.0);
        
        System.out.printf("You entered: \n" + distance)
;        
    }

    
}


