

class main{
    public static void main(String args[]){
        studentInformation student1 = new studentInformation("Sam", 301, 3.33);
        student1.printEverything();
        student1.setGpa(2.01);
        System.out.println("GPA is: " + student1.getGpa());
        
    }

    
}


