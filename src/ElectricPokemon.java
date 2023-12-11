public class ElectricPokemon extends Pokemon {
    private int attackPower;
    private String specialAbility;


    public ElectricPokemon(String name, int level, int attackPower, String specialAbility){
        super(name, level);
        this.attackPower = attackPower;
        this.specialAbility = specialAbility;

    }

    public void electricAttack() {
        System.out.println("Electric attack! Power: " + attackPower);
    }

    public void thunderPunch() {
        System.out.println(getName() + " used" + specialAbility + "!");
    }

    public void speaks() {
        System.out.println(getName() + " says: pika-pika!");
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

