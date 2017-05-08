package org.opensource.kartik.xml;

public class LineItem
{
    private String amount;

    private String interest;

    private String interestReference;

    private String settlementInterest;

    private ProductionSale ProductionSale;

    private String date;

    private String interestType;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getInterest ()
    {
        return interest;
    }

    public void setInterest (String interest)
    {
        this.interest = interest;
    }

    public String getInterestReference ()
    {
        return interestReference;
    }

    public void setInterestReference (String interestReference)
    {
        this.interestReference = interestReference;
    }

    public String getSettlementInterest ()
    {
        return settlementInterest;
    }

    public void setSettlementInterest (String settlementInterest)
    {
        this.settlementInterest = settlementInterest;
    }

    public ProductionSale getProductionSale ()
    {
        return ProductionSale;
    }

    public void setProductionSale (ProductionSale ProductionSale)
    {
        this.ProductionSale = ProductionSale;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getInterestType ()
    {
        return interestType;
    }

    public void setInterestType (String interestType)
    {
        this.interestType = interestType;
    }
}