<%-- 
    Document   : index
    Created on : Aug 19, 2018, 9:01:55 PM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Availability Search</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body onload="loadDoc(1)">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4" id="col-md-4_">
                    <div class="col-md-12"> 
                        <h3 class="text-center">
                            Find Availability
                        </h3></div>
                    <form role="form" class="" method="POST" action="helloElk">
                        <div class="form-group">
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        Tour Operator
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_" name="selectto">
                                            <option>Tour Operator 1</option>
                                            <option>Tour Operator 2</option>
                                            <option>Tour Operator 3</option>
                                            <option>Tour Operator 4</option>
                                            <option>Tour Operator 5</option>
                                            <option>Tour Operator 6</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        Country
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_country" name="selectcountry" style="width: 250px; border: 1px solid #999999;" onchange="setCity(document.getElementById('select_country').value);">
                                            <option value="1">USA</option>
                                            <option value="2">United Kingdom</option>
                                            <option value="3">Switzerland</option>
                                            <option value="4">Russia</option>
                                            <option value="5">German</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        Hotel Name
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown" id="load_hotels">
                                        <div class="dropdown">
                                            <select class="btn" id="select_city" style="width: 250px; border: 1px solid #999999;" name="selecthotel">
                                                <option value="1">Four Seasons Hotel Las Vegas</option>
                                                <option value="2">Crosby Street Hotel</option>
                                                <option value="3">Mandarin Oriental New York</option>
                                                <option value="4">Fairmont Grand Hotel</option>
                                                <option value="5">Ameritaniya Hotel</option>
                                                <option value="6">Acqualina Resort</option>
                                                <option value="7">ARIA Resort &amp; Casino</option>
                                                <option value="8">Bellagio Las Vegas</option>
                                                <option value="9">Four Seasons Hotel London at Park Lane</option>
                                                <option value="10">Bulgari Hotel, London</option>
                                                <option value="11">Rosewood London</option>
                                                <option value="12">Sandford Country Cottages</option>
                                                <option value="13">The Savoy</option>
                                                <option value="14">The Lanesborough</option>
                                                <option value="15">Kempinski Residences St. Moritz</option>
                                                <option value="16">Four Seasons Hotel des Bergues Geneva</option>
                                                <option value="17">Park Hotel Vitznau</option>
                                                <option value="18">The View Lugano</option>
                                                <option value="19">Grand Resort Bad Ragaz</option>
                                                <option value="20">The Dolder Grand</option>
                                                <option value="21">Hotel Diamant</option>
                                                <option value="22">Domodedovo - Hotel Master</option>
                                                <option value="23">Hotel Astoria</option>
                                                <option value="24">Ararat Park Hyatt Moscow</option>
                                                <option value="25">Metropol Hotel</option>
                                                <option value="26">Mandarin Oriental, Munich</option>
                                                <option value="27">Hotel Adlon Kempinski Berlin</option>
                                                <option value="28">Villa Kennedy</option>
                                                <option value="29">Schlosshotel Kronberg</option>
                                                <option value="30">Adina Hotel Checkpoint Charlie Berlin</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        Check In Date
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <input type="date" name="checkin" class="btn" style="width: 250px; border: 1px solid #999999;" id="date_"/>
                                    </div>
                                </div>
                            </div>
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        Check Out Date
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <input type="date" name="checkout" class="btn" style="width: 250px; border: 1px solid #999999;" id="date_"/>
                                    </div>
                                </div>
                            </div>                            
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        No of Nights
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_" name="nights">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                            <option value="10">10</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        No of Adults
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_" name="adults">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        No of Children
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_" name="children">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                        </select>
                                    </div>
                                </div>
                            </div>

                            <div class="row" id="row_">
                                <div class="col-md-4"><label>
                                        No of Rooms
                                    </label>
                                </div>
                                <div class="col-md-8">
                                    <div class="dropdown">
                                        <select class="btn" id="select_" name="rooms">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">
                                Submit
                            </button>
                        </div>  
                    </form>
                </div>
                <div class="col-md-4"></div>
            </div>
        </div>
    </body>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    <script>

                                            function setCity(countryID) {
                                                loadDoc(countryID);
                                            }

                                            function loadDoc(countryID) {
                                                var xhttp = new XMLHttpRequest();
                                                xhttp.onreadystatechange = function () {
                                                    if (this.readyState == 4 && this.status == 200) {
                                                        document.getElementById("select_city").innerHTML = this.responseText;
                                                    }
                                                };
                                                xhttp.open("GET", "hotels.jsp?countryID=" + countryID + "", true);
                                                xhttp.send();
                                            }



    </script>
</html>
