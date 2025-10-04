public class Swordsman extends Character
{
    public Swordsman (String name){
    super(name);
    this.health=170;
    }
    
    public void slash (){
    mana -= 10;
    
    System.out.println("Player used skill Slash! mana decreased by 10!");
    }
    public void ShowStats(){
    System.out.println("I am Powerful!");
    super.ShowStats();
    }
}