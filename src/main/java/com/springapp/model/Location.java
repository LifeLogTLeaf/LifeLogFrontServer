package com.springapp.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

/**
 * Created by jangyoungjin on 7/26/14.
 */

@JsonWriteNullProperties(false)
@JsonIgnoreProperties({"id", "revision"})
public class Location {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_rev")
    private String revision;
    private String latitude;  //위도
    private String longitude; //경도
    private String time;      //시간

    public Location() {
        super();
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Location : 위도 - " + latitude  + ", " +
                          "경도 - " + longitude +
                        ", 시간 - " + time +
                        ", id - " + id +
                        ", revision - " + revision;
    }
}
