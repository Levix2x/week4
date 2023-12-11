public abstract class Pokemon {
    private int level;
    private String name;


    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;

    }

    public void levelup() {
        System.out.println(name + " is level up gegaan!  huidige level:  " + (level + 1) + "!");
        level++;
    }

    public void eats() {
        System.out.println(name + " eet wat voedsel.");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

