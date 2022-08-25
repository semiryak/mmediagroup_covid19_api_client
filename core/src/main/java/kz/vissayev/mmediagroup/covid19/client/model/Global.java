package kz.vissayev.mmediagroup.covid19.client.model;

public class Global {

    public long population;
    public int confirmed;
    public int recovered;
    public int deaths;

    public Global(long population, int confirmed, int recovered, int deaths) {
        this.population = population;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
    }

    public long getPopulation() {
        return population;
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
}
