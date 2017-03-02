/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author shuxiang
 */
import java.time.LocalDate;
import java.time.Period;

public class Student extends Person{
    private String major;
    private int studentNumber;
    private LocalDate enrollementDate;
    private boolean inGoodStanding;
    public Student(String FN, String LN, String SA, String C, String P, String PC, LocalDate BD, 
            String M, int SN, LocalDate ED) {
            super(FN, LN, SA, C, P, PC, BD);
            this.major=M;
            this.studentNumber=SN;
            this.enrollementDate=ED;
            this.inGoodStanding = true; 
    }
    public void setMajor(String M){
        this.major=M;
    }
    public void setStudentNumber(int SN){
          if (SN > 0){
            this.studentNumber = SN;
          }else{
            throw new IllegalArgumentException("Student number cannot be 0, it should have 9 digits");}
    }
    public void setInGoodStanding(Boolean inGoodStanding) {
        this.inGoodStanding = inGoodStanding;
    }
    public void suspendStudent() {
        inGoodStanding = false;
    }
    public void reinstateStudent() {
        inGoodStanding = true;
    }
    public void setEnrollementDate(LocalDate ED){
        this.enrollementDate=ED;
    }
    public void setBirthday(LocalDate BD){
    LocalDate today = LocalDate.now();
        int age = Period.between(BD, today).getYears();
        if (age > 14 || age < 90){
            this.birthDate = BD;
        }else{
            throw new IllegalArgumentException("Must be between 14-90");}
    }
     public int getYearEnrolled(){
        return enrollementDate.getYear();        
    }
     public int getYearsAtCollege()
    {
            int YearsAtCollege = LocalDate.now().getYear() - enrollementDate.getYear();
            
            if (YearsAtCollege <= 0)
                throw new IllegalArgumentException("Must be more than 0!");
            return YearsAtCollege;
     }
     public Boolean inGoodStanding()
    {
       if (inGoodStanding == true){
           return true;}else{ 
           return false;}
        
    }
     public String getMajor() {
        return major;
    }
     public int getStudentNumber() {
        return studentNumber;
    }
    public String toString() {
        return getFirsName()+ " " + getLastName() + ", student number is " + this.studentNumber;
    }
}

