package com.springapp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * RESTful API 요청에대해서 처리하는 클래스입니다.
 * 컨트롤러 입니다.
 * Created by 영진 on 7/25/14.
 */
@Controller
public class ApiController {

    /* cors example */
    @RequestMapping("serve/resoruce")
    public ResponseEntity<String> servingCorsResource() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        ResponseEntity<String> entity = new ResponseEntity<String>("hello", headers, HttpStatus.OK);
        return entity;
    }

    /* 사용자 위치 저장 컨트롤러 */
    @RequestMapping(value = "location", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> createLocation() {
        System.out.println("locController");
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", Boolean.TRUE);
        return result;
    }

    /* 사용자 위치 읽기 컨트롤러 */
    @RequestMapping(value = "location", method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> readLocation() {

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", Boolean.TRUE);
        return result;
    }

    /* 사용자 위치 업데이트 컨트롤러 */
    @RequestMapping(value = "location", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> updateLocation() {

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", Boolean.TRUE);
        return result;
    }

    /* 사용자 위치 저장 컨트롤러 */
    @RequestMapping(value = "location", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> insertLocation() {

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", Boolean.TRUE);
        return result;
    }
}


/*
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonDao personDao;

    @RequestMapping("person.do")
    public String insertPerson() {
        Person person = new Person("RJ", "26");
        System.out.println(person.toString());
        try {
            personDao.insertPerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Person retrivedPerson = personDao.getPerson(person.getId());
            System.out.println(retrivedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

*/