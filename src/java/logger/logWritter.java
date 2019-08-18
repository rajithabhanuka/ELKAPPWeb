package logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bhanu
 */
public class logWritter {

    public StringBuffer writeLog(StringBuffer xmlfile, String logType, String user, String country, String hotelCode) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss.SSS");

        String time = dateFormat.format(new Date());
        String uniqueID = UUID.randomUUID().toString();

        StringBuffer buffer = new StringBuffer();
        buffer.append(time);
        buffer.append("::");
        buffer.append(logType);
        buffer.append("::");
        buffer.append(uniqueID);
        buffer.append("::");
        buffer.append(user);
        buffer.append("::");
        buffer.append(country);
        buffer.append("::");
        buffer.append(hotelCode);
        buffer.append("::");
        buffer.append(xmlfile);

        return buffer;
    }
}
