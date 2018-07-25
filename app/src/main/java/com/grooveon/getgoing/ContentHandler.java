
package com.grooveon.getgoing;


public class ContentHandler {

    private String mAttractionName;
    private String mLocation;
    private String mTravelTime;
    private String mTimeInterval;
    private int mImageId;

    public ContentHandler(String AttractionName, String Location, String TravelTime, String TimeInterval, int ImageId) {
        mAttractionName = AttractionName;
        mLocation = Location;
        mTravelTime = TravelTime;
        mTimeInterval = TimeInterval;
        mImageId = ImageId;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTimeInterval() {return mTimeInterval;    }

    public String getmTravelTime() {  return mTravelTime;  }

    public int getmImageId() {
        return mImageId;
    }

}