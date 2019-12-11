package Pokedex;

import java.lang.String;
import java.util.ArrayList;

enum Pokemon_Type{
    Normal (1),
    Fighting (2),
    Flying (3),
    Poison (4),
    Ground (5),
    Rock (6),
    Bug (7),
    Ghost (8),
    Steel (9 ),
    Fire (10),
    Water (11),
    Grass ( 12),
    Electric ( 13),
    Psychic (14),
    Ice ( 15),
    Dragon ( 16),
    Fairy ( 17),
    Dark ( 18);
    public int TypeID;
    Pokemon_Type(int num){
        this.TypeID = num;
    }
}

enum Pokemon_Weakness{
    Normal (1),
    Fighting (2),
    Flying (3),
    Poison (4),
    Ground (5),
    Rock (6),
    Bug (7),
    Ghost (8),
    Steel (9 ),
    Fire (10),
    Water (11),
    Grass ( 12),
    Electric ( 13),
    Psychic (14),
    Ice ( 15),
    Dragon ( 16),
    Fairy ( 17),
    Dark ( 18);
    public int WeaknessID;
    Pokemon_Weakness(int num){
        this.WeaknessID = num;
    }
}


public class Pokemon {
    public String Name;
    public int PokeID;
    ArrayList<Pokemon_Type> Types = new ArrayList<Pokemon_Type>();
    ArrayList<Pokemon_Weakness> Weakness = new ArrayList<Pokemon_Weakness>();

    public Pokemon(String name, int id){
        this.Name = name;
        this.PokeID = id;
    }
}


