public class Main {
    public static void main(String[] args) {
        System.out.println("A new character enters the arena...");
        GameCharacter character = new GameCharacter(new NormalState());

        character.attack();
        displayCurrentState(character);

        character.attack();
        displayCurrentState(character);

        character.attack();
        displayCurrentState(character);

        // Here begins Powerful State
        character.attack();
        displayCurrentState(character);

        character.attack();
        displayCurrentState(character);

        character.attack();
        displayCurrentState(character);

    }

    private static void displayCurrentState(GameCharacter character) {
        System.out.println();
        System.out.println("Current state: " + character.getState().getClass().getSimpleName());
        System.out.println("Experience: " + character.getExperience());
    }
}