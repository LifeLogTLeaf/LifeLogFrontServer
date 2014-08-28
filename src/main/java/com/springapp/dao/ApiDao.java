package com.springapp.dao;

import com.springapp.model.Location;

import java.util.List;

/**
 * Created by jangyoungjin on 7/27/14.
 */
public interface ApiDao {
    void insertLocation(Location location) throws Exception;

    void updateLocation(Location location) throws Exception;

    void deleteLocation(String id) throws Exception;

    Location readLocation(String id) throws Exception;
    List<String> readLocationList() throws Exception;
}
