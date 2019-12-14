package Pokedex;

import Pokedex.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex {
    ArrayList<Pokemon> PokemonList = new ArrayList<Pokemon>();

    public Pokedex() {

        // Objects of each Weakness created to allow for short hand when defining a pokemon
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

        // Objects of each Type created to allow for short hand when defining a pokemon
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


        // Adding to the PokemonList in the Pokedex
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

        // Pokemon Types and Weaknesses added by Overloaded Methods
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

        Pokemon Weedle = new Pokemon("Weedle", 13);
        Weedle.AddType(BugT, PoisonT);
        Weedle.AddWeakness(Fire, Flying, Psychic, Rock);
        PokemonList.add(Weedle);

        Pokemon Kakuna = new Pokemon("Kakuna", 14);
        Kakuna.AddType(BugT, PoisonT);
        Kakuna.AddWeakness(Fire, Flying, Psychic, Rock);
        PokemonList.add(Kakuna);

        Pokemon Beedrill = new Pokemon("Beedrill", 15);
        Beedrill.AddType(BugT, PoisonT);
        Beedrill.AddWeakness(Fire, Flying, Psychic, Rock);
        PokemonList.add(Beedrill);

        Pokemon Pidgey = new Pokemon("Pidgey", 16);
        Pidgey.AddType(NormalT, PoisonT);
        Pidgey.AddWeakness(Electric, Ice, Rock);
        PokemonList.add(Pidgey);

        Pokemon Pidgeotto = new Pokemon("Pidgeotto", 17);
        Pidgey.AddType(NormalT, FlyingT);
        Pidgey.AddWeakness(Electric, Ice, Rock);
        PokemonList.add(Pidgeotto);

        Pokemon Pidgeot = new Pokemon("Pidgeot", 18);
        Pidgeot.AddType(NormalT, FlyingT);
        Pidgeot.AddWeakness(Electric, Ice, Rock);
        PokemonList.add(Pidgeot);

        Pokemon Rattata = new Pokemon("Rattata", 19);
        Rattata.AddType(NormalT);
        Rattata.AddWeakness(Fighting);
        PokemonList.add(Rattata);

        Pokemon Raticate = new Pokemon("Raticate", 20);
        Raticate.AddType(NormalT);
        Raticate.AddWeakness(Fighting);
        PokemonList.add(Raticate);

        Pokemon Spearow = new Pokemon("Spearow", 21);
        Spearow.AddType(NormalT, FlyingT);
        Spearow.AddWeakness(Electric, Ice, Rock);
        PokemonList.add(Spearow);

        Pokemon Fearow = new Pokemon("Fearow", 22);
        Fearow.AddType(NormalT, FlyingT);
        Fearow.AddWeakness(Electric, Ice, Rock);
        PokemonList.add(Fearow);

        Pokemon Ekans = new Pokemon("Ekans", 23);
        Ekans.AddType(PoisonT);
        Ekans.AddWeakness(Ground, Psychic);
        PokemonList.add(Ekans);

        Pokemon Arbok = new Pokemon("Arbok", 24);
        Arbok.AddType(PoisonT);
        Arbok.AddWeakness(Ground, Psychic);
        PokemonList.add(Arbok);

        Pokemon Pikachu = new Pokemon("Pikachu", 25);
        Pikachu.AddType(ElectricT);
        Pikachu.AddWeakness(Ground);
        PokemonList.add(Pikachu);

        Pokemon Raichu = new Pokemon("Raichu", 26);
        Raichu.AddType(ElectricT);
        Raichu.AddWeakness(Ground);
        PokemonList.add(Raichu);

        Pokemon Sandshrew = new Pokemon("Sandshrew", 27);
        Sandshrew.AddType(GroundT);
        Sandshrew.AddWeakness(Grass, Ice, Water);
        PokemonList.add(Sandshrew);

        Pokemon Sandslash = new Pokemon("Sandslash", 28);
        Sandslash.AddType(GroundT);
        Sandslash.AddWeakness(Grass, Ice, Water);
        PokemonList.add(Sandslash);

        Pokemon NidoranF = new Pokemon("Nidoran", 29);
        NidoranF.AddType(PoisonT);
        NidoranF.AddWeakness(Ground, Psychic);
        PokemonList.add(NidoranF);

        Pokemon Nidorina = new Pokemon("Nidorina", 30);
        Nidorina.AddType(PoisonT);
        Nidorina.AddWeakness(Ground, Psychic);
        PokemonList.add(Nidorina);

        Pokemon Nidoqueen = new Pokemon("Nidoqueen", 31);
        Nidoqueen.AddType(PoisonT, GroundT);
        Nidoqueen.AddWeakness(Ground, Ice, Psychic, Water);
        PokemonList.add(Nidoqueen);

        Pokemon NidoranM = new Pokemon("Nidoran", 32);
        NidoranM.AddType(PoisonT);
        NidoranM.AddWeakness(Ground, Psychic);
        PokemonList.add(NidoranM);

        Pokemon Nidorino = new Pokemon("Nidorino", 33);
        Nidorino.AddType(PoisonT);
        Nidorino.AddWeakness(Ground, Psychic);
        PokemonList.add(Nidorino);

        Pokemon Nidoking = new Pokemon("Nidoking", 34);
        Nidoking.AddType(PoisonT, GroundT);
        Nidoking.AddWeakness(Ground, Ice, Psychic, Water);
        PokemonList.add(Nidoking);

        Pokemon Clefairy = new Pokemon("Clefairy", 35);
        Clefairy.AddType(FairyT);
        Clefairy.AddWeakness(Steel, Poison);
        PokemonList.add(Clefairy);

        Pokemon Clefable = new Pokemon("Clefable", 36);
        Clefable.AddType(FairyT);
        Clefable.AddWeakness(Steel, Poison);
        PokemonList.add(Clefable);

        Pokemon Vulpix = new Pokemon("Vulpix", 37);
        Vulpix.AddType(FireT);
        Vulpix.AddWeakness(Ground, Rock, Water);
        PokemonList.add(Vulpix);

        Pokemon Ninetales = new Pokemon("Ninetales", 38);
        Ninetales.AddType(FireT);
        Ninetales.AddWeakness(Ground, Rock, Water);
        PokemonList.add(Ninetales);

        Pokemon Jigglypuff = new Pokemon("Jigglypuff", 39);
        Jigglypuff.AddType(NormalT, FairyT);
        Jigglypuff.AddWeakness(Steel, Poison);
        PokemonList.add(Jigglypuff);

        Pokemon Wigglytuff = new Pokemon("Wigglytuff", 40);
        Wigglytuff.AddType(NormalT, FairyT);
        Wigglytuff.AddWeakness(Steel, Poison);
        PokemonList.add(Wigglytuff);

        Pokemon Zubat = new Pokemon("Zubat", 41);
        Zubat.AddType(PoisonT, FlyingT);
        Zubat.AddWeakness(Electric, Ice, Psychic, Rock);
        PokemonList.add(Zubat);

        Pokemon Golbat = new Pokemon("Golbat", 42);
        Golbat.AddType(PoisonT, FlyingT);
        Golbat.AddWeakness(Electric, Ice, Psychic, Rock);
        PokemonList.add(Golbat);

        Pokemon Oddish = new Pokemon("Oddish", 43);
        Oddish.AddType(GrassT, PoisonT);
        Oddish.AddWeakness(Fire, Flying, Ice, Psychic);
        PokemonList.add(Oddish);

        Pokemon Gloom = new Pokemon("Gloom", 44);
        Gloom.AddType(GrassT, PoisonT);
        Gloom.AddWeakness(Fire, Flying, Ice, Psychic);
        PokemonList.add(Gloom);

        Pokemon Vileplume = new Pokemon("Vileplume", 45);
        Vileplume.AddType(GrassT, PoisonT);
        Vileplume.AddWeakness(Fire, Flying, Ice, Psychic);
        PokemonList.add(Vileplume);

        Pokemon Paras = new Pokemon("Paras", 46);
        Paras.AddType(BugT, GrassT);
        Paras.AddWeakness(Fire, Flying, Bug, Ice, Poison);
        Paras.AddWeakness(Rock);
        PokemonList.add(Paras);

        Pokemon Parasect = new Pokemon("Parasect", 47);
        Parasect.AddType(BugT, GrassT);
        Parasect.AddWeakness(Fire, Flying, Bug, Ice, Poison);
        Paras.AddWeakness(Rock);
        PokemonList.add(Parasect);

        Pokemon Venonat = new Pokemon("Venonat", 48);
        Venonat.AddType(BugT, PoisonT);
        Venonat.AddWeakness(Fire, Flying, Psychic, Rock);
        PokemonList.add(Venonat);

        Pokemon Venomoth = new Pokemon("Venomoth", 49);
        Venomoth.AddType(BugT, PoisonT);
        Venomoth.AddWeakness(Fire, Flying, Psychic, Rock);
        PokemonList.add(Venomoth);

        Pokemon Diglett = new Pokemon("Diglett", 50);
        Diglett.AddType(GroundT);
        Diglett.AddWeakness(Grass, Ice, Water);
        PokemonList.add(Diglett);

        Pokemon Dugtrio = new Pokemon("Dugtrio", 51);
        Dugtrio.AddType(GroundT);
        Dugtrio.AddWeakness(Grass, Ice, Water);
        PokemonList.add(Dugtrio);

    }

    public void GetPokemon(String Pokename) throws PokemonNotFound {
        for (int i = 0; i < PokemonList.size(); i++) {
            if (Pokename.equals(PokemonList.get(i).Name)) {
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for (int y = 0; y < PokemonList.get(i).Types.size(); y++) {
                    System.out.printf("%s, ", PokemonList.get(i).Types.get(y));
                }
                System.out.println();
                System.out.printf("Pokemon Weaknesses   : ");
                for (int y = 0; y < PokemonList.get(i).Weakness.size(); y++) {
                    System.out.printf("%s, ", PokemonList.get(i).Weakness.get(y));
                }
            } else if (i == PokemonList.size() - 1) {
                throw new PokemonNotFound(Pokename, "Cannot find in Pokedex Pokemon Name : ");
            }
        }
    }

    public void GetPokemon(int ID) throws PokemonNotFound {
        if(ID > PokemonList.size()){
            System.out.println("ID Out of bounds!");
            System.out.printf("Index range is 1-%d\n",PokemonList.size());
        }
        for (int i = 0; i < PokemonList.size(); i++) {
            if (ID == PokemonList.get(i).PokeID) {
                System.out.printf("Pokemon Number       : %d \n", PokemonList.get(i).PokeID);
                System.out.printf("Pokemon Name         : %s \n", PokemonList.get(i).Name);
                System.out.printf("Pokemon Types        : ");
                for (int y = 0; y < PokemonList.get(i).Types.size(); y++) {
                    System.out.printf("%s, ", PokemonList.get(i).Types.get(y));
                }
                System.out.println();
                System.out.printf("Pokemon Weaknesses   : ");
                for (int y = 0; y < PokemonList.get(i).Weakness.size(); y++) {
                    System.out.printf("%s, ", PokemonList.get(i).Weakness.get(y));
                }
            }
            else if (i == PokemonList.size()-1) {
                throw new PokemonNotFound(ID, "Cannot find in Pokedex Pokemon ID : ");
            }
        }
    }

    public int AddPokemon(Pokemon Poke) {
        PokemonList.add(Poke);
        PokemonList.get(PokemonList.size()-1).PokeID = PokemonList.size();
        return PokemonList.size();
    }
}

