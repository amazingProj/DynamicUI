package com.example.hackton5clubz.Models;

public class DataSourceDestinations {
    public String[][] destinations ;
    private static DataSourceDestinations instance;
    public static DataSourceDestinations getInstance(){
        if (instance == null)
            instance = new DataSourceDestinations();
        return instance;
    }

    public DataSourceDestinations(){}

}
