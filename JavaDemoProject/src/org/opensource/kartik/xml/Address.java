package org.opensource.kartik.xml;

public class Address
{
    private String AddressPostalCode;

    private String AddressDetail;

    private String AddressCity;

    private String AddressState;

    public String getAddressPostalCode ()
    {
        return AddressPostalCode;
    }

    public void setAddressPostalCode (String AddressPostalCode)
    {
        this.AddressPostalCode = AddressPostalCode;
    }

    public String getAddressDetail ()
    {
        return AddressDetail;
    }

    public void setAddressDetail (String AddressDetail)
    {
        this.AddressDetail = AddressDetail;
    }

    public String getAddressCity ()
    {
        return AddressCity;
    }

    public void setAddressCity (String AddressCity)
    {
        this.AddressCity = AddressCity;
    }

    public String getAddressState ()
    {
        return AddressState;
    }

    public void setAddressState (String AddressState)
    {
        this.AddressState = AddressState;
    }
}