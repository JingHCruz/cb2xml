/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import java.util.*;
import net.sf.cb2xml.sablecc.analysis.*;

public final class ADisplayUsagePhrase extends PUsagePhrase
{
    private TDisplay _display_;
    private TNative _native_;

    public ADisplayUsagePhrase()
    {
    }

    public ADisplayUsagePhrase(
        TDisplay _display_,
        TNative _native_)
    {
        setDisplay(_display_);

        setNative(_native_);

    }
    public Object clone()
    {
        return new ADisplayUsagePhrase(
            (TDisplay) cloneNode(_display_),
            (TNative) cloneNode(_native_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADisplayUsagePhrase(this);
    }

    public TDisplay getDisplay()
    {
        return _display_;
    }

    public void setDisplay(TDisplay node)
    {
        if(_display_ != null)
        {
            _display_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _display_ = node;
    }

    public TNative getNative()
    {
        return _native_;
    }

    public void setNative(TNative node)
    {
        if(_native_ != null)
        {
            _native_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _native_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_display_)
            + toString(_native_);
    }

    void removeChild(Node child)
    {
        if(_display_ == child)
        {
            _display_ = null;
            return;
        }

        if(_native_ == child)
        {
            _native_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_display_ == oldChild)
        {
            setDisplay((TDisplay) newChild);
            return;
        }

        if(_native_ == oldChild)
        {
            setNative((TNative) newChild);
            return;
        }

    }
}
