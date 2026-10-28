/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elips
 */
public class Fitbyte {
    private int age;
    private int heartRate;
    
    public Fitbyte(int age, int heartRate){
        this.age = age;
        this.heartRate = heartRate;
    }
    private double calMHR(){
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentage){
        return ((calMHR() - this.heartRate) * (percentage) + this.heartRate);
    }
}
