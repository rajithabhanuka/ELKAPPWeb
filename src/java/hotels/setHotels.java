package hotels;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bhanu
 */
public class setHotels {

    ArrayList<Hotel> al = new ArrayList<>();

    public ArrayList getHotels(String countryID) {

        if (null != countryID) {
            switch (countryID) {
                case "1":
                    Hotel hotel1 = new Hotel();
                    hotel1.setId(1);
                    hotel1.setName("Four Seasons Hotel Las Vegas");

                    Hotel hotel2 = new Hotel();
                    hotel2.setId(2);
                    hotel2.setName("Crosby Street Hotel");

                    Hotel hotel3 = new Hotel();
                    hotel3.setId(3);
                    hotel3.setName("Mandarin Oriental New York");

                    Hotel hotel4 = new Hotel();
                    hotel4.setId(4);
                    hotel4.setName("Fairmont Grand Hotel");

                    Hotel hotel5 = new Hotel();
                    hotel5.setId(5);
                    hotel5.setName("Ameritaniya Hotel");

                    Hotel hotel6 = new Hotel();
                    hotel6.setId(6);
                    hotel6.setName("Acqualina Resort");

                    Hotel hotel7 = new Hotel();
                    hotel7.setId(7);
                    hotel7.setName("ARIA Resort & Casino");

                    Hotel hotel8 = new Hotel();
                    hotel8.setId(8);
                    hotel8.setName("Bellagio Las Vegas");

                    al.add(hotel1);
                    al.add(hotel2);
                    al.add(hotel3);
                    al.add(hotel4);
                    al.add(hotel5);
                    al.add(hotel6);
                    al.add(hotel7);
                    al.add(hotel8);

                    break;
                case "2":

                    Hotel hotel9 = new Hotel();
                    hotel9.setId(9);
                    hotel9.setName("Four Seasons Hotel London at Park Lane");

                    Hotel hotel10 = new Hotel();
                    hotel10.setId(10);
                    hotel10.setName("Bulgari Hotel, London");

                    Hotel hotel11 = new Hotel();
                    hotel11.setId(11);
                    hotel11.setName("Rosewood London");

                    Hotel hotel12 = new Hotel();
                    hotel12.setId(12);
                    hotel12.setName("Sandford Country Cottages");

                    Hotel hotel13 = new Hotel();
                    hotel13.setId(13);
                    hotel13.setName("The Savoy");

                    Hotel hotel14 = new Hotel();
                    hotel14.setId(14);
                    hotel14.setName("The Lanesborough");

                    al.add(hotel9);
                    al.add(hotel10);
                    al.add(hotel11);
                    al.add(hotel12);
                    al.add(hotel13);
                    al.add(hotel14);

                    break;
                case "3":

                    Hotel hotel15 = new Hotel();
                    hotel15.setId(15);
                    hotel15.setName("Kempinski Residences St. Moritz");

                    Hotel hotel16 = new Hotel();
                    hotel16.setId(16);
                    hotel16.setName("Four Seasons Hotel des Bergues Geneva");

                    Hotel hotel17 = new Hotel();
                    hotel17.setId(17);
                    hotel17.setName("Park Hotel Vitznau");

                    Hotel hotel18 = new Hotel();
                    hotel18.setId(18);
                    hotel18.setName("The View Lugano");

                    Hotel hotel19 = new Hotel();
                    hotel19.setId(19);
                    hotel19.setName("Grand Resort Bad Ragaz");

                    Hotel hotel20 = new Hotel();
                    hotel20.setId(20);
                    hotel20.setName("The Dolder Grand");

                    al.add(hotel15);
                    al.add(hotel16);
                    al.add(hotel17);
                    al.add(hotel18);
                    al.add(hotel19);
                    al.add(hotel20);

                    break;
                case "4":

                    Hotel hotel21 = new Hotel();
                    hotel21.setId(21);
                    hotel21.setName("Hotel Diamant");

                    Hotel hotel22 = new Hotel();
                    hotel22.setId(22);
                    hotel22.setName("Domodedovo - Hotel Master");

                    Hotel hotel23 = new Hotel();
                    hotel23.setId(23);
                    hotel23.setName("Hotel Astoria");

                    Hotel hotel24 = new Hotel();
                    hotel24.setId(24);
                    hotel24.setName("Ararat Park Hyatt Moscow");

                    Hotel hotel25 = new Hotel();
                    hotel25.setId(25);
                    hotel25.setName("Metropol Hotel");

                    al.add(hotel21);
                    al.add(hotel22);
                    al.add(hotel23);
                    al.add(hotel24);
                    al.add(hotel25);

                    break;
                case "5":

                    Hotel hotel26 = new Hotel();
                    hotel26.setId(26);
                    hotel26.setName("Mandarin Oriental, Munich");

                    Hotel hotel27 = new Hotel();
                    hotel27.setId(27);
                    hotel27.setName("Hotel Adlon Kempinski Berlin");

                    Hotel hotel28 = new Hotel();
                    hotel28.setId(28);
                    hotel28.setName("Villa Kennedy");

                    Hotel hotel29 = new Hotel();
                    hotel29.setId(29);
                    hotel29.setName("Schlosshotel Kronberg");

                    Hotel hotel30 = new Hotel();
                    hotel30.setId(30);
                    hotel30.setName("Adina Hotel Checkpoint Charlie Berlin");

                    al.add(hotel26);
                    al.add(hotel27);
                    al.add(hotel28);
                    al.add(hotel29);
                    al.add(hotel30);

                    break;
                default:
                    break;
            }
        }

        return al;
    }

}
