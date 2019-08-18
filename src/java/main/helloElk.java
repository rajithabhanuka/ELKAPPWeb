package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logger.logWritter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Bhanu
 */
public class helloElk extends HttpServlet {

    final static Logger logger = LogManager.getLogger(helloElk.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String user = request.getParameter("selectto");
        String country = request.getParameter("selectcountry");
        String hotelcode = request.getParameter("selecthotel");
        String checkindate = request.getParameter("checkin");
        String checkoutdate = request.getParameter("checkout");
        String noofnights = request.getParameter("nights");
        String noofadults = request.getParameter("adults");
        String noofchildren = request.getParameter("children");
        String noofrooms = request.getParameter("rooms");

        String logType = "hotel_availability_request";

        String countryCodeString = "<countrycode>" + country + "</countrycode>";
        String hotelCodeString = "<hotelcode>" + hotelcode + "</hotelcode>";
        String checkindateString = "<checkindate>" + checkindate + "</checkindate>";
        String checkoutdateString = "<checkoutdate>" + checkoutdate + "</checkoutdate>";
        String noofadultsString = "<noofadults>" + noofadults + "</noofadults>";
        String noofchildrenString = "<noofchildren>" + noofchildren + "</noofchildren>";
        String noofnightsString = "<noofnights>" + noofnights + "</noofnights>";
        String noofroomsString = "<noofrooms>" + noofrooms + "</noofrooms>";

        StringBuffer buildRequest = new StringBuffer();
        buildRequest.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buildRequest.append("<availabilityRequest status=\"N\">");
        buildRequest.append(countryCodeString);
        buildRequest.append(hotelCodeString);
        buildRequest.append(checkindateString);
        buildRequest.append(checkoutdateString);
        buildRequest.append(noofadultsString);
        buildRequest.append(noofchildrenString);
        buildRequest.append(noofnightsString);
        buildRequest.append(noofroomsString);
        buildRequest.append("</availabilityRequest>");

        logWritter writter = new logWritter();
        String message = writter.writeLog(buildRequest, logType, user, country, hotelcode).toString();

        try {
            logger.debug(message);
            out.write(message);
//            String fileName = logType.replaceAll("_", "") + "" + System.currentTimeMillis() + ".log";            
//            String filePath = "C:\\Users\\Bhanu\\Desktop\\New folder\\" + fileName;
//            System.out.println(fileName);
//            String filePath = "/home/bhanuka/logs/" + fileName;
//            BufferedWriter bwr = new BufferedWriter(new FileWriter(new File(filePath)));
//            bwr.write(message);
//            bwr.newLine();
//            bwr.flush();
//            bwr.close();
//            out.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
