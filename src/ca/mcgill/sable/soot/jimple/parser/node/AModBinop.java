package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class AModBinop extends PBinop
{
    private TMod _mod_;

    public AModBinop()
    {
    }

    public AModBinop(
        TMod _mod_)
    {
        setMod(_mod_);

    }
    public Object clone()
    {
        return new AModBinop(
            (TMod) cloneNode(_mod_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModBinop(this);
    }

    public TMod getMod()
    {
        return _mod_;
    }

    public void setMod(TMod node)
    {
        if(_mod_ != null)
        {
            _mod_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _mod_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_mod_);
    }

    void removeChild(Node child)
    {
        if(_mod_ == child)
        {
            _mod_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_mod_ == oldChild)
        {
            setMod((TMod) newChild);
            return;
        }

    }
}
