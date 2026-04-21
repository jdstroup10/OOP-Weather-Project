
public class Location {

    private String state;
    private int zip;
    private String city;

    private WeatherAPI weatherAPI;
    private Clothes clothes;

    public Location(String state, int zip, String city, WeatherAPI weatherAPI, Clothes clothes){
        this.state = state;
        this.zip = zip;
        this.city = city;
        this.weatherAPI = weatherAPI;
        this.clothes = clothes;
    }

    //Setter Methods - Jason S
    public void setState(){

    }

    public void setZip(){

    }

    public void setCity(){

    }

    //Getter Methods - Jason S
    public String getState(){

        String userState;
        return userState;
    }

    public int getZip(){

        int userZip;
        return userZip;
    }

    public String getCity(){

        String userCity;
        return userCity;
    }
}
