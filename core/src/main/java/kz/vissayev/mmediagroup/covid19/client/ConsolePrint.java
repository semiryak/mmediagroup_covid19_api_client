package kz.vissayev.mmediagroup.covid19.client;

import kz.vissayev.mmediagroup.covid19.client.interfaces.Print;

public class ConsolePrint implements Print {

    private String message;

    public ConsolePrint(String message) {
        this.message = message;
    }
    @Override
    public void print() {
        System.out.println(this.message);
    }
}
