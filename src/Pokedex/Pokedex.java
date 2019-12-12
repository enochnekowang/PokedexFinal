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
        PokemonList.add(Charmeleon);

        Pokemon Charizard = new Pokemon("Charizard", 6);
        Charizard.Types.add(Pokemon_Type.Fire);
        Charizard.Weakness.add(Pokemon_Weakness.Ground);
        Charizard.Weakness.add(Pokemon_Weakness.Rock);
        Charizard.Weakness.add(Pokemon_Weakness.Water);
        PokemonList.add(Charizard);

        Pokemon Squirtle = new Pokemon("Squirtle", 7);
        Squirtle.Types.add(Pokemon_Type.Water);
        Squirtle.Weakness.add(Pokemon_Weakness.Electric);
        Squirtle.Weakness.add(Pokemon_Weakness.Grass);
        PokemonList.add(Squirtle);

        Pokemon Wartortle = new Pokemon("Wartortle", 8);
        Wartortle.Types.add(Pokemon_Type.Water);
        Wartortle.Weakness.add(Pokemon_Weakness.Electric);
        Wartortle.Weakness.add(Pokemon_Weakness.Grass);
        PokemonList.add(Wartortle);

        Pokemon Blastoise = new Pokemon("Blastoise", 9);
        Blastoise.Types.add(Pokemon_Type.Water);
        Blastoise.Weakness.add(Pokemon_Weakness.Electric);
        Blastoise.Weakness.add(Pokemon_Weakness.Grass);
        PokemonList.add(Blastoise);


        Pokemon_Weakness Normal = Pokemon_Weakness.Normal;
        Pokemon_Weakness Fighting = Pokemon_Weakness.Fighting;
        Pokemon_Weakness Flying = Pokemon_Weakness.Flying;
        Pokemon_Weakness Poison = Pokemon_Weakness.Poison;
        Pokemon_Weakness Ground = Pokemon_Weakness.Ground;
        Pokemon_Weakness Rock = Pokemon_Weakness.Rock;
        Pokemon_Weakness Bug = Pokemon_Weakness.Bug;
        Pokemon_Weakness Ghost = Pokemon_Weakness.Ghost;
        Pokemon_Weakness Steel = Pokemon_Weakness.Steel;
        Pokemon_Weakness Fire = Pokemon_Weakness.Fire;
        Pokemon_Weakness Water = Pokemon_Weakness.Water;
        Pokemon_Weakness Grass = Pokemon_Weakness.Grass;
        Pokemon_Weakness Electric = Pokemon_Weakness.Electric;
        Pokemon_Weakness Psychic = Pokemon_Weakness.Psychic;
        Pokemon_Weakness Ice = Pokemon_Weakness.Ice;
        Pokemon_Weakness Dragon = Pokemon_Weakness.Dragon;
        Pokemon_Weakness Fairy = Pokemon_Weakness.Fairy;
        Pokemon_Weakness Dark = Pokemon_Weakness.Dark;

        Pokemon_Type NormalT = Pokemon_Type.Normal;
        Pokemon_Type FightingT = Pokemon_Type.Fighting;
        Pokemon_Type FlyingT = Pokemon_Type.Flying;
        Pokemon_Type PoisonT = Pokemon_Type.Poison;
        Pokemon_Type GroundT = Pokemon_Type.Ground;
        Pokemon_Type RockT = Pokemon_Type.Rock;
        Pokemon_Type BugT = Pokemon_Type.Bug;
        Pokemon_Type GhostT = Pokemon_Type.Ghost;
        Pokemon_Type SteelT = Pokemon_Type.Steel;
        Pokemon_Type FireT = Pokemon_Type.Fire;
        Pokemon_Type WaterT = Pokemon_Type.Water;
        Pokemon_Type GrassT = Pokemon_Type.Grass;
        Pokemon_Type ElectricT = Pokemon_Type.Electric;
        Pokemon_Type PsychicT = Pokemon_Type.Psychic;
        Pokemon_Type IceT = Pokemon_Type.Ice;
        Pokemon_Type DragonT = Pokemon_Type.Dragon;
        Pokemon_Type FairyT = Pokemon_Type.Fairy;
        Pokemon_Type DarkT = Pokemon_Type.Dark;


        Pokemon Caterpie = new Pokemon("Caterpie", 10);
        Caterpie.Types.add(Pokemon_Type.Grass);
        Caterpie.AddWeakness(Fire, Rock, Flying);
        PokemonList.add(Caterpie);

        Pokemon Metapod = new Pokemon("Metapod", 11);
        Metapod.AddType(GrassT);
        Metapod.AddWeakness(Fire, Flying, Rock);
        PokemonList.add(Metapod);

        Pokemon Butterfree = new Pokemon("Butterfree", 12);
        Butterfree.AddType(BugT, FlyingT);
        Butterfree.AddWeakness(Rock, Electric, Fire, Flying, Ice);
        PokemonList.add(Butterfree);






    }

    public void GetPokemon(String Pokename){
        for (int i = 0; i<PokemonList.size();i++){
            if(Pokename.equals(PokemonList.get(i).Name)){
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for(int y = 0; y<PokemonList.get(i).Types.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Types.get(y));
                }
                System.out.println();
                System.out.printf("Pokemon Weaknesses   : ");
                for(int y = 0; y<PokemonList.get(i).Weakness.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Weakness.get(y));
                }
            }
        }
    }

    public void GetPokemon(int ID){
        for (int i = 0; i<PokemonList.size();i++){
            if(ID == PokemonList.get(i).PokeID){
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for(int y = 0; y<PokemonList.get(i).Types.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Types.get(y));
                }
                System.out.println();
                System.out.printf("Pokemon Weaknesses   : ");
                for(int y = 0; y<PokemonList.get(i).Weakness.size();y++){
                    System.out.printf("%s, ",PokemonList.get(i).Weakness.get(y));
                }
            }
        }
    }



}

