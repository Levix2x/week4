public class FirePokemon extends Pokemon {
    private int attackPower;
    private String specialAbility;


    public FirePokemon(String name, int level, int attackPower, String specialAbility){
        super(name, level);
        this.attackPower = attackPower;
        this.specialAbility = specialAbility;

    }

    public void fireAttack() {
        System.out.println("Fire attack! Power: " + attackPower);
    }

    public void flamethrower() {
        System.out.println(getName() + " used" + specialAbility + "!");
    }

    public void speaks() {
        System.out.println(getName() + " says: Char-char!");
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