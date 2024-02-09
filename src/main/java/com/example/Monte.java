package com.example;

import java.util.ArrayList;
import java.util.List;

public class Monte {
    private List<Carta> cartas  = new ArrayList<>();

    public Monte() {
        for(Naipe naipe: Naipe.values()){
            for(int i = 1; i <= 13; i++){
            cartas.add(new Carta(1, Naipe.Hearts));
            }
        }
    }
}
 