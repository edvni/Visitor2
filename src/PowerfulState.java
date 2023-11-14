class PowerfulState implements CharacterState {
    private static final int EXPERIENCE_THRESHOLD = 50;

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void receiveExp(GameCharacter context) {
        System.out.println("Character gains 15 experience points in Powerful state");
        context.increaseExperience(15);

        if (context.getExperience() >= EXPERIENCE_THRESHOLD) {
            context.setState(new WeakState());
            System.out.println("Character is exhausted and now in Weak State...");
            context.resetExperience();
        }
    }
}