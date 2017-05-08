package org.opensource.kartik.xml;

public class Owner
{
    private String ownerNumberType;

    private String name;

    private Address Address;

    private String ownerNumber;

    public String getOwnerNumberType ()
    {
        return ownerNumberType;
    }

    public void setOwnerNumberType (String ownerNumberType)
    {
        this.ownerNumberType = ownerNumberType;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Address getAddress ()
    {
        return Address;
    }

    public void setAddress (Address Address)
    {
        this.Address = Address;
    }

    public String getOwnerNumber ()
    {
        return ownerNumber;
    }

    public void setOwnerNumber (String ownerNumber)
    {
        this.ownerNumber = ownerNumber;
    }
}
