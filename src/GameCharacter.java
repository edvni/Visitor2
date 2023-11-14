public class GameCharacter {
    private int experience;
    private CharacterState state;

    public GameCharacter(CharacterState state) {
        this.state = state;
        this.experience = 0;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void attack() {
        System.out.println("-------------------");
        System.out.println("Character attacks!");
        System.out.println();
        state.accept(new BonusPointVisitor());
        state.receiveExp(this);
    }

    public CharacterState getState() {
        return state;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience(int amount) {
        experience += amount;
    }

    public void resetExperience() {
    }
}