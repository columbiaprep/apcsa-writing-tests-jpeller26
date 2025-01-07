import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void testHelmet(){
        Helmet g = new Helmet("Gold");
        assertEquals(1.5,g.getWeight(),0.1);
        assertEquals(100,g.getDurability());
        assertEquals("Gold",g.getRarity());
        assertEquals(2,g.getModifier());

        Helmet s = new Helmet("Silver");
        assertEquals(50,s.getDurability());
        assertEquals(1.0, s.getWeight(),0.1);
        assertEquals("Silver",s.getRarity());
        assertEquals(1,s.getModifier());

        Helmet b = new Helmet("Bronze");
        assertEquals(25,b.getDurability());
        assertEquals(5,b.getWeight(),0.1);
        assertEquals("Bronze",b.getRarity());
        assertEquals(0,b.getModifier());
    }
    @Test
    public void testBodyArmor(){
        BodyArmor l = new BodyArmor("Leather");
        assertEquals("Leather", l.getMaterial());
        assertEquals(1,l.getDexMod());
        assertEquals(1,l.getChaMod());
        assertEquals(1,l.getWisMod());
        assertEquals(1,l.getArmorClass());
        assertEquals(0,l.getMaxDurability());

        BodyArmor c = new BodyArmor("Chain");
        assertEquals("Chain", c.getMaterial());
        assertEquals(1,c.getDexMod());
        assertEquals(1,c.getConMod());
        assertEquals(1,c.getIntMod());
        assertEquals(1,c.getArmorClass());
        assertEquals(0,c.getMaxDurability());

        BodyArmor i = new BodyArmor("Iron");
        assertEquals("Iron", i.getMaterial());
        assertEquals(2,i.getConMod());
        assertEquals(1,i.getStrMod());
        assertEquals(2,i.getArmorClass());
        assertEquals(0,i.getMaxDurability());

        BodyArmor g = new BodyArmor("Gold");
        assertEquals("Gold",g.getMaterial());
        assertEquals(2,g.getChaMod());
        assertEquals(1,g.getConMod());
        assertEquals(-1,g.getStrMod());
        assertEquals(3,g.getArmorClass());
        assertEquals(0,g.getMaxDurability());

        BodyArmor d = new BodyArmor("Diamond");
        assertEquals("Diamond",d.getMaterial());
        assertEquals(2,d.getStrMod());
        assertEquals(1,d.getConMod());
        assertEquals(3,d.getArmorClass());
        assertEquals(0,d.getMaxDurability());

        BodyArmor n = new BodyArmor("Netherite");
        assertEquals("Netherite",n.getMaterial());
        assertEquals(2,n.getConMod());
        assertEquals(1,n.getStrMod());
        assertEquals(-1,n.getDexMod());
        assertEquals(1,n.getChaMod());
        assertEquals(4,n.getArmorClass());
        assertEquals(0,n.getMaxDurability());
    }

    @Test
    public void testBoots(){
        Boots b = new Boots(true, "Leather", false);
        assertEquals(10,b.getRevisedStrength());
        assertEquals(10,b.getRevisedDexterity());
        assertEquals(10,b.getRevisedCharisma());
    }

    @Test
    public void testGauntlets(){
        Gauntlets z = new Gauntlets();
        assertEquals(0,z.getEquipmentID());

        Gauntlets n = new Gauntlets(5);
        assertEquals(5,n.getEquipmentID());
    }

    @Test
    public void testGloves(){
        Gloves r = new Gloves("Rare", "The Force", true, 10,2000,5);
        assertEquals("Rare",r.getRarity());
        assertEquals("The Force",r.getSpecialAbility());
        assertEquals(true, r.getGloveWeapon());
        assertEquals(10,r.getAttackDamage());
        assertEquals(2000,r.getGloveCost());
        assertEquals(5,r.getWeight());
        assertEquals(1,r.getStrMod());
        assertEquals(2,r.getDexMod());
        assertEquals(1,r.getConMod());
        assertEquals(2,r.getWisMod());
        assertEquals(1,r.getChaMod());

        Gloves u = new Gloves("Uncommon","Nothing", false,10,200,5);
        assertEquals("Uncommon", u.getRarity());
        assertEquals("This pair of gloves does not have a special ability",u.getSpecialAbility());
        assertEquals(false,u.getGloveWeapon());
        assertEquals(0,u.getWisMod());
        assertEquals(0,u.getChaMod());

        Gloves c = new Gloves("Common","Nothing", false,10,200,5);
        assertEquals("Common", c.getRarity());
        assertEquals(1,c.getWisMod());

        Gloves f = new Gloves("Fake Rarity","Nothing", false,10,200,5);
        assertEquals("This rarity does not exist", f.getRarity());
    }

    @Test
    public void testMeleeWeapon(){
        MeleeWeapon m = new MeleeWeapon("Sword",12,13,20.2,3,5);
        assertEquals("Sword",m.getType());
        assertEquals(12,m.getStrength());
        assertEquals(13,m.getDamage());
        assertEquals(20.2,m.getLengthCM(),0.1);
        assertEquals(3,m.getWeightKG(),0.1);
        assertEquals(5,m.getSharpness());
    }

    @Test
    public void testRole(){
        Role r = new Role("Paladin");
        assertEquals(200,r.getChaMod());
    }

    @Test
    public void testSheild(){
        Shield w = new Shield("wood");
        assertEquals(10,w.getWeight(),0.1);
        assertEquals(5,w.getThickness());
        assertEquals(5,w.getHitPoints());
        assertEquals(1,w.getStrMod());
        assertEquals(-1,w.getDexMod());
        assertEquals(1,w.getConMod());
        assertEquals(0,w.getIntMod());
        assertEquals(0,w.getChaMod());
        assertEquals(0,w.getWisMod());

        Shield s = new Shield("steel");
        assertEquals(20,s.getWeight(),0.1);
        assertEquals(10,s.getThickness());
        assertEquals(10,s.getHitPoints());
        assertEquals(2,s.getStrMod());
        assertEquals(-2,s.getDexMod());
        assertEquals(2,s.getConMod());
        assertEquals(0,s.getIntMod());
        assertEquals(0,s.getChaMod());
        assertEquals(0,s.getWisMod());
    }

    @Test
    public void testSpecies(){
        Species e = new Species("Elf");
        assertEquals("Arcana",e.getProficiency());
        assertEquals("Lawful Neutral",e.getAlignment());
        assertEquals("Medium",e.getSize());
        assertEquals(2,e.getIntMod());
        assertEquals(1,e.getDexMod());

        Species d = new Species("Dwarf");
        assertEquals("Acrobatis",d.getProficiency());
        assertEquals("Chaotic Neutral", d.getAlignment());
        assertEquals("Small", d.getSize());
        assertEquals(2,d.getStrMod());
        assertEquals(1,d.getDexMod());
        assertEquals(-1,d.getConMod());
    }
}
