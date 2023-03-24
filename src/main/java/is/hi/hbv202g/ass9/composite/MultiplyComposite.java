package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children=new ArrayList<MathExpression>();

    int i=1;
    public void multiply() {
        for (MathExpression child : children) {
            i=i*child.getResult();
        }
    }
    public void add(MathExpression component) {
        children.add(component);
    }
    public void remove(MathExpression component) {
        children.remove(component);
    }
    public List<MathExpression> getChildren() {
        return children;
    }


    public int getResult() {
        multiply();
        return i;
    }
}
