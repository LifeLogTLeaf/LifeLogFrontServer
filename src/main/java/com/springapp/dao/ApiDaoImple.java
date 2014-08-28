package com.springapp.dao;

import com.springapp.model.Location;
import org.ektorp.CouchDbConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jangyoungjin on 7/26/14.
 */

@Component
public class ApiDaoImple implements ApiDao {

    @Autowired
    private CouchDbConn couchDbConn;

    public CouchDbConn getCouchDbConn() {
        return couchDbConn;
    }

    public void setCouchDbConn(CouchDbConn couchDbConn) {
        this.couchDbConn = couchDbConn;
    }


    @Override
    public void insertLocation(Location location) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("Location");
        db.createDatabaseIfNotExists();
        db.create(location);
    }


    @Override
    public void updateLocation(Location location) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("Location");
        db.createDatabaseIfNotExists();
        db.update(location);

    }

    @Override
    public void deleteLocation(String id) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("Location");
        db.createDatabaseIfNotExists();
        Location delPerson = db.get(Location.class, id);
        db.delete(delPerson);
    }

    @Override
    public Location readLocation(String id) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("Location");
        db.createDatabaseIfNotExists();
        return db.get(Location.class, id);
    }

    @Override
    public List<String> readLocationList() throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("Location");
        db.createDatabaseIfNotExists();

        return db.getAllDocIds();


    }



}

/*

@Component
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private CouchDbConn couchDbConn;


    public CouchDbConn getCouchdbConn() {
        return couchDbConn;
    }

    public void setCouchdbConn(CouchDbConn couchDbConn) {
        this.couchDbConn = couchDbConn;
    }

    @Override
    public Person getPerson(String id) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("person");
        db.createDatabaseIfNotExists();

        return db.get(Person.class, id);
    }

    @Override
    public List<Person> getPersonList() throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("person");
        db.createDatabaseIfNotExists();

        db.getAllDocIds();

        return null;

    }

    @Override
    public void insertPerson(Person person) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("person");
        db.createDatabaseIfNotExists();
        db.create(person);
    }

    @Override
    public void updatePerson(Person person) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("person");
        db.createDatabaseIfNotExists();
        db.update(person);

    }

    @Override
    public void deletePerson(String id) throws Exception {
        CouchDbConnector db = couchDbConn.getCouchDbConnetor("person");
        db.createDatabaseIfNotExists();
        Person delPerson = db.get(Person.class, id);
        db.delete(delPerson);
    }

}


*/
