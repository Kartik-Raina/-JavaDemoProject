package org.opensource.kartik.xml;

public class Property
{
    private String propertyType;

    private String propertyID;

    private String county;

    private String name;

    private String state;

    private LineItem[] LineItem;

    private String operator;

    public String getPropertyType ()
    {
        return propertyType;
    }

    public void setPropertyType (String propertyType)
    {
        this.propertyType = propertyType;
    }

    public String getPropertyID ()
    {
        return propertyID;
    }

    public void setPropertyID (String propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getCounty ()
    {
        return county;
    }

    public void setCounty (String county)
    {
        this.county = county;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public LineItem[] getLineItem ()
    {
        return LineItem;
    }

    public void setLineItem (LineItem[] LineItem)
    {
        this.LineItem = LineItem;
    }

    public String getOperator ()
    {
        return operator;
    }

    public void setOperator (String operator)
    {
        this.operator = operator;
    }
}