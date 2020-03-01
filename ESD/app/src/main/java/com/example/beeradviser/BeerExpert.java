package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch (color){
            case "light":
                brands.add("Dogfish Head Slighty Mighty");
                brands.add("Harpoon Rec League");
                brands.add("Lone Tree Mexican Lager");
                break;
            case "amber":
                brands.add("Rogue American Amber Ale");
                brands.add("Alaskan Brewing Amber");
                brands.add("Wasatch Brewery Evolution Amber Ale");
                break;
            case "brown":
                brands.add("Underground Mountain Brown");
                brands.add("French Toast");
                brands.add("Sumatra Mountain Brown");
                break;
            case "dark":
                brands.add("Saunter");
                brands.add("Compensation");
                brands.add("Stronghold Session Ale");
                break;
        }
        return brands;
    }
}