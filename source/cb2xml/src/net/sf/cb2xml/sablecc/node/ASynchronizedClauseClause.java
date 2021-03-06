/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import java.util.*;
import net.sf.cb2xml.sablecc.analysis.*;

public final class ASynchronizedClauseClause extends PClause
{
    private PSynchronizedClause _synchronizedClause_;

    public ASynchronizedClauseClause()
    {
    }

    public ASynchronizedClauseClause(
        PSynchronizedClause _synchronizedClause_)
    {
        setSynchronizedClause(_synchronizedClause_);

    }
    public Object clone()
    {
        return new ASynchronizedClauseClause(
            (PSynchronizedClause) cloneNode(_synchronizedClause_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASynchronizedClauseClause(this);
    }

    public PSynchronizedClause getSynchronizedClause()
    {
        return _synchronizedClause_;
    }

    public void setSynchronizedClause(PSynchronizedClause node)
    {
        if(_synchronizedClause_ != null)
        {
            _synchronizedClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _synchronizedClause_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_synchronizedClause_);
    }

    void removeChild(Node child)
    {
        if(_synchronizedClause_ == child)
        {
            _synchronizedClause_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_synchronizedClause_ == oldChild)
        {
            setSynchronizedClause((PSynchronizedClause) newChild);
            return;
        }

    }
}
