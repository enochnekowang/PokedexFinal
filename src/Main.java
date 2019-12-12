import Pokedex.*;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Begin");
        Pokedex MyPokedex = new Pokedex();
        String userselection = "" ;

        while((!userselection.equals("end") || userselection.equals("End"))) {
            System.out.println("Please Enter a Pokemon ID Number");
            Scanner input = new Scanner(System.in);
            userselection = input.nextLine();
            if (userselection.equals("end") || userselection.equals("End") ) {
                break;
            }
            try {
                int result = Integer.parseInt(userselection);
                try {
                    MyPokedex.GetPokemon(result);
                }catch(PokemonNotFound nfid){
                    System.out.println(nfid);
                }
            }catch(NumberFormatException e){
                try {
                    MyPokedex.GetPokemon(userselection);
                }catch(PokemonNotFound nfname){
                    System.out.println(nfname);
                }
            }
            System.out.println("");
            System.out.println("");
        }

        System.out.println("End Test");
    }
}
