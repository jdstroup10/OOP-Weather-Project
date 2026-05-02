
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Testing Account Creation - Jason S
        //Account/Authenticate testing (Working) - Jason S
        Account test = Account.createAccount(1);
        test.printAccount(test);

        //testing API - Jason S
        //Create weatherapi object for fetch/parse
        String key = "be22faad5317fe55300a1ccd39259e49"; //api key - Jason S
        String url = "https://api.openweathermap.org/data/2.5/weather";
        WeatherAPI api = new WeatherAPI(key, url);

        Scanner scanner = new Scanner(System.in);

        //User inputs - Add validation if there is time
        System.out.print("Enter your city.");
        String city = scanner.nextLine(); //Issue with spaces (ex: San Diego) - Jason 

        System.out.print("Enter your Zip code.");
        String zip = scanner.nextLine();

        System.out.print("Enter your State.");
        String state = scanner.nextLine();

        Weather weather = api.fetch(city);
        System.out.println(weather.getReport());

        //Clothes Test - Jason S
        Clothes clothes = new Clothes();
        List<String> match = clothes.matchItems(weather);
        System.out.println(match);


        
    }
}
