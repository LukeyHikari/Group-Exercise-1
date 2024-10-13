public class Home{
    String HomeId, address, status;
    float price, area;
    int bathNo, bedNo;

    public Home(String HomeId, String address, String status,
                float price, float area, int bathNo, int bedNo){
        this.HomeId = HomeId;
        this.address = address;
        this.status = status;
        this.price = price;
        this.area = area;
        this.bathNo = bathNo;
        this.bedNo = bedNo;
    }

    public static Home newListing(String HomeId, String address,
                                  String status, float price,
                                  float area, int bathNo, int bedNo){
        System.out.println("Adding Listing " + HomeId);
        return new Home(HomeId, address, status, price, area, bathNo, bedNo);
    }

    public void displayListing(){
        System.out.println("Displaying HomeId " + HomeId);
        System.out.println("Address: " + address);
        System.out.println("Price: " + price + " Status: " + status);
        System.out.println("Area: " + area + "sqm");
        System.out.println(bedNo + " BR " + bathNo + " Baths");
    }

    public void updatePrice(int price){
        System.out.println("Updating Price " + price);
        this.price = price;
    }

    public void updateStatus(String status){
        System.out.println("Updating Status " + status);
        this.status = status;
    }
}
