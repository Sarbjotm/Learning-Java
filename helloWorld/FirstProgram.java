import java.util.Scanner;

class Greeter{
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        System.out.println("Hello "+userName+"!");
    }   
}