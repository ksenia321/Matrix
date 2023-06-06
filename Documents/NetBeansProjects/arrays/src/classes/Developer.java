/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Student
 */
public class Developer extends User{
    private int salary;
    private int age;
    private int workExperience;

    public Developer(int salary, int age, int workExperience, String login, String password) {
        super(login, password);
        this.salary = salary;
        this.age = age;
        this.workExperience = workExperience;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    
            
}
