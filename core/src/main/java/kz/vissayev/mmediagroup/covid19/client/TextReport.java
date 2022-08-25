package kz.vissayev.mmediagroup.covid19.client;

import kz.vissayev.mmediagroup.covid19.client.api.ApiResponse;
import kz.vissayev.mmediagroup.covid19.client.interfaces.Report;
import kz.vissayev.mmediagroup.covid19.client.model.Case;
import kz.vissayev.mmediagroup.covid19.client.model.History;
import kz.vissayev.mmediagroup.covid19.client.model.Vaccine;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TextReport implements Report {

    private ApiResponse casesResponse;
    private ApiResponse historyResponse;
    private ApiResponse vaccinesResponse;

    private String text;

    public TextReport(ApiResponse casesResponse, ApiResponse historyResponse, ApiResponse vaccinesResponse) {
        this.casesResponse = casesResponse;
        this.historyResponse = historyResponse;
        this.vaccinesResponse = vaccinesResponse;
    }

    @Override
    public void build() {
        StringBuilder stringReport = new StringBuilder();
        stringReport.append(this.casesPartReportBuild());
        stringReport.append(this.vaccinesPartReportBuild());
        stringReport.append(this.historyPartReportBuild());
        this.text = stringReport.toString();
    }

    private String casesPartReportBuild() {
        Map<String, Case> cases = (Map<String, Case>)this.casesResponse.responseBodyData();
        Case allDataCase = cases.get("All");
        return "confirmed: " + allDataCase.getConfirmed() + "\n" +
                "recovered: " + allDataCase.getRecovered() + "\n" +
                "deaths: " + allDataCase.getDeaths() + "\n";
    }

    private String vaccinesPartReportBuild() {
        Map<String, Vaccine> vaccines = (Map<String, Vaccine>)this.vaccinesResponse.responseBodyData();
        Vaccine allDataVaccine = vaccines.get("All");
        return "vaccinated level in % of total population: "
                + ((allDataVaccine.getPeople_vaccinated() * 100)/allDataVaccine.getPopulation()) + "%\n";
    }

    private String historyPartReportBuild() {
        Map<String, History> histories = (Map<String, History>)this.historyResponse.responseBodyData();
        History allDataHistroy = histories.get("All");
        List<String> confirmed = allDataHistroy.getDates().entrySet().stream()
                .limit(2)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        return "The increase in cases per day: "
                + (Integer.valueOf(confirmed.get(0))
                    - Integer.valueOf(confirmed.get(1)))
                + "\n";
    }

    public String report() {
        return this.text;
    }
}
