public class studentInformation{
    private int studentId;
    private double gpaPoints;
    private String studentName;

    //Constructor
    public studentInformation(String name, int studentNumber, double gpa){
        studentName = name;
        studentId = studentNumber;
        gpaPoints = gpa;

    }

    //Setters
    public void setName(String name){
        studentName = name;
    }

    public void setGpa(double gpa){
        gpaPoints = gpa;
    }

    // public void setWeight(double weight){
    //     this.weight = weight;
    // }

    public void setId(int studentNumber){
        studentId = studentNumber;
    }

    //Getters

    public String getName(){
        return studentName;
    }

    public double getGpa(){
        return gpaPoints;
    }

    // public void setWeight(double weight){
    //     this.weight = weight;
    // }

    public int getId(){
        return studentId;
    }



    ///Print out everything
    public void printEverything(){
        System.out.println("Name: " + studentName);
        System.out.println("Gpa: "  + gpaPoints);
        // System.out.println("Weight: " + weight);
        System.out.println("Student ID: " + studentId);
    }


}