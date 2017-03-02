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
import java.util.ArrayList;
import java.time.Period;
public class Instructor extends Person{
    private int employeeNumber;
    protected LocalDate hireDate;
    private ArrayList<String> teachableCourse;

    public Instructor(String FN, String LN, String SA, String C, String P, String PC, LocalDate BD, int EN, LocalDate HD) {
        super(FN, LN, SA, C, P, PC, BD);
        this.employeeNumber=EN;
        this.hireDate=HD;
        this.birthDate=BD;
        this.teachableCourse=new ArrayList<>();
    }
    public void setHireDate(LocalDate HD) {
        LocalDate today = LocalDate.now();
       if(LocalDate.now().getYear() - hireDate.getYear() > 80 || LocalDate.now().isBefore(hireDate))
           throw new IllegalArgumentException("Must be less than 80 years.");
       
       else{
           this.hireDate = HD;}
    }
     public void setBirthDate(LocalDate BD)
    {
          LocalDate today = LocalDate.now();
        int age = Period.between(BD, today).getYears();
        if (age <= 100 && age >= 18){
            this.birthDate = BD;}
        else{
            throw new IllegalArgumentException("Must be between 18 and 100.");}
        
    }
    public void addTeachableCourse(String teachableCourse)
    {
        this.teachableCourse.add(teachableCourse.toUpperCase());
    }
     public boolean canTeach(String teachableCourse){
        return teachableCourse.contains(teachableCourse.toUpperCase()); 
    }
     public int getYearsAtCollege() {
        LocalDate today = LocalDate.now();
        Period yearsAtCollege = Period.between(hireDate,today);
        return yearsAtCollege.getYears();
    }
     public String listOfSubjectsCertifiedToTeach(){
        String list = String.join(", ", teachableCourse);
        return list;
     }
    public void setEmployeeNumber(int EN)
    {
        if (EN >0){
            this.employeeNumber = EN;
        }else{
            throw new IllegalArgumentException("Must be more than 0");}
           
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public ArrayList<String> getTeachableCourses() {
        return teachableCourse;
    }
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " " + employeeNumber;
    }
}
