package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> children=new ArrayList<MathExpression>();



    int lastObservedResult;
    int i=0;



    public void plus() {
        i=0;
        for (MathExpression child : children) {
            i+=child.getResult();
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
        plus();
        return i;
    }

    @Override
    public void update() {
       plus();
       lastObservedResult=i;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}