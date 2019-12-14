package Pokedex;

public enum Pokemon_Weakness{
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
    public int WeaknessID;
    public String WeaknessName;
    Pokemon_Weakness(int num){
        this.WeaknessID = num;
    }
    Pokemon_Weakness(int num, String Weakness){ this.WeaknessID = num; this.WeaknessName = Weakness; }
    public static Pokemon_Weakness GetWeakness(String user){
        for(Pokemon_Weakness  e : values()){
            if (e.WeaknessName.equals(user)){
                return e;
            }
        }
        return null;
    }
}