package kz.vissayev.mmediagroup.covid19.client.console;

import kz.vissayev.mmediagroup.covid19.client.Configuration;
import kz.vissayev.mmediagroup.covid19.client.ConsolePrint;
import kz.vissayev.mmediagroup.covid19.client.TextReport;
import kz.vissayev.mmediagroup.covid19.client.api.ApiException;
import kz.vissayev.mmediagroup.covid19.client.api.CasesApi;
import kz.vissayev.mmediagroup.covid19.client.api.HistoryApi;
import kz.vissayev.mmediagroup.covid19.client.api.VaccinesApi;

import java.io.IOException;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) throws ApiException {
        int exitCode = 1;
        System.out.println("Console application for API client by https://mmediagroup.fr/covid-19.");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("To exit the application, enter 'Exit'");
            System.out.println("Enter the name of the country information on which you are interested:");
            String nameCountry = scanner.nextLine();
            if("Exit".equals(nameCountry)) {
                break;
            }
            TextReport textReport = new TextReport(
                new CasesApi(nameCountry).execute(),
                new HistoryApi(nameCountry, "confirmed").execute(),
                new VaccinesApi(nameCountry).execute()
            );
            textReport.build();
            new ConsolePrint(textReport.report()).print();
        } while(true);
    }
}
