/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elips
 */
public class Timer {

    int miliSeconds;
    int seconds;

    public Timer() {
        this.miliSeconds = 0;
        this.seconds = 0;
    }

    public void advance() {
        this.miliSeconds++;
        if (this.miliSeconds == 100) {
            this.miliSeconds = 0;
            this.seconds++;
        }
        if(this.seconds == 60){
            this.seconds = 0;
        }
    }
    
    @Override
    public String toString() {
        if(this.seconds < 10 && this.miliSeconds < 10){
            return "0" + this.seconds + ":0" + this.miliSeconds;
        }else if(this.seconds >= 10 && this.miliSeconds < 10){
            return "" + this.seconds + ":0" + this.miliSeconds;
        }else if(this.seconds < 10 && this.miliSeconds >= 10){
            return "0" + this.seconds + ":" + this.miliSeconds;
        }else{
            return "" + this.seconds + ":" + this.miliSeconds;
        }
    }
}
