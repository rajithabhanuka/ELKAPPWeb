<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="hotels.setHotels"%>
<%@page import="hotels.Hotel"%>
<%@page import="java.util.List"%>

<% System.out.println("Processing Hotels");
%>
<%
    ArrayList <Hotel> hotellist = null;
    String country = null;
    try {
        country = request.getParameter("countryID");
        setHotels cities = new setHotels();
        hotellist = cities.getHotels(country);
    } catch (Exception e) {
        e.printStackTrace();
    }

    for (Hotel hotel : hotellist) {
%>
<option value="<%=hotel.getId()%>"><%=hotel.getName()%></option>

<%
    }
%>
