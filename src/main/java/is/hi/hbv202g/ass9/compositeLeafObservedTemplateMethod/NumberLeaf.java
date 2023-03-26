package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;


public class NumberLeaf extends Observable implements MathExpression {



    private int i;

    public NumberLeaf(int i) {
        this.i = i;
    }
    public int getResult() {
        return i;
    }

    public int setValue(int i) {
        this.i = i;
        notifyObservers();
        return i;
    }
}
