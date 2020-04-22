

public class Fib{
	private int condition;


	public Fib(int userInput){
		condition = userInput;
	}

	public int getNumber(){
		return condition;
	}
    public void nthFibNumber(int a){
        int n1 = 1;
        int n2 = 0;
        int n3;
        for (int i = 1; i <= a; i++ ){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.printf(n3 +" ");
        }

    }
}