
public class Human {
    int strength = 3;
    int stealth = 3;
    int intelligence = 3;
    int health = 100;

    // getters and setters
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    

    public void attack(Human attackedHuman){
        attackedHuman.health-=this.strength;
        System.out.println("Attacked human lost Health of 3");
    }
}
