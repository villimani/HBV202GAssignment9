package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class Superclass implements MathExpression, Observer{

    private List<MathExpression> children=new ArrayList<MathExpression>();



    int lastObservedResult;
    protected int i;
    protected int g;


    public Superclass (int h) {
        g=h;
        i=h;
    }

    public void plus() {

        if (g==0){
            i=0;
            for (MathExpression child : children) {
                i+=child.getResult();
            }
        }
        if (g==1){
            i=1;
            for (MathExpression child : children) {
                i=i*child.getResult();
            }
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

