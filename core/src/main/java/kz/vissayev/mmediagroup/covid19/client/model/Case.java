package kz.vissayev.mmediagroup.covid19.client.model;

import kz.vissayev.mmediagroup.covid19.client.interfaces.CovidData;

public class Case implements CovidData {

    private int confirmed;
    private int recovered;
    private int deaths;
    private String country;
    private int population;
    private int sq_km_area;
    private String life_expectancy;
    private int elevation_in_meters;
    private String continent;
    private String abbreviation;
    private String location;
    private int iso;
    private String capital_city;

    public Case(int confirmed,
                int recovered,
                int deaths,
                String country,
                int population,
                int sq_km_area,
                String life_expectancy,
                int elevation_in_meters,
                String continent,
                String abbreviation,
                String location,
                int iso,
                String capital_city) {
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
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
    }

    public int getConfirmed() {
        return confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public int getDeaths() {
        return deaths;
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

    public int getElevationInMeters() {
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

    public int getIso() {
        return iso;
    }

    public String getCapitalCity() {
        return capital_city;
    }

    @Override
    public void parse() {

    }
}
