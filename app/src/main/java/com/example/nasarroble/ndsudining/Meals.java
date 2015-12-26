package com.example.nasarroble.ndsudining;

import java.util.ArrayList;

/**
 * Created by nasar on 12/26/15.
 */
public class Meals {

    private ArrayList<String> breakFast,lunch,dinner;
    public Meals(ArrayList<String> breakFast, ArrayList<String> lunch, ArrayList<String> dinner){
        this.breakFast = breakFast;
        this.lunch = lunch;
        this.dinner = dinner;
    }
    public Meals(){
    }

    public ArrayList<String> getBreakFast() {
        return breakFast;
    }

    public void setBreakFast(ArrayList<String> breakFast) {
        this.breakFast = breakFast;
    }

    public ArrayList<String> getLunch() {
        return lunch;
    }

    public void setLunch(ArrayList<String> lunch) {
        this.lunch = lunch;
    }

    public ArrayList<String> getDinner() {
        return dinner;
    }

    public void setDinner(ArrayList<String> dinner) {
        this.dinner = dinner;
    }





}
