/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author castr
 */
public class Forward extends Player {

    int numGoalsCored;

    public Forward(int numGoalsCored, String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalsCored = numGoalsCored;
    }
    
    public Forward(String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalsCored = 0;
    }
    
    
    
    
}
