import Pokedex.*;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Begin");
        Pokedex MyPokedex = new Pokedex();
        String userselection = "" ;
        int userint = 0;
        Scanner input;

        while(true) {
            System.out.println("Pokédex Menu Select");
            System.out.println("1. Pokémon lookup");
            System.out.println("2. Add a Pokémon");
            System.out.println("3. Exit and Save");
            input = new Scanner(System.in);
            userint = input.nextInt();
            if (userint == 1) {
                System.out.println("Please Enter a Pokemon ID Number");
                input = new Scanner(System.in);
                userselection = input.nextLine();
                try {
                    int result = Integer.parseInt(userselection);
                    try {
                        MyPokedex.GetPokemon(result);
                    } catch (PokemonNotFound nfid) {
                        System.out.println(nfid);
                    }
                } catch (NumberFormatException e) {
                    try {
                        MyPokedex.GetPokemon(userselection);
                    } catch (PokemonNotFound nfname) {
                        System.out.println(nfname);
                    }
                }
                System.out.println("");
                System.out.println("");
            }
            else if (userint == 2){
                System.out.println("Add a Pokémon");
                Pokemon UserPokemon = new Pokemon();
                boolean valid = false;
                while(!valid) {
                    System.out.print("Enter a Pokémon Name : ");
                    input = new Scanner(System.in);
                    String PokemonName;
                    PokemonName = input.nextLine();
                    if (PokemonName.matches("[A-Za-z]+")) {
                        UserPokemon.SetName(PokemonName);
                        valid = true;
                    }
                }
                System.out.print("Enter a Pokémon ID : ");
                valid = false;
                while(!valid) {
                    input = new Scanner(System.in);
                    userselection = input.nextLine();
                    if (userselection.matches("[0-9]+")) {
                        valid = true;
                        UserPokemon.SetID(Integer.parseInt(userselection));
                    }
                }
                valid = false;
                while(!valid) {
                    System.out.print("Enter a Pokémon Type (end) to exit: ");
                    input = new Scanner(System.in);
                    userselection = input.nextLine();
                    if (userselection.equals("end") || userselection.equals("End")) {
                        valid = true;
                        break;
                    }
                    if (userselection.matches("[A-Za-z]+")) {
                        Pokemon_Type Type = Pokemon_Type.GetType(userselection);
                        UserPokemon.AddType(Type);
                    }
                }
                valid = false;
                while(!valid) {
                    System.out.print("Enter a Pokémon Weakness (end) to exit: ");
                    input = new Scanner(System.in);
                    userselection = input.nextLine();
                    if (userselection.equals("end") || userselection.equals("End")) {
                        valid = true;
                        break;
                    }
                    if (userselection.matches("[A-Za-z]+")) {
                        Pokemon_Weakness Weakness = Pokemon_Weakness.GetWeakness(userselection);
                        UserPokemon.AddWeakness(Weakness);
                    }
                }
                MyPokedex.AddPokemon(UserPokemon);
            }
            else if (userint == 3){
                break;
            }
        }
        System.out.println("End Test");
    }
}
