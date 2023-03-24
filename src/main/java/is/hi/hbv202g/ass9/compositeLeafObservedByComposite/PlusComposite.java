package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import is.hi.hbv202g.ass9.composite.MathExpression;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements is.hi.hbv202g.ass9.composite.MathExpression {
    private List<is.hi.hbv202g.ass9.composite.MathExpression> children=new ArrayList<is.hi.hbv202g.ass9.composite.MathExpression>();
    int i=0;
    public void plus() {
        for (is.hi.hbv202g.ass9.composite.MathExpression child : children) {
            i+=child.getResult();
        }
    }
    public void add(is.hi.hbv202g.ass9.composite.MathExpression component) {
        children.add(component);
    }
    public void remove(is.hi.hbv202g.ass9.composite.MathExpression component) {
        children.remove(component);
    }
    public List<MathExpression> getChildren() {
        return children;
    }

    public int getResult() {
        plus();
        return i;
    }
}