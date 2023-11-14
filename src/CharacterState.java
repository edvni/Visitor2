public interface CharacterState {
    void accept(BonusVisitor visitor);

    void receiveExp(GameCharacter context);
}