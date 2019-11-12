package com.example.birdwatching;

public class Bird {
    public String birdname;
    public int zipcode;
    public String personname;
    //alt insert to get a drop down tab, then press constructor, Select none because Firebase is going to create a Bird Object
    //without giving it any properties
    //creating an empty constructor will create a Bird object without a birdname, zipcode and person name
    public Bird() {
    }
     //this time select all in constructor options...it will require birdname, personname and zipcode
    public Bird(String birdname, int zipcode, String personname) {
        this.birdname = birdname;
        this.zipcode =zipcode;
        this.personname = personname;

    }


    public Bird(String name, String birdName, String zipCode) {
    }
}
