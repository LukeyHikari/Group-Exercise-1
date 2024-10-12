import java.util.ArrayList;

public class Main {
    public static void displayAll(ArrayList<Home> homeList){
        for (Home home : homeList) home.displayListing();
    }

    //TODO Input maybe??
    public static void addNewListing(ArrayList<Home> homeList){
        homeList.add(Home.newListing("sample",
                "sample", "sample", 100,
                20, 2, 2));
    }

    //TODO displayPriceSorted(), displaySortedBed(), displaySortedBathNo(), displaySortedArea()

    public static void main(String[] args) {
        ArrayList<Home> homes = new ArrayList<>();
        addNewListing(homes);
/*        homes.add(Home.newListing("2ba2be01",
                "1 Main St., LA", "Listed", 100000,
                36, 2,2));*/
        displayAll(homes);
    }
}

