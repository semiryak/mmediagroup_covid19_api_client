package kz.vissayev.mmediagroup.covid19.client.model;

import kz.vissayev.mmediagroup.covid19.client.interfaces.CovidData;

public class Vaccine implements CovidData {

    private int administered;
    private int people_vaccinated;
    private int people_partially_vaccinated;
    private String country;
    private int population;
    private int sq_km_area;
    private String life_expectancy;
    private Object elevation_in_meters;
    private String continent;
    private String abbreviation;
    private String location;
    private String iso;
    private String capital_city;
    private String updated;

    public Vaccine(int administered,
                   int people_vaccinated,
                   int people_partially_vaccinated,
                   String country,
                   int population,
                   int sq_km_area,
                   String life_expectancy,
                   Object elevation_in_meters,
                   String continent,
                   String abbreviation,
                   String location,
                   String iso,
                   String capital_city,
                   String updated) {
        this.administered = administered;
        this.people_vaccinated = people_vaccinated;
        this.people_partially_vaccinated = people_partially_vaccinated;
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
        this.updated = updated;
    }

    public int getAdministered() {
        return administered;
    }

    public int getPeople_vaccinated() {
        return people_vaccinated;
    }

    public int getPeople_partially_vaccinated() {
        return people_partially_vaccinated;
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

    public Object getElevation_in_meters() {
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

    public String getUpdated() {
        return updated;
    }

    @Override
    public void parse() {

    }
}
