package org.opensource.kartik.xml;

public class Checks
{
    private Check Check;

    private String vocabulary;

    private String version;

    public Check getCheck ()
    {
        return Check;
    }

    public void setCheck (Check Check)
    {
        this.Check = Check;
    }

    public String getVocabulary ()
    {
        return vocabulary;
    }

    public void setVocabulary (String vocabulary)
    {
        this.vocabulary = vocabulary;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

}