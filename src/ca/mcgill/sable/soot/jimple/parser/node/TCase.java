package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import java.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class TCase extends Token
{
    public TCase()
    {
        super.setText("case");
    }

    public TCase(int line, int pos)
    {
        super.setText("case");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TCase(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCase(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TCase text.");
    }
}
