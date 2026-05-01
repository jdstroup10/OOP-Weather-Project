

public class Main {
    public static void main(String[] args) {

        //Account/Authenticate testing (Working) - Jason S
        Account test = Account.createAccount(1);
        test.printAccount(test);

         //testing - Jason S
    //Create weatherapi object for fetch/parse
    String key = "be22faad5317fe55300a1ccd39259e49"; //api key - Jason S
    String url = "https://api.openweathermap.org/data/2.5/weather";
    WeatherAPI api = new WeatherAPI(key, url);

    Weather weather = api.fetch("Austin");
    System.out.println(weather.getReport());

        
    }
}
