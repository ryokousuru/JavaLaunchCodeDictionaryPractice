package com.launchcode.java;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryPractice {

    public static void main(String[] args) {

	//English to Czech Dictionary
        Map<String, String>englCzechDictionary = new HashMap<String, String>();
        //adding entries to dictionary
        englCzechDictionary.put("Monday", "pondělí");
        englCzechDictionary.put("Tuesday", "úterý");
        englCzechDictionary.put("Wednesday", "středa");
        englCzechDictionary.put("Thursday", "čtvrtek");
        englCzechDictionary.put("Friday", "pátek");
        englCzechDictionary.put("Saturday", "sobota");
        englCzechDictionary.put("Sunday", "neděle");
        englCzechDictionary.put("week", "týden");
        englCzechDictionary.put("day", "den");
        englCzechDictionary.put("weekend", "víkend");
        englCzechDictionary.put("weekday", "všední dny");
        englCzechDictionary.put("January", "leden");
        englCzechDictionary.put("February", "únor");
        englCzechDictionary.put("March", "březen");
        englCzechDictionary.put("April", "duben");
        englCzechDictionary.put("May", "květen");
        englCzechDictionary.put("June", "červen");
        englCzechDictionary.put("July", "červenec");
        englCzechDictionary.put("August", "srpen");
        englCzechDictionary.put("September", "září");
        englCzechDictionary.put("October", "říjen");
        englCzechDictionary.put("November", "listopad");
        englCzechDictionary.put("December", "prosinec");
        englCzechDictionary.put("month", "měsíc");
        englCzechDictionary.put("year", "rok");
        englCzechDictionary.put("black", "černá");
        englCzechDictionary.put("white", "bilá");
        englCzechDictionary.put("gray", "šedá");
        englCzechDictionary.put("red", "červená");
        englCzechDictionary.put("blue", "modrá");
        englCzechDictionary.put("yellow", "žlutá");
        englCzechDictionary.put("green", "zelená");
        englCzechDictionary.put("orange", "oranžová");
        englCzechDictionary.put("purple", "fialová");
        englCzechDictionary.put("brown", "hněda");
        englCzechDictionary.put("pink", "růžová");
        englCzechDictionary.put("beige", "béžový");
        englCzechDictionary.put("color", "barva");
        englCzechDictionary.put("monorail", "jednokolejka");
        englCzechDictionary.put("car", "auto");
        englCzechDictionary.put("bus", "autobus");
        englCzechDictionary.put("taxi", "taxík");
        englCzechDictionary.put("van", "dodávka");
        englCzechDictionary.put("wagon", "vagón");
        englCzechDictionary.put("truck", "kamion");
        englCzechDictionary.put("train", "vlak");
        englCzechDictionary.put("trolley", "trolejbus");
        englCzechDictionary.put("tram", "tramvaj");
        englCzechDictionary.put("airplane", "letadlo");
        englCzechDictionary.put("airline", "letadlo");
        englCzechDictionary.put("boat", "lod'");
        englCzechDictionary.put("ship", "lod'");
        englCzechDictionary.put("ferry", "trajekt");
        englCzechDictionary.put("bicycle", "kolo");
        englCzechDictionary.put("motorcycle", "motocykl");
        englCzechDictionary.put("subway", "metro");
        englCzechDictionary.put("transportation", "přeprava");
        System.out.println(englCzechDictionary.get("white"));
        System.out.println(englCzechDictionary.get("monorail"));
        System.out.println(englCzechDictionary.get("November"));
        System.out.println(englCzechDictionary.get("bicycle"));

        //prints out all the keys
        System.out.println(englCzechDictionary.keySet());
        //prints out all the values
        System.out.println(englCzechDictionary.values());
        System.out.println("The size of the dictionary " +
                "is " + englCzechDictionary.size());

        System.out.println();
        System.out.println();

        //shopping list

        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        //adding entries to dictionary
        shoppingList.put("Purple tennis shoe", true);
        shoppingList.put("Banana flavored milk",Boolean.TRUE);
        shoppingList.put("beige socks", true);
        shoppingList.put("white dress shirt", true);
        shoppingList.put("dark glasses", Boolean.FALSE);
        shoppingList.put("a rust colored brick", false);
        shoppingList.put("airplane ticket to Belgrade", true);
        shoppingList.put("bubble bath liquid", true);
        //retrieve items from shopping list
        System.out.println(shoppingList.get("bubble bath liquid"));
        System.out.println(shoppingList.get("a rust colored brick"));
        System.out.println(shoppingList.get("Banana flavored milk"));
        System.out.println(shoppingList.get("dark glasses"));

        //Key value pair printout

        System.out.println(shoppingList.toString());

        //remove an item

        shoppingList.remove("beige socks");

        //replace value for a particular key

        shoppingList.replace("white dress shirt", false);

        //Is the dictionary empty?

        System.out.println(shoppingList.isEmpty());  //false

        System.out.println(shoppingList.toString());

        //clear the dictionary

        shoppingList.clear();

        System.out.println(shoppingList.toString());

        //Checking again to see if the dictionary is empty

        System.out.println(shoppingList.isEmpty()); //true
        System.out.println();
        System.out.println();
    }
}
