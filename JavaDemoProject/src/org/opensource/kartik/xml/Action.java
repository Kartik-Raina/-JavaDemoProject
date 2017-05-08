package org.opensource.kartik.xml;

public class Action
{
    private String actionCode;

    public String getActionCode ()
    {
        return actionCode;
    }

    public void setActionCode (String actionCode)
    {
        this.actionCode = actionCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [actionCode = "+actionCode+"]";
    }
}