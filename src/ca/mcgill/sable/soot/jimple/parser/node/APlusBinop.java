package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class APlusBinop extends PBinop
{
    private TPlus _plus_;

    public APlusBinop()
    {
    }

    public APlusBinop(
        TPlus _plus_)
    {
        setPlus(_plus_);

    }
    public Object clone()
    {
        return new APlusBinop(
            (TPlus) cloneNode(_plus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusBinop(this);
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_plus_);
    }

    void removeChild(Node child)
    {
        if(_plus_ == child)
        {
            _plus_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

    }
}
