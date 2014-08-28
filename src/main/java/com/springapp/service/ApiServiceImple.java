package com.springapp.service;

import com.springapp.dao.ApiDao;
import com.springapp.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jangyoungjin on 7/26/14.
 */
@Service
public class ApiServiceImple {
    @Autowired
    private ApiDao apiDao;

    public void insertLocation(Location location) {
        try {
            apiDao.insertLocation(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateLocation(Location location) {
        System.out.println(location.toString());
        try {
            apiDao.updateLocation(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteLocation(String id) {
        try {
            apiDao.deleteLocation(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Location readLocation(String id) {
        Location location=null;
        try {
            location= apiDao.readLocation(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return location;
    }

    public List<String> readLocationList() {
        List<String> locList=null;
        try {
            locList= apiDao.readLocationList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return locList;
    }

}


/*

@Service
public class PersonServiceImple implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public Person getMovie(String id) throws Exception {
        return personDao.getPerson(id);
    }

    @Override
    public List<Person> getMovieList() throws Exception {
        return personDao.getPersonList();
    }

    @Override
    public void insertMovie(Person person) throws Exception {
        personDao.insertPerson(person);
    }


    @Override
    public void updateMovie(Person person) throws Exception {
        personDao.updatePerson(person);
    }


    @Override
    public void deleteMovie(String id) throws Exception {
        personDao.deletePerson(id);
    }
}


*/