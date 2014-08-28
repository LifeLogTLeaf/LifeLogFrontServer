package com.springapp.controller;

import com.springapp.model.Location;
import com.springapp.model.User;
import com.springapp.service.ApiServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoonsKim on 2014. 7. 28..
 */

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private ApiServiceImple apiService;


    @RequestMapping(value="/add.do")
    public ModelAndView insertLocation(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("add_location");


        return mav;
    }

    @RequestMapping(value="/update.do")
    public ModelAndView updateLocation(Location location){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("update_location");
        mav.addObject("id",location.getId());
        return mav;
    }



    @RequestMapping(value="/add_result.do")
    public ModelAndView resultAddLocation(Location location) {

        ModelAndView mav = new ModelAndView();
        Location retrivedLocation=null;
        System.out.println(location.toString());
        try {
            apiService.insertLocation(location);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            retrivedLocation = apiService.readLocation(location.getId());
            System.out.println(retrivedLocation);
        } catch (Exception e) {
            System.out.println("read error : db");
            e.printStackTrace();

        }

        System.out.println("result "+retrivedLocation.toString());
        mav.setViewName("result_add_location");
        mav.addObject("location", retrivedLocation.toString());


        return mav;
    }
    @RequestMapping(value="/update_result.do")
    public ModelAndView resultUpdateLocation(Location location) {

        ModelAndView mav = new ModelAndView();
        Location retrivedLocation=null;
        System.out.println("update Data :" + location.toString());
        try {
            apiService.updateLocation(location);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            retrivedLocation = apiService.readLocation(location.getId());
            System.out.println(retrivedLocation);
        } catch (Exception e) {
            System.out.println("read error : db");
            e.printStackTrace();

        }


        mav.setViewName("result_add_location");



        return mav;
    }






    @RequestMapping(value="/list_location.do")
    public String getLocationList(ModelMap model) throws Exception {
        List<String> listLocationId = null;
        ArrayList<Location> arrLocation  =new ArrayList<Location>();
        Location location=null;


        //좌표 아이디 목록 수집
        listLocationId= apiService.readLocationList();


        for (String id : listLocationId){
            System.out.println(id);
            location = apiService.readLocation(id);
            arrLocation.add(location);

        }

        model.addAttribute("listSize", listLocationId.size());//총 데이터 갯수
        model.addAttribute("listLocation",arrLocation);//데이터 목록

        return "list_location";
    }



    @RequestMapping(value="/del_location.do")
    public String deleteLocation(ModelMap model,@RequestParam("id") String id) throws Exception {

        List<String> listLocationId = null;
        List<Location> listLocation = null;

        //해당 아이디의 데이터삭제
        apiService.deleteLocation(id);

        //좌표 아이디 목록 재수집
        ArrayList<Location> arrLocation  =new ArrayList<Location>();


        //좌표 아이디 목록 수집
        listLocationId= apiService.readLocationList();


        for (String locId : listLocationId){
            Location location=null;
            System.out.println(locId);
            location = apiService.readLocation(locId);
            arrLocation.add(location);

        }

        model.addAttribute("listSize", listLocationId.size());//총 데이터 갯수
        model.addAttribute("listLocation",arrLocation);//데이터 목록



        return "list_location";
    }

}
