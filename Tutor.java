public class Tutor extends Teacher {
    //declaring variables
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
     //creating a constructor Tutor
    public Tutor(int teacherId, String teacherName, String teacherAddress, String workingType, String employmentStatus, double salary, String specialization, String academicQualifications, int performanceIndex, int workingHours) {
        //calling constructor from parent class
        super(teacherId, teacherName, teacherAddress, workingType, employmentStatus);
        //calling setter method from parent class
        super.setWorkingHours(workingHours);
        //initializing instance variable with paramter value
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    //making accessor/getter methods
    public double getSalary() {
        return this.salary;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getAcademicQualifications() {
        return this.academicQualifications;
    }

    public int getPerformanceIndex() {
        return this.performanceIndex;
    }

    public boolean getCertified() {
        return this.isCertified;
    }
    // making setter/mutator methods
    public void setSalary(double salary, int performanceIndex) {
        //conditionals based on performanceIndex and working hours
        if (getPerformanceIndex() > 5 && getWorkingHours() > 20) {
            if (performanceIndex >= 5 && performanceIndex <= 7) {
                this.salary=salary + 0.05 * salary;
            } else if (performanceIndex >= 8 && performanceIndex <= 9) {
                this.salary=salary + 0.1 * salary;
            } else { 
                this.salary=salary + 0.2 * salary;
            }
            this.isCertified=true;
            System.out.println("the appraisal is approved");
        }
        else{
            System.out.println("the appraisal isnt approved");
        }
    }
    
    //creating a method removeTutor that removes the attributes if not certified
    public void removeTutor(){
        if (getCertified()==false){ 
            salary=0;
            specialization="";
            academicQualifications="";
            performanceIndex=0;
        }
        else{
            System.out.println("the tutor is certified");
        }
    }
    // overides the diplayMethod in parent class
    @Override
    public void displayMethod(){
        //display if tutor is not certified
        if (getCertified()==false){
            super.displayMethod();
        }
        else {
            //displays if tutor is certified
            super.displayMethod();
            System.out.println("the performance index is " +getPerformanceIndex());
            System.out.println("the salary is " + getSalary());
            System.out.println("the academic qualification is " +getAcademicQualifications());
            System.out.println("the specialization is " +getSpecialization());
        }
    }
}
