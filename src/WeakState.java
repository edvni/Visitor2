class WeakState implements CharacterState {
    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void receiveExp(GameCharacter context) {
        System.out.println("Character gains 5 experience points in Weak state");
        // No advancement in Weak state
        context.increaseExperience(5);
    }
}