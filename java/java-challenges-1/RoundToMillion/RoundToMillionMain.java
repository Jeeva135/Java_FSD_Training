package RoundToMillion;

import RoundToMillion.City;

import java.util.ArrayList;
import java.util.List;

public class RoundToMillionMain {
    public static void roundToMillion(List <City> cities){
        List <City> result=new ArrayList<>();
        for (City city:cities) {
            int population = Integer.parseInt(city.population());
            if (population > 50000) {
                result.add(new City(city.cityName(), ""+Math.round(population / 1000000.0)*1000000));

            } else {
                result.add(new City(city.cityName(), "0"));
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        List <City> cities=new ArrayList<>();
        cities.add(new City("Nice","942208"));
        cities.add(new City("Abu Dhabi","1482816"));
        cities.add(new City("Naples","2186853"));
        cities.add(new City("Vatican RoundToMillion.City","572"));

        roundToMillion(cities);
    }
}
