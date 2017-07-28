package com.example.android.quakereport;


public class Earthquake
{
    //Magnitude of earthquake
    private double mMagnitude;

    //Location of earthquake
    private String mLocation;

    //Date of earthquake
    private String mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;


    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude()
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
    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
