public class main {
    public static void main(String[] args) {

    Pokemon charmander = new FirePokemon("Charmander", 24, 100, "flamethrower");
    Pokemon pikachu = new ElectricPokemon("Pikachu", 100, 25, "thunderpunch");
    Pokemon bulbasaur = new GrassPokemon("bulbasaur", 77, 120, "leafstorm");
    Pokemon squirtle = new WaterPokemon("squirtle", 1, 12, "surf");


    squirtle.eats();
    pikachu.levelup();
    bulbasaur.eats();
    charmander.levelup();




    }
}
