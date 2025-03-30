//import necessary components
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Font;

public class TeacherGUI{
    //declaring necessary variables
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private JFrame frame,frame1, frame2, displayFrame;
    private JPanel panel, panel2, tutorPanel, tutorPanel2, lecturerPanel, lecturerPanel2;
    private ImageIcon icon, icon1, tutorIcon;
    private JLabel image, image1;
    private JLabel name, descrip, label3, label4;
    private JButton addLecturer, grade, clear, lecturerButton, tutorButton, display, back, addTutor, setSalary, removeTutor, display1 ;
    private JLabel lecturerLabel, teacherIdLabel, teacherNameLabel, workingTypeLabel, teacherAddressLabel, gradeLabel,employmentStatusLabel, yearsOfExperienceLabel, departmentLabel, workingHoursLabel;
    private JTextField teacherIdTextField, teacherNameTextField, workingTypeTextField, teacherAddressText, gradeTextField, employmentStatusTextField, yearsOfExperienceTextField, departmentTextField, workingHoursTextField;
    private JLabel tutorLabel,displayAcademicQualifications, tutorTeacherIdLabel, tutorNameLabel, tutorWorkingHoursLabel, tutorEmploymentStatusLabel, tutorTeacherAddressLabel, tutorGradeLabel, tutorSalaryLabel, tutorPerformanceLabel, tutorSpecializationLabel, tutorAcademicQualifiactionsLabel, tutorWorkingTypeLabel;
    private JTextField tutorTeacherIdTextField, tutorTeacherNameTextField, tutorWorkingHoursTextField, tutorEmploymentStatusTextField, tutorTeacherAddressText, tutorGradeTextField, tutorSalaryTextField, tutorPerformanceTextField, tutorSpecializationTextField, tutorAcademicQualifiactionsTextField, tutorWorkingTypeTextField;
    //main method
    public static void main(String[] args) {
        TeacherGUI obj1=new TeacherGUI();
        obj1.welcomeFrame();
    }
    //welcomeFrame method
    public void welcomeFrame(){
        //creating main frame
        frame=new JFrame();
        frame.setSize(1500, 920);
        frame.setTitle("np01ai4a230014DixitaBajracharya");

        //creating panel
        panel=new JPanel();
        panel.setBounds(0, 0, 750, 920);
        panel.setLayout(null);

        //creating panel2
        panel2=new JPanel();
        panel2.setBounds(650, 0, 850, 920);
        panel2.setLayout(null);

        //adding image to the panel
        icon = new ImageIcon("logo.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(50, -1, Image.SCALE_SMOOTH); 
        icon = new ImageIcon(newImg);
        JLabel image = new JLabel(icon);
        image.setBounds(22, 29, 50, 50);
        panel.add(image);

        icon1 = new ImageIcon("image4.jpg");
        Image img1 = icon1.getImage();
        Image newImg1 = img1.getScaledInstance(500, -1, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newImg1);
        image1 = new JLabel(icon1);
        image1.setBounds(90, 50, 500, 800);
        panel.add(image1);

        //adding necessary labels to the panel
        name=new JLabel("Academia");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(90, 40, 100, 20);
        panel.add(name);

        descrip=new JLabel("Empowering Education Through Efficient Management");
        descrip.setFont(new Font("Bododni NT", Font.PLAIN, 14));
        descrip.setForeground(Color.GRAY);
        descrip.setBounds(90, 50, 500, 50);
        panel.add(descrip);

        //adding labels to panel2
        label3=new JLabel("Welcome To Teacher Management");
        label4=new JLabel("System");
        label3.setBounds(150, 200, 650, 60);
        label4.setBounds(400, 270, 600, 60);
        label3.setFont(new Font("Verdana", Font.BOLD, 32));
        label4.setFont(new Font("Verdana", Font.BOLD, 32));
        label4.setForeground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        panel2.add(label3);
        panel2.add(label4);

        //creating lecturerButton and tutorButton \
        lecturerButton=new JButton("Lecturer");
        lecturerButton.setBounds(280, 480, 350, 60);
        lecturerButton.setBackground(new Color(221, 81, 100));
        lecturerButton.setForeground(Color.WHITE);
        lecturerButton.setOpaque(true);
        lecturerButton.setBorder(null);
        lecturerButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
        lecturerButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lecturerButton.setBackground(new Color(222,13,58)); // Change background color on hover
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lecturerButton.setBackground(new Color(221, 81, 100)); // Restore original background color
                }
            });
        lecturerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    lecturer();
                    frame.setVisible(false);
                    frame1.setVisible(true);
                    frame2.setVisible(false);
                }
            });
        panel2.add(lecturerButton);

        tutorButton=new JButton("Tutor");
        tutorButton.setBounds(280, 580, 350, 60);
        tutorButton.setBackground(new Color(221, 81, 100));
        tutorButton.setForeground(Color.WHITE);
        tutorButton.setOpaque(true);
        tutorButton.setBorder(null);
        tutorButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
        tutorButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    tutorButton.setBackground(new Color(222,13,58)); // Change background color on hover
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    tutorButton.setBackground(new Color(221, 81, 100)); // Restore original background color
                }
            });
        tutorButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    tutor();
                    frame.setVisible(false);
                    frame1.setVisible(false);
                    frame2.setVisible(true);
                }
            });
        panel2.add(tutorButton);

        panel.setBackground(new Color(245,245,245));
        panel2.setBackground(new Color(166, 171, 236));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frame.add(panel);
        frame.add(panel2);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    //creating lecturer method
    public void lecturer(){
        //creating frame1
        frame1 = new JFrame();
        frame1.setSize(1700, 920);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame1.setTitle("np01ai4a230014DixitaBajracharya");

        // Panel for the header section
        lecturerPanel = new JPanel();
        lecturerPanel.setBackground(new Color(12,35,94));
        lecturerPanel.setBounds(0, 0, 1700, 90);
        lecturerPanel.setLayout(null);
        frame1.add(lecturerPanel);

        // Label for the header
        lecturerLabel = new JLabel("LECTURER");
        lecturerLabel.setForeground(Color.WHITE);
        lecturerLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
        lecturerLabel.setBounds(50, 10, 400, 50); 
        lecturerPanel.add(lecturerLabel);

        // Panel for the form section
        lecturerPanel2 = new JPanel();
        lecturerPanel2.setBackground(new Color(225,229,240));
        lecturerPanel2.setBounds(0, 90, 1700, 900);
        lecturerPanel2.setLayout(null);

        // Implement necessary Labels and text fields 
        teacherIdLabel = new JLabel("Teacher Id");
        teacherIdLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        teacherIdLabel.setBounds(70, 90, 200, 50);
        lecturerPanel2.add(teacherIdLabel);

        teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(210, 90, 280, 50);
        lecturerPanel2.add(teacherIdTextField);

        teacherNameLabel = new JLabel("Teacher's Name");
        teacherNameLabel.setBounds(70, 160, 200, 50);
        teacherNameLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(teacherNameLabel);

        teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(210, 160, 280, 50);
        lecturerPanel2.add(teacherNameTextField);

        workingTypeLabel = new JLabel("Working Type");
        workingTypeLabel.setBounds(70, 230, 200, 50);
        workingTypeLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(workingTypeLabel);

        workingTypeTextField = new JTextField();
        workingTypeTextField.setBounds(210, 230, 280, 50);
        lecturerPanel2.add(workingTypeTextField);

        teacherAddressLabel=new JLabel("Address");
        teacherAddressLabel.setBounds(70, 300, 280, 50);
        teacherAddressLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(teacherAddressLabel);

        teacherAddressText = new JTextField();
        teacherAddressText.setBounds(210, 300, 280, 50);
        lecturerPanel2.add(teacherAddressText);

        gradeLabel=new JLabel("Score");
        gradeLabel.setBounds(600, 360, 200, 50);
        gradeLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(gradeLabel);

        gradeTextField = new JTextField();
        gradeTextField .setBounds(800, 360, 280, 50);
        lecturerPanel2.add(gradeTextField );

        employmentStatusLabel=new JLabel("Employment Status");
        employmentStatusLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        employmentStatusLabel.setBounds(600, 90, 200, 50);
        lecturerPanel2.add(employmentStatusLabel);

        employmentStatusTextField = new JTextField();
        employmentStatusTextField.setBounds(800, 90, 280, 50);
        lecturerPanel2.add(employmentStatusTextField);

        yearsOfExperienceLabel=new JLabel("Years of experience");
        yearsOfExperienceLabel.setBounds(600, 160, 200, 50);
        yearsOfExperienceLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        lecturerPanel2.add(yearsOfExperienceLabel);

        yearsOfExperienceTextField = new JTextField();
        yearsOfExperienceTextField.setBounds(800, 160, 280, 50);
        lecturerPanel2.add(yearsOfExperienceTextField);

        departmentLabel=new JLabel("Department");
        departmentLabel.setBounds(600, 230, 200, 50);
        departmentLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(departmentLabel);

        departmentTextField = new JTextField();
        departmentTextField .setBounds(800, 230, 280, 50);
        lecturerPanel2.add(departmentTextField );

        workingHoursLabel=new JLabel("Working Hours");
        workingHoursLabel.setBounds(600, 300, 200, 50);
        workingHoursLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        lecturerPanel2.add(workingHoursLabel);

        workingHoursTextField = new JTextField();
        workingHoursTextField .setBounds(800, 300, 280, 50);
        lecturerPanel2.add(workingHoursTextField );

        //Create a button for adding lecturer
        addLecturer = new JButton("Lecturer");
        addLecturer.setBounds(350, 500, 170, 55);
        addLecturer.setForeground(Color.WHITE);
        addLecturer.setBackground(new Color(2,77,148));
        addLecturer.setOpaque(true);
        addLecturer.setBorder(null);
        addLecturer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Checking if any field is empty
                    if (teacherIdTextField.getText().equals("") || gradeTextField.getText().equals("") || departmentTextField.getText().equals("") || workingHoursTextField.getText().equals("") || teacherNameTextField.getText().equals("")|| workingTypeTextField.getText().equals("")|| employmentStatusTextField.getText().equals("")|| yearsOfExperienceTextField.getText().equals("") || teacherAddressText.getText().equals("")) {
                        JOptionPane.showMessageDialog(lecturerPanel2, "The fields are empty", "Invalid entry", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        try{
                            int teacherId = Integer.parseInt(teacherIdTextField.getText());
                            String teacherName = teacherNameTextField.getText();
                            String teacherAddress = teacherAddressText.getText();
                            String workingType = workingTypeTextField.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTextField.getText());
                            String employmentStatus = employmentStatusTextField.getText();
                            int gradedScore=Integer.parseInt(gradeTextField.getText());
                            String department=departmentTextField.getText();
                            int workingHours=Integer.parseInt(workingHoursTextField.getText());
                            boolean error=false;
                            //validating input
                            if (teacherId>1000 || teacherId<=0){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Please enter the teacher id with in the range of 1-1000", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (gradedScore>100 || gradedScore<0){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Please enter the score between the range of 0-100", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (workingHours<0 || workingHours>100){
                                JOptionPane.showMessageDialog(lecturerPanel2, "please enter the working hours between the range of 0-100", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (yearsOfExperience<0 || yearsOfExperience>70){
                                JOptionPane.showMessageDialog(lecturerPanel2, "please enter the years of experience between the range of 0-70", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            for (Teacher teacher : teachers) {
                                if (teacher.getTeacherId() == teacherId && teacher instanceof Lecturer) {
                                    error=true;
                                    JOptionPane.showMessageDialog(lecturerPanel2, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            if (error==false){
                                Lecturer lecturer=new Lecturer(teacherId, teacherName, teacherAddress, workingType, employmentStatus,
                                        department, yearsOfExperience, workingHours);
                                lecturer.setGradedScore(gradedScore);
                                teachers.add(lecturer);
                                JOptionPane.showMessageDialog(lecturerPanel2, "Lecturer added successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        //display an error message in case of invalid input
                        catch(NumberFormatException ex){
                            try{
                                int teacherId = Integer.parseInt(teacherIdTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Teacher Id cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                int yearsOfExperience = Integer.parseInt(yearsOfExperienceTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Years of experience cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                int gradedScore=Integer.parseInt(gradeTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Score cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                int workingHours=Integer.parseInt(workingHoursTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(lecturerPanel2, "Working hours cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });
        //creating grade button to grade assignments
        grade=new JButton("Grade Assignment");
        grade.setBounds(560, 500, 170, 55);
        grade.setBackground(new Color(2,77,148));
        grade.setForeground(Color.WHITE);
        grade.setOpaque(true);
        grade.setBorder(null);
        grade.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    // Checking if any field is empty
                    if (teacherIdTextField.getText().equals("") || departmentTextField.getText().equals("") || yearsOfExperienceTextField.getText().equals("") || gradeTextField.getText().equals("")) {
                        JOptionPane.showMessageDialog(lecturerPanel2, "The fields are empty", "Invalid entry", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try{
                            int teacherId = Integer.parseInt(teacherIdTextField.getText());
                            String department = departmentTextField.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTextField.getText());
                            int gradedScore = Integer.parseInt(gradeTextField.getText());
                            boolean lecturerFound = false;
                            for (Teacher obj : teachers) {
                                if (obj.getTeacherId() == teacherId) {
                                    if (obj instanceof Lecturer) {
                                        Lecturer lecturer = (Lecturer) obj;
                                        lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                                        StringBuilder score=new StringBuilder();
                                        String displayElements="Teacher ID: " + teacherId + "\n"+"Score: "+lecturer.getGradedScore()+"\n" + "Years of experience: "+lecturer.getYearsOfExperience() + "\n" +"Department: "+ lecturer.getDepartment()+ "\n";
                                        score.append(displayElements);
                                        lecturerFound=true;
                                        if (lecturer.getYearsOfExperience()>=5 && department.equals(lecturer.getDepartment()) ){
                                            if (gradedScore>=70){
                                                score.append("Congrats!! You have scored an A" + "\n");
                                            }
                                            else if(gradedScore>=60 ){
                                                score.append("You have scored a B" + "\n");
                                            }
                                            else if (gradedScore>=50){
                                                score.append("You have scored a C" + "\n");
                                            }
                                            else if (gradedScore>=40){
                                                score.append("You have scored a D" + "\n");
                                            }
                                            else{
                                                score.append("You have scored an E. You need to do better" + "\n");
                                            }
                                            score.append("\n"+"the lecturer can grade the test"+ "\n");
                                        }
                                        else{
                                            score.append("\n"+"the lecturer is unfit to grade");
                                        }
                                        JOptionPane.showMessageDialog(lecturerPanel2, score, "Grade Assignment", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }
                            if (lecturerFound==false){
                                JOptionPane.showMessageDialog(lecturerPanel2, "The id doesnt exist", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        //display an error message in case of invalid input
                        catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(lecturerPanel2, " Interger fields cannot have string inputs. Please check you teacher id, score and years of experience ", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            });
        //create a clear button
        clear=new JButton("Clear");
        clear.setBounds(770, 500, 170, 55);
        clear.setForeground(new Color(2,77,148));
        clear.setOpaque(true);
        clear.setBorder(null);
        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // Checking if any field is empty
                    if (teacherIdTextField.getText().equals("") || gradeTextField.getText().equals("") || departmentTextField.getText().equals("") || workingHoursTextField.getText().equals("") || teacherNameTextField.getText().equals("")|| workingTypeTextField.getText().equals("")|| employmentStatusTextField.getText().equals("")|| yearsOfExperienceTextField.getText().equals("") || teacherAddressText.getText().equals("")) {
                        JOptionPane.showMessageDialog(lecturerPanel2, "The fields are already empty", "Invalid entry", JOptionPane.WARNING_MESSAGE);
                    }else{
                        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            // Clear all text fields
                            teacherIdTextField.setText("");
                            teacherNameTextField.setText("");
                            workingTypeTextField.setText("");
                            employmentStatusTextField.setText("");
                            departmentTextField.setText("");
                            yearsOfExperienceTextField.setText("");
                            teacherAddressText.setText("");
                            gradeTextField.setText("");
                            workingHoursTextField.setText("");
                        }
                    }
                }
            });
        //create a display button
        display=new JButton("Display");
        display.setBounds(280, 600, 350, 55);
        display.setBackground(new Color(2,77,148)); 
        display.setForeground(Color.WHITE); 
        display.setOpaque(true);
        display.setBorder(null);
        display.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Check if the list of teachers is empty
                    if (teachers.isEmpty()) {
                        JOptionPane.showMessageDialog(lecturerPanel2, "No lecturer added yet.", "Invalid", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try{
                            StringBuilder displayMethod=new StringBuilder();
                            int teacherId=Integer.parseInt(teacherIdTextField.getText());
                            boolean idExist=false;
                            for (Teacher teacher : teachers) {
                                if (teacher instanceof Lecturer && teacher.getTeacherId()==teacherId) {
                                    Lecturer lecturer = (Lecturer) teacher; 
                                    lecturer.displayMethod();
                                    String display1="\n"+"Teacher Id: " + lecturer.getTeacherId() + "\n" + "Name: " + lecturer.getTeacherName() + "\n" + "Teacher's Address: "+lecturer.getTeacherAddress() + "\n" + "Working Hours: "+lecturer.getWorkingHours() +  "\n" + "Working Type: " +lecturer.getWorkingType() + "\n" + "Employment Status: "+lecturer.getEmploymentStatus()+"\n";
                                    displayMethod.append(display1);
                                    String display="Department: " + lecturer.getDepartment() + "\n" + "Years of Experience: " + lecturer.getYearsOfExperience() + "\n";
                                    displayMethod.append(display);
                                    // Check if the teacher is a Lecturer and matches the provided ID
                                    if (lecturer.getHasGraded()){
                                        displayMethod.append("Graded Score: "+lecturer.getGradedScore()+"\n"+"\n");
                                        displayMethod.append("the test has been successfully graded");
                                    }
                                    else{
                                        displayMethod.append( "the test is not graded yet");
                                    }
                                    idExist=true;
                                    JOptionPane.showMessageDialog(lecturerPanel2, displayMethod, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            // Show error message if the provided ID doesn't exist
                            if (!idExist){
                                JOptionPane.showMessageDialog(lecturerPanel2, "The id provided doesnt exist", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        // Show error message if an invalid teacher ID is provided
                        catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(lecturerPanel2, "Please provide a suitable teacher Id", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
        //Create a back button
        back=new JButton("Return");
        back.setBounds(680, 600, 350, 55);
        back.setOpaque(true);
        back.setBorder(null);
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // Call the welcomeFrame method 
                    welcomeFrame();
                }
            });
        //adding necessary components
        lecturerPanel2.add(back);
        lecturerPanel2.add(display);
        frame1.add(lecturerPanel2);
        lecturerPanel2.add(clear);
        lecturerPanel2.add(grade);
        frame1.setLayout(null);
        lecturerPanel2.add(addLecturer);

        //adding an image to the lecturerPanel2
        icon = new ImageIcon("lecimage.png");
        Image img2 = icon.getImage();
        Image img1 = img2.getScaledInstance(500, -1, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img1)); 
        imageLabel.setBounds(900, 90, 500, 800);
        lecturerPanel2.add(imageLabel);

        lecturerPanel2.setVisible(true);
        frame1.setVisible(true);
    }
    //creating a tutor method
    public void tutor(){
        //creating a frame method
        frame2 = new JFrame();
        frame2.setSize(1700, 920);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame2.setTitle("np01ai4a230014DixitaBajracharya");

        //creating a tutorPanel
        tutorPanel = new JPanel();
        tutorPanel.setBackground(new Color(12,35,94));
        tutorPanel.setBounds(0, 0, 1700, 90);
        tutorPanel.setLayout(null);
        frame2.add(tutorPanel);

        //creating a header
        tutorLabel = new JLabel("TUTOR");
        tutorLabel.setForeground(Color.WHITE);
        tutorLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
        tutorLabel.setBounds(50, 10, 400, 50); 
        tutorPanel.add(tutorLabel);

        //creating a tutorPanel2
        tutorPanel2 = new JPanel();
        tutorPanel2.setBackground(new Color(225,229,240));
        tutorPanel2.setBounds(0, 90, 1700, 900);
        tutorPanel2.setLayout(null);

        //creating labels and textfields for the form
        tutorTeacherIdLabel = new JLabel("Teacher Id");
        tutorTeacherIdLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorTeacherIdLabel.setBounds(80, 90, 200, 50);
        tutorPanel2.add(tutorTeacherIdLabel);

        tutorTeacherIdTextField = new JTextField();
        tutorTeacherIdTextField.setBounds(240, 90, 280, 50);
        tutorPanel2.add(tutorTeacherIdTextField);

        tutorNameLabel = new JLabel("Tutor's Name");
        tutorNameLabel.setBounds(80, 160, 200, 50);
        tutorNameLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPanel2.add(tutorNameLabel);

        tutorTeacherNameTextField = new JTextField();
        tutorTeacherNameTextField.setBounds(240, 160, 280, 50);
        tutorPanel2.add(tutorTeacherNameTextField);

        tutorWorkingTypeLabel = new JLabel("Working Type");
        tutorWorkingTypeLabel.setBounds(80, 230, 200, 50);
        tutorWorkingTypeLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPanel2.add(tutorWorkingTypeLabel);

        tutorWorkingTypeTextField = new JTextField();
        tutorWorkingTypeTextField.setBounds(240, 230, 280, 50);
        tutorPanel2.add(tutorWorkingTypeTextField);

        tutorTeacherAddressLabel=new JLabel("Address");
        tutorTeacherAddressLabel.setBounds(80, 300, 200, 50);
        tutorTeacherAddressLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPanel2.add(tutorTeacherAddressLabel);

        tutorTeacherAddressText = new JTextField();
        tutorTeacherAddressText.setBounds(240, 300, 280, 50);
        tutorPanel2.add(tutorTeacherAddressText);

        tutorEmploymentStatusLabel=new JLabel("Employment Status");
        tutorEmploymentStatusLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorEmploymentStatusLabel.setBounds(600, 90, 200, 50);
        tutorPanel2.add(tutorEmploymentStatusLabel);

        tutorEmploymentStatusTextField = new JTextField();
        tutorEmploymentStatusTextField.setBounds(820, 90, 280, 50);
        tutorPanel2.add(tutorEmploymentStatusTextField);

        tutorWorkingHoursLabel=new JLabel("Working Hours");
        tutorWorkingHoursLabel.setBounds(600, 160, 200, 50);
        tutorWorkingHoursLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPanel2.add(tutorWorkingHoursLabel);

        tutorWorkingHoursTextField = new JTextField();
        tutorWorkingHoursTextField .setBounds(820, 160, 280, 50);
        tutorPanel2.add(tutorWorkingHoursTextField);

        JLabel tutorSalaryLabel = new JLabel("Salary");
        tutorSalaryLabel.setBounds(600, 230, 200, 50);
        tutorSalaryLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPanel2.add(tutorSalaryLabel);

        JTextField tutorSalaryTextField = new JTextField();
        tutorSalaryTextField.setBounds(820, 230, 280, 50);
        tutorPanel2.add(tutorSalaryTextField);

        JLabel tutorSpecializationLabel = new JLabel("Specialization");
        tutorSpecializationLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorSpecializationLabel.setBounds(600, 300, 200, 50);
        tutorPanel2.add(tutorSpecializationLabel);

        JTextField tutorSpecializationTextField = new JTextField();
        tutorSpecializationTextField.setBounds(820, 300, 280, 50);
        tutorPanel2.add(tutorSpecializationTextField);

        JLabel tutorAcademicQualificationsLabel = new JLabel("Academic Qualifications");
        tutorAcademicQualificationsLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorAcademicQualificationsLabel.setBounds(600, 360, 250, 50);
        tutorPanel2.add(tutorAcademicQualificationsLabel);

        JTextField tutorAcademicQualificationsTextField = new JTextField();
        tutorAcademicQualificationsTextField.setBounds(820, 360, 280, 50);
        tutorPanel2.add(tutorAcademicQualificationsTextField);

        JLabel tutorPerformanceLabel = new JLabel("Performance Index");
        tutorPerformanceLabel.setFont(new Font("Serif", Font.PLAIN, 21));
        tutorPerformanceLabel.setBounds(80, 360, 200, 50);
        tutorPanel2.add(tutorPerformanceLabel);

        JTextField tutorPerformanceTextField = new JTextField();
        tutorPerformanceTextField.setBounds(240, 360, 280, 50);
        tutorPanel2.add(tutorPerformanceTextField);

        //create addTutor buttor
        addTutor = new JButton("Tutor");
        addTutor.setBounds(230, 500, 200, 55);
        addTutor.setOpaque(true);
        addTutor.setBorder(null);
        addTutor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Check if any field is empty
                    if (tutorTeacherIdTextField.getText().equals("") || tutorTeacherNameTextField.getText().equals("") || tutorTeacherAddressText.getText().equals("") || tutorWorkingTypeTextField.getText().equals("") || tutorEmploymentStatusTextField.getText().equals("") || tutorWorkingHoursTextField.getText().equals("") || tutorSalaryTextField.getText().equals("") || tutorPerformanceTextField.getText().equals("") || tutorSpecializationTextField.getText().equals("") || tutorAcademicQualificationsTextField.getText().equals("")){
                        JOptionPane.showMessageDialog(tutorPanel2, "Fill the fields please", "Invalid", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        try{
                            int teacherId = Integer.parseInt(tutorTeacherIdTextField.getText());
                            String teacherName = tutorTeacherNameTextField.getText();
                            String teacherAddress = tutorTeacherAddressText.getText();
                            String workingType = tutorWorkingTypeTextField.getText();
                            String employmentStatus = tutorEmploymentStatusTextField.getText();
                            int workingHours = Integer.parseInt(tutorWorkingHoursTextField.getText());
                            float salary=Integer.parseInt(tutorSalaryTextField.getText());
                            int performanceIndex=Integer.parseInt(tutorPerformanceTextField.getText());
                            String specialization=tutorSpecializationTextField.getText();
                            String academicQualifications=tutorAcademicQualificationsTextField.getText();
                            boolean error=false;
                            //Validate input values
                            if (teacherId>1000 || teacherId<=0){
                                JOptionPane.showMessageDialog(tutorPanel2, "Please enter the teacher id between the range of 0 - 1000", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (workingHours<0 || workingHours>100){
                                JOptionPane.showMessageDialog(tutorPanel2, "Please enter the working hours within the range 0 and 100", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (performanceIndex<0 || performanceIndex>10){
                                JOptionPane.showMessageDialog(tutorPanel2, "Please enter the performance index between the range of 0 - 10", "Error", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            if (salary<0){
                                JOptionPane.showMessageDialog(tutorPanel2, "Please enter the salary above 0", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                                error=true;
                            }
                            for (Teacher teacher : teachers) {
                                if (teacher.getTeacherId() == teacherId && teacher instanceof Tutor) {
                                    error=true;
                                    JOptionPane.showMessageDialog(tutorPanel2, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            if (error==false){
                                Tutor tutor=new Tutor(teacherId, teacherName, teacherAddress, workingType, employmentStatus, salary, specialization, academicQualifications, performanceIndex, workingHours);
                                teachers.add(tutor);
                                JOptionPane.showMessageDialog(tutorPanel2, "Tutor added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        //handle invalid input
                        catch(NumberFormatException ex){
                            try{
                                int teacherId = Integer.parseInt(tutorTeacherIdTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(tutorPanel2, "Teacher ID cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                int workingHours = Integer.parseInt(tutorWorkingHoursTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(tutorPanel2, "Working hours cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                float salary=Integer.parseInt(tutorSalaryTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(tutorPanel2, "Salary cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            try{
                                int performanceIndex=Integer.parseInt(tutorPerformanceTextField.getText());
                            }
                            catch(NumberFormatException exc){
                                JOptionPane.showMessageDialog(tutorPanel2, "Performance Index cannot have string values", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });
        //create setSalary button
        setSalary=new JButton("Set Salary");
        setSalary.setBounds(450, 500, 200, 55);
        setSalary.setOpaque(true);
        setSalary.setBorder(null);
        setSalary.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // Check if any field is empty
                    if (tutorTeacherIdTextField.getText().equals("") || tutorSalaryTextField.getText().equals("") || tutorPerformanceTextField.getText().equals("")){
                        JOptionPane.showMessageDialog(tutorPanel2, "The fields are empty", "Invalid", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        try{ 
                            int teacherId = Integer.parseInt(tutorTeacherIdTextField.getText());
                            double salary=Double.parseDouble(tutorSalaryTextField.getText());
                            int tutorPerformanceIndex=Integer.parseInt(tutorPerformanceTextField.getText());
                            String appraisal="";
                            String appraisalTutor="";
                            boolean error=true;
                            for (Teacher teacher:teachers){
                                if (teacher.getTeacherId()==teacherId && teacher instanceof Tutor){
                                    error=false;
                                    Tutor tutor1=(Tutor)teacher;
                                    tutor1.setSalary(salary, tutorPerformanceIndex);
                                    boolean appraisalApproved=true;
                                    StringBuilder tutorInfo = new StringBuilder();
                                    if (tutor1.getPerformanceIndex() < 5 ) {
                                        appraisal="the Performace Index is less than 5"+"\n";
                                        appraisalApproved=false;
                                    }
                                    if (tutor1.getWorkingHours() < 20){
                                        appraisal="the working hours is less than 20"+"\n";
                                        appraisalApproved=false;
                                    }
                                    if (appraisalApproved){
                                        if (tutorPerformanceIndex >= 5 && tutorPerformanceIndex <= 7) {
                                            salary=salary + 0.05 * salary;
                                        } else if (tutorPerformanceIndex >= 8 && tutorPerformanceIndex <= 9) {
                                            salary=salary + 0.1 * salary;
                                        } else { 
                                            salary=salary + 0.2 * salary;
                                        }
                                        appraisalTutor=("the appraisal is approved"+"\n");
                                    }
                                    else
                                    {
                                        appraisalTutor="\n"+"Sorry, the appraisal isn't approved";
                                    }

                                    tutorInfo.append("Teacher ID: "+ teacherId + "\n");
                                    tutorInfo.append("Performance Index: " + tutorPerformanceIndex + "\n");
                                    tutorInfo.append("Salary: " + salary+"\n");
                                    tutorInfo.append(appraisal+"\n");
                                    tutorInfo.append(appraisalTutor+"\n");
                                    JOptionPane.showMessageDialog(tutorPanel2, tutorInfo, "Set salary", JOptionPane.INFORMATION_MESSAGE);
                                }

                            }
                            // Display error message if teacher ID not found
                            if (error==true){
                                JOptionPane.showMessageDialog(tutorPanel2, "The teacher id doesnt exist", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        // Handle invalid input format
                        catch(Exception ex){
                            JOptionPane.showMessageDialog(tutorPanel2, "Invalid entry. Please enter integer values for teacherId, salary and performance index.", "Invalid", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
        //create removeTutor button
        removeTutor=new JButton("Remove Tutor");
        removeTutor.setBounds(670, 500, 200, 55);
        removeTutor.setOpaque(true);
        removeTutor.setBorder(null);
        removeTutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //checks if the array list is empty
                    if (teachers.isEmpty()){
                        JOptionPane.showMessageDialog(tutorPanel2, "The teacher list is empty", "Invalid", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        try{
                            int teacherId = Integer.parseInt(tutorTeacherIdTextField.getText());
                            boolean idExist=false;
                            boolean isRemoved=false;
                            for (Teacher teacher:teachers){
                                if(teacher instanceof Tutor && teacherId==teacher.getTeacherId()){
                                    Tutor tutor=(Tutor)teacher;
                                    idExist=true;
                                    int choice = JOptionPane.showConfirmDialog(tutorPanel2, "Are you sure you want to remove the tutor?", "Confirmation", JOptionPane.YES_NO_OPTION);
                                    if (choice == JOptionPane.YES_OPTION) {
                                        tutor.removeTutor();
                                        teachers.remove(teacher);
                                        // Clearing text fields after removal
                                        tutorTeacherIdTextField.setText("");
                                        tutorTeacherNameTextField.setText("");
                                        tutorTeacherAddressText.setText("");
                                        tutorWorkingTypeTextField.setText("");
                                        tutorEmploymentStatusTextField.setText("");
                                        tutorWorkingHoursTextField.setText("");
                                        tutorSalaryTextField.setText("");
                                        tutorPerformanceTextField.setText("");
                                        tutorSpecializationTextField.setText("");
                                        tutorAcademicQualificationsTextField.setText("");

                                        isRemoved=true;
                                        break;
                                    }
                                }
                            }
                            if(isRemoved ){
                                JOptionPane.showMessageDialog(tutorPanel2, "the teacher is removed successfully", "success", JOptionPane.INFORMATION_MESSAGE);
                            }
                            if(!idExist){
                                JOptionPane.showMessageDialog(tutorPanel2, "the provided teacher Id doesnt exist", "Invalid", JOptionPane.ERROR_MESSAGE); 

                            }

                        }
                        //Handle invalid input
                        catch(Exception exc){
                            JOptionPane.showMessageDialog(tutorPanel2, "the provided teacher Id is invalid", "Invalid", JOptionPane.ERROR_MESSAGE);
                        } 
                    }
                }
            });
        //create clear button
        clear=new JButton("Clear");
        clear.setBounds(890, 500, 200, 55);
        clear.setOpaque(true);
        clear.setBorder(null);
        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (tutorTeacherIdTextField.getText().equals("") && tutorTeacherNameTextField.getText().equals("") && tutorTeacherAddressText.getText().equals("") && tutorWorkingTypeTextField.getText().equals("") && tutorEmploymentStatusTextField.getText().equals("") && tutorWorkingHoursTextField.getText().equals("") && tutorSalaryTextField.getText().equals("") && tutorPerformanceTextField.getText().equals("") && tutorSpecializationTextField.getText().equals("") && tutorAcademicQualificationsTextField.getText().equals("")){
                        JOptionPane.showMessageDialog(tutorPanel2, "The fields are already empty", "Invalid", JOptionPane.WARNING_MESSAGE);
                    }else{
                        int choice = JOptionPane.showConfirmDialog(tutorPanel2, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            //clear the textfields
                            tutorTeacherIdTextField.setText("");
                            tutorTeacherNameTextField.setText("");
                            tutorTeacherAddressText.setText("");
                            tutorWorkingTypeTextField.setText("");
                            tutorEmploymentStatusTextField.setText("");
                            tutorWorkingHoursTextField.setText("");
                            tutorSalaryTextField.setText("");
                            tutorPerformanceTextField.setText("");
                            tutorSpecializationTextField.setText("");
                            tutorAcademicQualificationsTextField.setText("");
                        }
                    }
                }
            });
        //create a back button
        back=new JButton("Return");
        back.setBounds(680, 600, 350, 55);
        back.setOpaque(true);
        back.setBorder(null);
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //call the welcomeFrame method
                    welcomeFrame();
                }
            });
        //create display to display the information
        display1=new JButton("Display");
        display1.setBounds(280, 600, 350, 55);
        display1.setBackground(new Color(35,43,122)); 
        display1.setForeground(Color.WHITE); 
        display1.setOpaque(true);
        display1.setBorder(null);
        display1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //check if the array list is empty
                    if (teachers.isEmpty()) {
                        JOptionPane.showMessageDialog(tutorPanel2, "No tutor added yet.", "Invalid type", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            int teacherId = Integer.parseInt(tutorTeacherIdTextField.getText());
                            boolean idExist = false;
                            StringBuilder displayMethod = new StringBuilder();

                            for (Teacher teacher : teachers) {
                                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                                    Tutor tutor = (Tutor) teacher;
                                    tutor.displayMethod();
                                    idExist=true;
                                    String display1 = "\nTeacher Id: " + tutor.getTeacherId() + "\nName: " + tutor.getTeacherName() + "\nTeacher's Address: " + tutor.getTeacherAddress() + "\nWorking Hours: " + tutor.getWorkingHours() + "\nWorking Type: " + tutor.getWorkingType() + "\nEmployment Status: " + tutor.getEmploymentStatus() + "\n";
                                    displayMethod.append(display1);
                                    displayMethod.append("Performance Index: " + tutor.getPerformanceIndex() + "\n");
                                    displayMethod.append("Salary: " + tutor.getSalary() + "\n");
                                    displayMethod.append("Academic Qualification: " + tutor.getAcademicQualifications() + "\n");
                                    displayMethod.append("Specialization: " + tutor.getSpecialization() + "\n");
                                    displayMethod.append("\n");
                                }
                            }
                            //check if the id exist or not
                            if (idExist) {
                                JOptionPane.showMessageDialog(tutorPanel2, displayMethod, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(tutorPanel2, "The provided ID doesn't exist.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            //handle invalid input
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(tutorPanel2, "Please provide a valid teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

        // Adding components to tutorPanel2
        tutorPanel2.add(addTutor);
        tutorPanel2.add(setSalary);
        tutorPanel2.add(back);
        tutorPanel2.add(clear);
        tutorPanel2.add(removeTutor);
        tutorPanel2.add(display1);

        // Adding an image to tutorPanel2
        tutorIcon = new ImageIcon("tutor123.png");
        Image img2 = tutorIcon .getImage();
        Image img1 = img2.getScaledInstance(500, -1, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img1)); 
        imageLabel.setBounds(900, 90, 500, 800);
        tutorPanel2.add(imageLabel);

        // Adding tutorPanel and tutorPanel2 to frame2
        frame2.add(tutorPanel);
        frame2.add(tutorPanel2);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}

