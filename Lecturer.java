public class Lecturer extends Teacher{
    //declaring variables
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    public Lecturer (int teacherId, String teacherName, String teacherAddress, String workingType, String employmentStatus,
    String department, int yearsOfExperience, int workingHours){
       //calling constructor from parent class
        super(teacherId, teacherName, teacherAddress, workingType, employmentStatus);
       //calling setter method from parent class
        super.setWorkingHours(workingHours);
        //initializing instance variable with paramter value
        this.gradedScore=0;
        this.department=department;
        this.yearsOfExperience=yearsOfExperience;
        this.hasGraded=false;
    }
    //making accessor/getter methods
    public String getDepartment(){
        return this.department;
    }
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    public int getGradedScore(){
        return this.gradedScore;
    }
    public boolean getHasGraded(){
        return this.hasGraded;
    }
    // making setter/mutator methods
    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }
    
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        //checks condition based on years of experience and if the department is relevant with the same area of interest
        if (yearsOfExperience>=5 && this.department.equals(department) ){
            if (gradedScore>=70){
                System.out.println("Congrats!! You have scored an A");
            }
            else if(gradedScore>=60 ){
                System.out.println("You have scored a B");
            }
            else if (gradedScore>=50){
                System.out.println("You have scored a C");
            }
            else if (gradedScore>=40){
                System.out.println("You have scored a D");
            }
            else{
                System.out.println("You have scored an E. You need to do better");
            }
            this.hasGraded=true;
            System.out.println("the lecturer can grade the test");
        }
        else{
            System.out.println("the lecturer is unfit to grade");
        }
    }
     // overides the diplayMethod in parent class
    public void displayMethod(){
    //displays output
        super.displayMethod();
        System.out.println("the department is " +getDepartment());
        System.out.println("the years of experience is "+getYearsOfExperience());
        System.out.println("the score is "+getGradedScore());
        //checks the condition and displays output accordingly
        if (getHasGraded()){
            System.out.println("the test has been successfully graded");
        }
        else{
            System.out.println( "the test is not graded yet");
        }
    }
    
}  