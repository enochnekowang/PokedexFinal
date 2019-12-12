package Pokedex;

import javax.swing.plaf.basic.BasicTreeUI;

public class PokemonNotFound extends Exception {
    int ID;
    String Name;
    public PokemonNotFound(){
        super();
    }
    PokemonNotFound(String Name, String message){
        super(message + Name);
        this.Name = Name;
    }
    PokemonNotFound(int ID, String message){
        super(message + ID);
        this.ID = ID;
    }

    public PokemonNotFound(int ID, String message, Throwable cause){
        super(message + ID, cause);
        this.ID = ID;
    }
    public PokemonNotFound(String Name, String message, Throwable cause){
        super(message + Name, cause);
        this.Name = Name;
    }
}
