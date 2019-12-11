package Pokedex;

import Pokedex.*;
import java.lang.String;
import java.util.ArrayList;

public class Pokedex {
    ArrayList<Pokemon> PokemonList = new ArrayList<Pokemon>();

    public Pokedex(){
        Pokemon Bulbasaur = new Pokemon("Bulbasaur", 1);
        Bulbasaur.Types.add(Pokemon_Type.Grass);
        Bulbasaur.Types.add(Pokemon_Type.Poison);
        Bulbasaur.Weakness.add(Pokemon_Weakness.Fire);
        Bulbasaur.Weakness.add(Pokemon_Weakness.Flying);
        Bulbasaur.Weakness.add(Pokemon_Weakness.Ice);
        Bulbasaur.Weakness.add(Pokemon_Weakness.Psychic);
        PokemonList.add(Bulbasaur);

        Pokemon Ivysaur = new Pokemon("Ivysaur", 2);
        Ivysaur.Types.add(Pokemon_Type.Grass);
        Ivysaur.Types.add(Pokemon_Type.Poison);
        Ivysaur.Weakness.add(Pokemon_Weakness.Fire);
        Ivysaur.Weakness.add(Pokemon_Weakness.Flying);
        Ivysaur.Weakness.add(Pokemon_Weakness.Ice);
        Ivysaur.Weakness.add(Pokemon_Weakness.Psychic);
        PokemonList.add(Ivysaur);

        Pokemon Venusaur = new Pokemon("Venusaur", 3);
        Venusaur.Types.add(Pokemon_Type.Grass);
        Venusaur.Types.add(Pokemon_Type.Poison);
        Venusaur.Weakness.add(Pokemon_Weakness.Fire);
        Venusaur.Weakness.add(Pokemon_Weakness.Flying);
        Venusaur.Weakness.add(Pokemon_Weakness.Ice);
        Venusaur.Weakness.add(Pokemon_Weakness.Psychic);
        PokemonList.add(Venusaur);

        Pokemon Charmander = new Pokemon("Charmander", 4);
        Charmander.Types.add(Pokemon_Type.Fire);
        Charmander.Weakness.add(Pokemon_Weakness.Ground);
        Charmander.Weakness.add(Pokemon_Weakness.Rock);
        Charmander.Weakness.add(Pokemon_Weakness.Water);
        PokemonList.add(Charmander);

        Pokemon Charmeleon = new Pokemon("Charmeleon", 5);
        Charmeleon.Types.add(Pokemon_Type.Fire);
        Charmeleon.Weakness.add(Pokemon_Weakness.Ground);
        Charmeleon.Weakness.add(Pokemon_Weakness.Rock);
        Charmeleon.Weakness.add(Pokemon_Weakness.Water);


    }

    void GetPokemon(String Pokename){
        for (int i = 0; i<PokemonList.size();i++){
            if(Pokename == PokemonList.get(i).Name){
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for(int y = 0; y<PokemonList.get(i).Types.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Types.get(y));
                }
                System.out.printf("Pokemon Weaknesses   : ");
                for(int y = 0; y<PokemonList.get(i).Weakness.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Weakness.get(y));
                }
            }
        }
    }

    void GetPokemon(int ID){
        for (int i = 0; i<PokemonList.size();i++){
            if(ID == PokemonList.get(i).PokeID){
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for(int y = 0; y<PokemonList.get(i).Types.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Types.get(y));
                }
                System.out.printf("Pokemon Weaknesses   : ");
                for(int y = 0; y<PokemonList.get(i).Weakness.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Weakness.get(y));
                }
            }
        }
    }



}

