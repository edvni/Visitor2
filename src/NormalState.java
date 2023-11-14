class NormalState implements CharacterState {
    private static final int EXPERIENCE_THRESHOLD = 30;

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void receiveExp(GameCharacter context) {
        System.out.println("Character gains 10 experience points in Normal state");
        context.increaseExperience(10);

        if (context.getExperience() >= EXPERIENCE_THRESHOLD) {
            context.setState(new PowerfulState());
            System.out.println("Character advances to Powerful state!");
            context.resetExperience();
        }
    }
}