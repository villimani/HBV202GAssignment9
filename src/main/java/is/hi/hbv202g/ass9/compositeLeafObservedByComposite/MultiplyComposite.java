package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;


import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children=new ArrayList<MathExpression>();

    int lastObservedResult;
    int i=1;
    public void multiply() {
        i=1;
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

    @Override
    public void update() {
        multiply();
        lastObservedResult=i;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
