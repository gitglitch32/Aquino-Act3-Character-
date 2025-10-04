

public class playersystem
{
    public static void main(String[] args){
    Character charac = new Character("Katsura: Default Character");
    charac.walk();
    charac.walk();
    charac.walk();
    charac.run();
    charac.run();
    charac.ShowStats();
    
    Shaman shaman = new Shaman("Kiiro: The Shaman King!");
    shaman.walk();
    shaman.walk();
    shaman.walk();
    shaman.run();
    shaman.run();
    shaman.ShowStats();
    
    Swordsman swordsman = new Swordsman("Oyasumi: The sword master");
    swordsman.walk();
    swordsman.walk();
    swordsman.walk();
    swordsman.run();
    swordsman.run();
    swordsman.slash();
    swordsman.slash();
    swordsman.ShowStats();
    }
}
