public class BonusPointVisitor implements BonusVisitor {
    @Override
    public void visit(NormalState normalState) {
        System.out.println("Normal state character gets 10 bonus points");
    }

    @Override
    public void visit(PowerfulState powerfulState) {
        System.out.println("Powerful state character gets 20 bonus points");
    }

    @Override
    public void visit(WeakState weakState) {
        System.out.println("Weak state character gets 5 bonus points");
    }
}