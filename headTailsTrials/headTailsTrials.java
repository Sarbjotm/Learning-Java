import java.util.Scanner;
import java.util.Random;

class headTailTrial{
     public static void main(String args []){
        Random r = new Random();
        int randomChoice;
        String choices[] = {"heads","tails"};
        Scanner userInput = new Scanner(System.in);
        int headCount = 0;
        int tailCount = 0;
        double headPercent;
        double tailPercent;
        int trials;
        do{
            System.out.println("How many simulations do you want to run? ");
            while (!userInput.hasNextInt()){
                System.out.println("Invalid! Try again");
                userInput.next();
            }
            trials = userInput.nextInt();

        } while (trials <= 0);

        userInput.close();
        for (int i = 0; i < trials; i++){
            randomChoice = r.nextInt((1-0)+1)+0;
            // System.out.println(choices[randomChoice]);
            if (choices[randomChoice] == "heads"){
                headCount++;
            }
            else{
                tailCount++;
            }
        }

        headPercent = (double)headCount / trials * 100;
        tailPercent = (double)tailCount / trials * 100;
        System.out.println("Heads: " + headPercent +"%");
        System.out.println("Tailss: " + tailPercent +"%");


        
        



    }


}