public class GrassPokemon extends Pokemon {
    private int attackPower;
    private String specialAbility;


    public GrassPokemon(String name, int level, int attackPower, String specialAbility){
        super(name, level);
        this.attackPower = attackPower;
        this.specialAbility = specialAbility;

    }

    public void grassAttack() {
        System.out.println("grass attack! Power: " + attackPower);
    }

    public void leafStorm() {
        System.out.println(getName() + " used" + specialAbility + "!");
    }

    public void speaks() {
        System.out.println(getName() + " says: bulbaaa-sauuur!");
    }
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }


    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
}

