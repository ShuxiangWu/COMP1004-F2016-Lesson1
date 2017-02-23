package assignment1;
/**
 *
 * @author shuxiang wu 200279010
 */
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private LocalDate birthDate;


    public Person(String FN, String LN, String SA, String C, String P, String PC, LocalDate BD){
            this.firstName=FN;
            this.lastName=LN;
            this.streetAddress=SA;
            this.city=C;
            this.province=P;
            this.postalCode=PC;
            this.birthDate=BD;
    }
    public void setFirstName(String FN){
        this.firstName=FN;
    }
    public void setLastName(String LN){
        this.lastName=LN;
    }
    public void setStreetAddress(String SA){
        this.streetAddress=SA;
    }
    public void setCity(String C){
        this.city=C;
    }
    public void setProvince(String P){
        this.province=P;
    }
    public void setPostalCode(String PC){
        if(postalCode.length()!=6){
            throw new IllegalArgumentException("only six characters!");
        }else{
            this.postalCode=PC;
        }
    }
    public void setBirthDate(LocalDate BD){
        this.birthDate=BD;
    }
    public String setFirstName(){
        return firstName;
    }
    public String setLastName(){
        return lastName;
    }
    public String setStreetAddress(){
        return streetAddress;
    }
    public String setCity(){
        return city;
    }
    public String setProvince(){
        return province;
    }
    public String setPostalCode(){
        return postalCode;
    }
    public LocalDate setBirthDate(){
        return birthDate;
    }
    public int getYearBorn(){
        return birthDate.getYear();
    }
    public int getAge(){
        int age = Period.between(birthDate,LocalDate.now()).getYears();
        return age;
    }
    public String getStreetAddress(){
        return streetAddress + ", " + city + ", " + province + ", " + postalCode;
    }
}
