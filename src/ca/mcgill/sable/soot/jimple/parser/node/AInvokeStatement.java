package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class AInvokeStatement extends PStatement
{
    private PInvokeExpr _invokeExpr_;
    private TSemicolon _semicolon_;

    public AInvokeStatement()
    {
    }

    public AInvokeStatement(
        PInvokeExpr _invokeExpr_,
        TSemicolon _semicolon_)
    {
        setInvokeExpr(_invokeExpr_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AInvokeStatement(
            (PInvokeExpr) cloneNode(_invokeExpr_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInvokeStatement(this);
    }

    public PInvokeExpr getInvokeExpr()
    {
        return _invokeExpr_;
    }

    public void setInvokeExpr(PInvokeExpr node)
    {
        if(_invokeExpr_ != null)
        {
            _invokeExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _invokeExpr_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_invokeExpr_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_invokeExpr_ == child)
        {
            _invokeExpr_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_invokeExpr_ == oldChild)
        {
            setInvokeExpr((PInvokeExpr) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
