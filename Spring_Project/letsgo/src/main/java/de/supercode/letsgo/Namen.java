package de.supercode.letsgo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Namen {
    private ArrayList<String> namen;

    public Namen() {
        this.namen = new ArrayList<>();
    }

    public ArrayList<String> getNamen() {
        return namen;
    }

   

}
