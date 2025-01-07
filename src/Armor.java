public class Armor extends Equipment{
    int strength;
    int dexterity;
    int constitution;
    int wisdom;
    int charisma;
    int intelligence;
    public int calculateDamageReduction(){
        return 0;
    }

    public int getStrMod(){
        return this.strength;
    }
    public int getDexMod(){
        return this.dexterity;
    }
    public int getConMod(){
        return this.constitution;
    }
    public int getWisMod(){
        return this.wisdom;
    }
    public int getChaMod(){
        return this.charisma;
    }
    public int getIntMod(){
        return this.intelligence;
    }
}