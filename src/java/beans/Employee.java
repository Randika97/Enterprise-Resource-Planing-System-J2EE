/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import java.io.Serializable;
/**
 *
 * @author ALPHA
 */
public class Employee implements Serializable{
    
    private String Emp_id;
    private String Username;
    private String Emali;
    private String First_Name;
    private String Last_Name;
    private String Adress;
    private String Password;
    private String Age;
    private String PhoneNum;
    private String Discription;

    /**
     * @return the Emp_id
     */
    public String getEmp_id() {
        return Emp_id;
    }

    /**
     * @param Emp_id the Emp_id to set
     */
    public void setEmp_id(String Emp_id) {
        this.Emp_id = Emp_id;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Emali
     */
    public String getEmali() {
        return Emali;
    }

    /**
     * @param Emali the Emali to set
     */
    public void setEmali(String Emali) {
        this.Emali = Emali;
    }

    /**
     * @return the First_Name
     */
    public String getFirst_Name() {
        return First_Name;
    }

    /**
     * @param First_Name the First_Name to set
     */
    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    /**
     * @return the Last_Name
     */
    public String getLast_Name() {
        return Last_Name;
    }

    /**
     * @param Last_Name the Last_Name to set
     */
    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    /**
     * @return the Adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * @param Adress the Adress to set
     */
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Age
     */
    public String getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * @return the PhoneNum
     */
    public String getPhoneNum() {
        return PhoneNum;
    }

    /**
     * @param PhoneNum the PhoneNum to set
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * @return the Discription
     */
    public String getDiscription() {
        return Discription;
    }

    /**
     * @param Discription the Discription to set
     */
    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
    
    
    
}
