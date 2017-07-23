package com.example.android.quakereport;


public class Earthquake
{
    //Magnitude of earthquake
    private String mMagnitude;

    //Location of earthquake
    private String mLocation;

    //Date of earthquake
    private String mDate;


    public Earthquake(String magnitude,String location,String date)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
    }

    public String getMagnitude()
    {
        return mMagnitude;
    }
    public String getLocation()
    {
        return mLocation;
    }
    public String getDate()
    {
        return mDate;
    }

}
