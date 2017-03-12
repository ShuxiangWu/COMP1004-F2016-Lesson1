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
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.ArrayList;
import static java.time.DayOfWeek.Saturday;
import static java.time.DayOfWeek.Sunday;

public class Course{
    private String courseCode, courseName, courseDescription, room;
    private Instructor instructor;
    private DayOfWeek dayOfClass;
    private LocalTime startTime;
    private int maxNumberOfStudents;
    private int duration;
    ArrayList<Student> Student;
    public Course(String courseCode, String courseName, String courseDescription, String room, Instructor instructor, DayOfWeek dayOfClass, LocalTime startTime, int maxNumberOfStudents, int duration){
    	 this.courseCode = courseCode; 
         this.courseName = courseName; 
         this.courseDescription = courseDescription; 
         this.room = room;
         this.instructor =instructor;
         this.dayOfClass = dayOfClass;
         this.startTime =startTime;
         this.maxNumberOfStudents = maxNumberOfStudents;
         this.duration = duration;
         Student = new ArrayList<>();
    }
    public void setStartTime(LocalTime startTime) {
	  if (startTime.isAfter(LocalTime.of(18, 0)) || startTime.isBefore(LocalTime.of(8, 0))){
	  throw new IllegalArgumentException("Must be between 8:00 and 18:00!");}
          else{
	  this.startTime = startTime;}
     }
    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
	  if(maxNumberOfStudents > 50 || maxNumberOfStudents < 10){
	  throw new IllegalArgumentException("Must be in the range of 10-50");}
	  else{
	  this.dayOfClass = dayOfClass;}
    }
    public void addStudent(Student student){
          if(student.inGoodStanding() == true && students.size() < maxNumberOfStudents){ 
          student.add(student);}
	  else{
	  throw new InvalidStudentException("Must be in good standing or class is full.");}
    }
    public double averageStudentTimeAtCollege(){
	  double averageStudentTimeAtCollege= 0;
	  for(Student student : student){
	  averageStudentTimeAtCollege = averageStudentTimeAtCollege + student.getYearsAtCollege();}
 	  else{
	  return averageStudentTimeAtCollege/student.size();}
    }
    public String getCourseCode() {  
        return courseCode;
    }
    public String getCourseName() {  
        return dayOfClass;
    }
    public DayOfWeek getDayOfClass() {  
        return courseDescription;
    }
    public String getRoom() {  
        return room;
    }
    public String courseDescription() {  
        return courseDescription;
    }
    public int getDuration() {  
        return duration
    }
    public int getMaxNumberOfStudents() {  
        return maxNumberOfStudents;
    }
    public LocalTime getStartTime() {  
        return startTime;
    }
    public int getNumberOfStudentsEnrolled() {  
        return student.size();
    }
    public Instructor getProf() {  
       return instructor;
    }
    public ArrayList getStudent(){
            return student;
    }
    public void setDayOfClass(DayOfWeek dayOfClass){
        if (dayOfWeek == Saturday || dayOfWeek == Sunday){
            throw new IllegalArgumentException("Cannot be on Saturday or Sunday");}
	else{
	this.dayOfWeek = dayOfWeek;
    }
    public void setProf(Instructor instructor) {
        if(instructor.canTeach(courseCode)){
            this.instructor = instructor;}
        else{ throw new IllegalArgumentException("Cannot teach.");}
    }
    public String toString(){
        return courseName + " " + courseCode;
    }
 
  