package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;


public class NumberLeaf implements MathExpression {



    private final int i;

    public NumberLeaf(int i) {
        this.i = i;
    }
    public int getResult() {
        return i;
    }
}