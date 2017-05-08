package org.opensource.kartik.xml;

public class Tax
{
    private String amount;

    private String ownerAmount;

    private String taxType;

    private String reference;

    private String componentType;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getOwnerAmount ()
    {
        return ownerAmount;
    }

    public void setOwnerAmount (String ownerAmount)
    {
        this.ownerAmount = ownerAmount;
    }

    public String getTaxType ()
    {
        return taxType;
    }

    public void setTaxType (String taxType)
    {
        this.taxType = taxType;
    }

    public String getReference ()
    {
        return reference;
    }

    public void setReference (String reference)
    {
        this.reference = reference;
    }

    public String getComponentType ()
    {
        return componentType;
    }

    public void setComponentType (String componentType)
    {
        this.componentType = componentType;
    }
}