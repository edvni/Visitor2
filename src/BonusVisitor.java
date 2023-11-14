public interface BonusVisitor {
    void visit(NormalState normalState);
    void visit(PowerfulState powerfulState);
    void visit(WeakState weakState);
}