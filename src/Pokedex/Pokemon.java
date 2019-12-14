package Pokedex;

import java.lang.String;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class Pokemon {
    public String Name;
    public int PokeID;
    ArrayList<Pokemon_Type> Types = new ArrayList<Pokemon_Type>();
    ArrayList<Pokemon_Weakness> Weakness = new ArrayList<Pokemon_Weakness>();

    public Pokemon(){
        Name = "";
        PokeID = 0;
    }

    public Pokemon(String name, int id){
        this.Name = name;
        this.PokeID = id;
    }

    public void SetName(String name){
        this.Name = name;
    }

    public void SetID(int ID){
        this.PokeID = ID;
    }

    public void AddWeakness(Pokemon_Weakness W1){
        Weakness.add(W1);
    }

    public void AddWeakness(Pokemon_Weakness W1, Pokemon_Weakness W2){
        Weakness.add(W1);
        Weakness.add(W2);
    }

    public void AddWeakness(Pokemon_Weakness W1, Pokemon_Weakness W2, Pokemon_Weakness W3){
        Weakness.add(W1);
        Weakness.add(W2);
        Weakness.add(W3);
    }

    public void AddWeakness(Pokemon_Weakness W1, Pokemon_Weakness W2, Pokemon_Weakness W3, Pokemon_Weakness W4){
        Weakness.add(W1);
        Weakness.add(W2);
        Weakness.add(W3);
        Weakness.add(W4);
    }

    public void AddWeakness(Pokemon_Weakness W1, Pokemon_Weakness W2, Pokemon_Weakness W3, Pokemon_Weakness W4, Pokemon_Weakness W5){
        Weakness.add(W1);
        Weakness.add(W2);
        Weakness.add(W3);
        Weakness.add(W4);
        Weakness.add(W5);
    }

    public void AddType(Pokemon_Type T1) {
        Types.add(T1);
    }

    public void AddType(Pokemon_Type T1, Pokemon_Type T2) {
        Types.add(T1);
        Types.add(T2);
    }


}


