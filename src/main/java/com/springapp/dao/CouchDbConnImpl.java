package com.springapp.dao;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.net.MalformedURLException;


@Repository("couchDbConn")
public class CouchDbConnImpl implements CouchDbConn {
    @Value("${url}")
    private String url;

    @Value("${id}")
    private String id;

    @Value("${password}")
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /* 예외처리부분 조사. */
    @Override
    public CouchDbInstance getCouchDbInstance() throws Exception {
        StdHttpClient httpClient = null;
        try{
            httpClient = (StdHttpClient) new StdHttpClient.Builder()
                    .username(id).password(password).url(url)
                    .connectionTimeout(100000).build();
        } catch (MalformedURLException e) {
            throw new Exception("Invalid URL" + url);
        }

        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        return dbInstance;
    }


    @Override
    public CouchDbConnector getCouchDbConnetor(String dbName) throws Exception {
        StdHttpClient httpClient = null;
        try{
            httpClient = (StdHttpClient) new StdHttpClient.Builder()
                    .username(id).password(password).url(url)
                    .connectionTimeout(100000).build();
        } catch (MalformedURLException e) {
            throw new Exception("Invalid URL" + url);
        }

        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        CouchDbConnector db = new StdCouchDbConnector(dbName, dbInstance);
        return db;
    }

    @Override
    public String toString() {
        return "CouchDbConnImpl [url=" + url + ", id=" + id + ", password="
                + password + "]";
    }


}
