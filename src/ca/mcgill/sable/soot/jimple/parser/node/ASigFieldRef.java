package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ASigFieldRef extends PFieldRef
{
    private PFieldSignature _fieldSignature_;

    public ASigFieldRef()
    {
    }

    public ASigFieldRef(
        PFieldSignature _fieldSignature_)
    {
        setFieldSignature(_fieldSignature_);

    }
    public Object clone()
    {
        return new ASigFieldRef(
            (PFieldSignature) cloneNode(_fieldSignature_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASigFieldRef(this);
    }

    public PFieldSignature getFieldSignature()
    {
        return _fieldSignature_;
    }

    public void setFieldSignature(PFieldSignature node)
    {
        if(_fieldSignature_ != null)
        {
            _fieldSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _fieldSignature_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_fieldSignature_);
    }

    void removeChild(Node child)
    {
        if(_fieldSignature_ == child)
        {
            _fieldSignature_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_fieldSignature_ == oldChild)
        {
            setFieldSignature((PFieldSignature) newChild);
            return;
        }

    }
}
