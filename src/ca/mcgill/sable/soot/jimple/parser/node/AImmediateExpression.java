package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class AImmediateExpression extends PExpression
{
    private PImmediate _immediate_;

    public AImmediateExpression()
    {
    }

    public AImmediateExpression(
        PImmediate _immediate_)
    {
        setImmediate(_immediate_);

    }
    public Object clone()
    {
        return new AImmediateExpression(
            (PImmediate) cloneNode(_immediate_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAImmediateExpression(this);
    }

    public PImmediate getImmediate()
    {
        return _immediate_;
    }

    public void setImmediate(PImmediate node)
    {
        if(_immediate_ != null)
        {
            _immediate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _immediate_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_immediate_);
    }

    void removeChild(Node child)
    {
        if(_immediate_ == child)
        {
            _immediate_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_immediate_ == oldChild)
        {
            setImmediate((PImmediate) newChild);
            return;
        }

    }
}
