import Pokedex.*;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
            System.out.println("Bryant is awesome");
            Pokedex MyPokedex = new Pokedex();
            int userselection;

            System.out.println("Please select a Pokemon ID number");
            Scanner input = new Scanner(System.in);
            userselection = input.nextInt();
            MyPokedex.GetPokemon(userselection);

    }
}
