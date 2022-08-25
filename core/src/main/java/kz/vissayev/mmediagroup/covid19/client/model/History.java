package kz.vissayev.mmediagroup.covid19.client.model;

import kz.vissayev.mmediagroup.covid19.client.interfaces.CovidData;

import java.util.Map;

public class History implements CovidData {

    private String country;
    private int population;
    private int sq_km_area;
    private String life_expectancy;
    private String elevation_in_meters;
    private String continent;
    private String abbreviation;
    private String location;
    private String iso;
    private String capital_city;
    private Map<String, String> dates;

    public History(String country,
                   int population,
                   int sq_km_area,
                   String life_expectancy,
                   String elevation_in_meters,
                   String continent,
                   String abbreviation,
                   String location,
                   String iso,
                   String capital_city,
                   Map<String, String> dates) {
        this.country = country;
        this.population = population;
        this.sq_km_area = sq_km_area;
        this.life_expectancy = life_expectancy;
        this.elevation_in_meters = elevation_in_meters;
        this.continent = continent;
        this.abbreviation = abbreviation;
        this.location = location;
        this.iso = iso;
        this.capital_city = capital_city;
        this.dates = dates;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getSq_km_area() {
        return sq_km_area;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public String getElevation_in_meters() {
        return elevation_in_meters;
    }

    public String getContinent() {
        return continent;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getLocation() {
        return location;
    }

    public String getIso() {
        return iso;
    }

    public String getCapital_city() {
        return capital_city;
    }

    public Map<String, String> getDates() {
        return dates;
    }

    @Override
    public void parse() {

    }
}
