
public class Teacher {
    //declaring variables
    private int teacherId;
    private String teacherName;
    private String teacherAddress;
    private String workingType;
    private int workingHours;
    private String employmentStatus;
    //creating a constructor
    public Teacher(int teacherId, String teacherName, String teacherAddress, String workingType, String employmentStatus){
        //initializing instance variable with parameter value
        this.teacherName=teacherName;
        this.teacherId=teacherId;
        this.teacherAddress = teacherAddress;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //creating accessor/getter methods
    public int getTeacherId() {
        return this.teacherId;
    }
    
    public String getTeacherName() {
        return this.teacherName;
    }

    public String getTeacherAddress() {
        return this.teacherAddress;
    }
    
    public String getWorkingType() {
        return this.workingType;
    }
    
    public int getWorkingHours() {
        return this.workingHours;
    }

    public String getEmploymentStatus() {
        return this.employmentStatus;
    }
    
    //creating a mutator/setter method
    public void setWorkingHours(int workingHours ){
        this.workingHours=workingHours;
        
    }
    
    //creating a displayMethod to display the output
    public void displayMethod(){
        System.out.println("the teacher's name is "+getTeacherName());
        System.out.println("the teacher's id is "+getTeacherId());
        System.out.println("the teacher's address is "+getTeacherAddress());
        System.out.println("the working hours is"+getWorkingHours());
        System.out.println("the working type is " +getWorkingType());
        System.out.println("the employment status is "+getEmploymentStatus());
        /*checks working hours
         shows working hours is not assigned  if it is 0
         */
        if (workingHours==0){
            System.out.println("The working hours is not assigned yet");
        }
        else{
            System.out.println("You have assigned the working hours");
        }
    }
}
