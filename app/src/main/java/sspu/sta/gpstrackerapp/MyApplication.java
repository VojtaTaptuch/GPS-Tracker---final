package sspu.sta.gpstrackerapp;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

//Nastavení tabulky s Piny - Getters and Setters
public class MyApplication extends Application {

    private static MyApplication singleton;

    private List<Location> myLocations;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    public MyApplication getInstance() {
        return singleton;
    }

    public void onCreate() {
        super.onCreate();
        singleton = this;
        myLocations = new ArrayList<>();
    }
}
