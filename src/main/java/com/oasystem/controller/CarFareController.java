package com.oasystem.controller;

import com.oasystem.dao.ManagerCarFareDAO;
import com.oasystem.pojo.CarFare;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/carFare")
public class CarFareController {

    @Resource(name="managerCarFareDAO")
    private ManagerCarFareDAO  managerCarFareDAO;

    //all
    @RequestMapping(value="/showAllList",method=RequestMethod.GET)
    public @ResponseBody Map getALLCarFare(HttpServletRequest request){
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

        List<CarFare> CarFareList=managerCarFareDAO.getALLCarFare(pageSizeInt, currentPageInt);
        long total=managerCarFareDAO.getCarFareRow();
        Map jsonMap=new HashMap();
        jsonMap.put("total", total);
        jsonMap.put("rows", CarFareList);

        return jsonMap;
    }

    //澧炲姞
    @RequestMapping(value="/daadd",method=RequestMethod.POST)
    public @ResponseBody Map addtask(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
        String person;
        Map jsonMap=new HashMap();
        String reason = request.getParameter("reason");
        String amount=request.getParameter("amount");
        //BigDecimal bd = new BigDecimal("123.23");
        //DecimalFormat df =new DecimalFormat("###.##");
        //BigDecimal bd = df.format(new BigDecimal("amount"));
        int bill = Integer.parseInt("bill");
        String explain=request.getParameter("explain");
        String attach=request.getParameter("attach");
        //CarFare c = new CarFare();
        CarFare pl=new CarFare(reason,amount,attach,bill,explain);

        int result=managerCarFareDAO.addCarFare(pl);
        if(result>0){
            jsonMap.put("successmsg", "鎿嶄綔鎴愬姛");
        }else{
            jsonMap.put("errormsg", "鎿嶄綔鍑虹幇寮傚父");
        }

        return jsonMap;

    }

    //鍒犻櫎
    @RequestMapping(value="/deleteCarFare",method=RequestMethod.POST)
    public @ResponseBody Map deletetask(HttpServletRequest request){
        String ids=request.getParameter("id");

        int id=Integer.parseInt(ids);

        int result=managerCarFareDAO.deleteCarFare(id);

        Map jsonMap=new HashMap();
        if(result>0){
            jsonMap.put("successmsg", "鎿嶄綔鎴愬姛");
        }else{
            jsonMap.put("errormsg", "鎿嶄綔鍑虹幇寮傚父");
        }
        return jsonMap;

    }

    //鏇存柊
    @RequestMapping(value="/updateCarFare",method=RequestMethod.POST)
    public @ResponseBody Map updatetask(HttpServletRequest request) throws UnsupportedEncodingException{
        String name;
        Map jsonMap=new HashMap();
        String reason = request.getParameter("reason");
        String amount=request.getParameter("amount");
        int bill = Integer.parseInt("bill");
        String explain=request.getParameter("explain");
        String attach=request.getParameter("attach");
        //CarFare c = new CarFare();
        CarFare pl=new CarFare(reason,amount,attach,bill,explain);
        int result=managerCarFareDAO.updateCarFare(pl);
        //int result=managerCarFareDAO.updatePlanCategory(pl);
        if(result>0){
            jsonMap.put("successmsg", "鎿嶄綔鎴愬姛");
        }else{
            jsonMap.put("errormsg", "鎿嶄綔鍑虹幇寮傚父");
        }
        return jsonMap;

    }
}
