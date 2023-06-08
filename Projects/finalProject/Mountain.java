public class Mountain{
    //Variables
    private String mountainName;
    private String mountainCountry;
    private int mountainHeight;
    private double heightInMeters;

    public Mountain(){
        mountainName = "No mountain";
        mountainCountry = "No country";
        mountainHeight = 0;
        heightInMeters = 0;
    }
    
    //Set Name
    public void setName(String mountain){
        mountainName = mountain;
    }
    //get Name
    public String getName(){
        return mountainName;
    }
    //set country
    public void setCountry(String country){
        mountainCountry = country;
    }
    //get country
    public String getCountry(){
        return mountainCountry;
    }
    //set height
    public void setHeight(int height){
        mountainHeight = height;
    }
    //get heigh
    public int getHeight(){
        return mountainHeight;
    }
  
     
    public int toMeters(int feet){
        heightInMeters = feet/3.2808;
        return (int) heightInMeters;
    }
}