

public class Character
{
    String name;
    int health;
    int stamina;
    int mana;
    
    Character(String name){
    this.name = name;
    this.health=100;
    this.stamina=100;
    this.mana =100;
    
    }
    public  void walk(){
    stamina -=1;
    System.out.println("You walked! Your Stamina decreased by 1!");
    }
    public void run(){
    stamina -=3;
    System.out.println("You ran fast! Your Stamina decreased by 3!");
    }
    
    public void ShowStats(){
    System.out.println("--------------------------------");
    System.out.println("Current Stats:"+name);
    System.out.println("Health:"+health);
    System.out.println("Stamina:"+stamina);
    System.out.println("Mana:"+mana);
    System.out.println("--------------------------------");
    }
    
}
