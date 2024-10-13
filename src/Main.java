import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create Simple ArrayList to Store All Listings
        ArrayList<Home> homes = new ArrayList<>();

        //Create Home Listings
        Home home1 = Home.newListing("Home1",
                "1234 Mabini Street, Ermita, Manila, Metro Manila 1000", "Listed",
                3500000, 36.59, "1 BR, 2 Baths");
        Home home2 = Home.newListing("Home2",
                "45 Sampaguita Avenue, Quezon City, Metro Manila 1101", "Listed",
                5000000, 50.17, "3 BR, 2 Baths");
        Home home3 = Home.newListing("Home3",
                "House 16, Greenmeadows Subdivision, Quezon City, Metro Manila 1110", "Reserved",
                3000000, 29.37, "1 BR, 1 Baths");

        //Add all listings to the list
        homes.add(home1);
        homes.add(home2);
        homes.add(home3);

        //Display all the listings
        for(int i = 0; i<3; i++) homes.get(i).displayListing();

        //Update listing
        home2.updatePrice(4500000);

        //Display the updated listing
        home2.displayListing();

        //Update listing
        home3.updateStatus("Sold");

        //Display the updated listing
        home3.displayListing();
    }
}

