import Pokedex.*;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Begin");
        Pokedex MyPokedex = new Pokedex();
        String userselection = "" ;

        while(!userselection.equals("end")) {
            System.out.println("Please Enter a Pokemon ID Number");
            Scanner input = new Scanner(System.in);
            userselection = input.nextLine();
            if (userselection.equals("end")) {
                break;
            }
            try {
                int result = Integer.parseInt(userselection);
                MyPokedex.GetPokemon(result);
            }catch(NumberFormatException e){
                MyPokedex.GetPokemon(userselection);
            }
            System.out.println("");
            System.out.println("");
        }

        System.out.println("End Test");
    }
}
