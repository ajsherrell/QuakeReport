package com.example.android.quakereport;

public class EarthQuake {

    // magnitude of earthquake
    private double mMagnitude;

    // place earthquake happened
    private String mLocation;

    // time of earthquake
    private long mTimeInMilliseconds;

    // url of earthquake
    private String mUrl;

    /**
     * create a new EarthQuake object
     *
     * @param magnitude is magnitude of earthquake
     * @param location is where earthquake occurred
     * @param timeInMilliseconds is when it happened
     * @param url is website of earthquake
     */
    public EarthQuake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // getters
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
