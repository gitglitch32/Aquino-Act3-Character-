
public class Shaman extends Character
{
    public Shaman (String name){
    super(name);
    this.health=150;
    }
    
    public void heal (){
    health += 5;
    stamina += 5;
    mana += 5;
    System.out.println("Player increased health by 5!");
    }
}
