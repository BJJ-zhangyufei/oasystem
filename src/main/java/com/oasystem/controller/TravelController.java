package com.oasystem.controller;

import com.oasystem.dao.ManagerTravelDAO;
import com.oasystem.pojo.Travel;
import com.oasystem.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2018/10/16.
 */

@Controller
@RequestMapping("/travel")
public class TravelController {

    @Resource(name="managerTravelDAO")
    private ManagerTravelDAO  managerTravelDAO;

    @RequestMapping(value="/showAllTravel",method=RequestMethod.GET)
    public @ResponseBody Map getALLTravel(HttpServletRequest request){
        String pageSize=request.getParameter("rows");
        String currentPage=request.getParameter("page");

        int pageSizeInt=10;
        if(pageSize!=null&&!pageSize.equals("")){
            pageSizeInt=Integer.parseInt(pageSize);
        }
        int currentPageInt=1;
        if(currentPage!=null&&!currentPage.equals("")){
            currentPageInt= Integer.parseInt(currentPage);
        }

        List<Travel> travelList=managerTravelDAO.getALLTravel(pageSizeInt, currentPageInt);
        long total=managerTravelDAO.getTravelRow();
        Map jsonMap=new HashMap();
        jsonMap.put("total", total);
        jsonMap.put("rows", travelList);

        return jsonMap;
    }

    @RequestMapping(value="/tvadd",method=RequestMethod.POST)
    public @ResponseBody Map addTravel(HttpServletRequest request,HttpServletResponse response){
        String person;
        Map jsonMap=new HashMap();
        try {
            //todo
            person = new String(request.getParameter("person").getBytes("iso8859-1"),"UTF-8");
            String date=request.getParameter("date");
            String amount=request.getParameter("amount");
            String states=request.getParameter("state");
            String personIds=request.getParameter("personName");  //personId
            int state=Integer.parseInt(states);
            int personId=Integer.parseInt(personIds);
            User p=new User();
            p.setId(personId);

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return jsonMap;

    }
}
