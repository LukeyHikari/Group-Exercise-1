import java.text.DecimalFormat;

public class Home{
    //Fields
    String HomeId, address, status, bedAndBath;
    double price, area;

    //Create double precision decimal format for display
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //Constructor
    public Home(String HomeId, String address, String status,
                double price, double area, String bedAndBath) {
        this.HomeId = HomeId;
        this.address = address;
        this.status = status;
        this.price = price;
        this.area = area;
        this.bedAndBath = bedAndBath;
    }

    //Method for Object Creation
    public static Home newListing(String HomeId, String address,
                                  String status, double price,
                                  double area, String bedAndBath) {
        return new Home(HomeId, address, status, price, area, bedAndBath);
    }

    //Display Method
    public void displayListing(){
        System.out.println("Displaying details of " + HomeId);
        System.out.println("\tAddress: " + address);
        System.out.println("\tPrice: Php " + df.format(price));
        System.out.println("\tStatus: " + status);
        System.out.println("\tArea: " + df.format(area) + "sqm");
        System.out.println("\tRooms: " + bedAndBath + "\n");
    }

    //Price Update Method
    public void updatePrice(double price){
        System.out.println("------------------------------");
        System.out.println("Updating Price of " + HomeId + "... " + "Php " + df.format(price));
        this.price = price;
        System.out.println("------------------------------" + "\n");
    }

    //Status Update Method
    public void updateStatus(String status){
        System.out.println("------------------------------");
        System.out.println("Updating Status of " + HomeId + "... " + status);
        this.status = status;
        System.out.println("------------------------------" + "\n");
    }
}
