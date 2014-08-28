package com.springapp.controller;

import com.springapp.model.Location;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController implements javax.servlet.Servlet{

    @RequestMapping("/index.do")
    public String printWelcome(ModelMap model) {
		return "index";
	}


//    @RequestMapping("/location.do")
//    public String viewLocation(ModelMap model) {
//        return "index";
//    }
//    @RequestMapping("/phone.do")
//    public String viewPhone(ModelMap model) {
//        return "index";
//    }
//    @RequestMapping("/sms.do")
//    public String viewSms(ModelMap model) {
//        return "index";
//    }
//    @RequestMapping("/photo.do")
//    public String viewPhoto(ModelMap model) {
//        return "index";
//    }
//    @RequestMapping("/bookmark.do")
//    public String viewBookmark(ModelMap model) {
//        return "index";
//    }

    /**js에서 호출하여 데이터를 가져온다. auto Scrolling 부분*/



    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}