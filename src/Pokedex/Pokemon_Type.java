package Pokedex;

public enum Pokemon_Type{
    Normal (1, "Normal"),
    Fighting (2, "Fighting"),
    Flying (3, "Flying"),
    Poison (4, "Poison"),
    Ground (5, "Ground"),
    Rock (6,"Rock"),
    Bug (7,"Bug"),
    Ghost (8, "Ghost"),
    Steel (9,"Steel"),
    Fire (10, "Fire"),
    Water (11,"Water"),
    Grass ( 12,"Grass"),
    Electric ( 13, "Electric"),
    Psychic (14,"Psychic"),
    Ice ( 15, "Ice"),
    Dragon ( 16, "Dragon"),
    Fairy ( 17,"Fairy"),
    Dark ( 18, "Dark");
    public int TypeID;
    public String TypeName;
    Pokemon_Type(int num){
        this.TypeID = num;
    }
    Pokemon_Type(int num, String name) {this.TypeID = num; this.TypeName = name;}

    public static Pokemon_Type GetType(String user){
        for(Pokemon_Type  e : values()){
            if (e.TypeName.equals(user)){
                return e;
            }
        }
        return null;
    }
}
