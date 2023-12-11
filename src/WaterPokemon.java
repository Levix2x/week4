public class WaterPokemon extends Pokemon {
        private int attackPower;
        private String specialAbility;


        public WaterPokemon(String name, int level, int attackPower, String specialAbility){
            super(name, level);
            this.attackPower = attackPower;
            this.specialAbility = specialAbility;

        }

        public void waterAttack() {
            System.out.println("Water attack! Power: " + attackPower);
        }

        public void surf() {
            System.out.println(getName() + " used" + specialAbility + "!");
        }

        public void speaks() {
            System.out.println(getName() + " says: squiirrtlllee!!");
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

