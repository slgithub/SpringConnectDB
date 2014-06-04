/**
 * 
 */
package com.connector.connect.annotation.model;

/**
 * @author su828791
 *
 */
public class EXPERIENCELIST
{
    private String COMPANY;

    private String START_DATE;

    private String END_DATE;

    private String JOB_TITLE;

    private String DURATION;

    public String getCOMPANY ()
    {
        return COMPANY;
    }

    public void setCOMPANY (String COMPANY)
    {
        this.COMPANY = COMPANY;
    }

    public String getSTART_DATE ()
    {
        return START_DATE;
    }

    public void setSTART_DATE (String START_DATE)
    {
        this.START_DATE = START_DATE;
    }

    public String getEND_DATE ()
    {
        return END_DATE;
    }

    public void setEND_DATE (String END_DATE)
    {
        this.END_DATE = END_DATE;
    }

    public String getJOB_TITLE ()
    {
        return JOB_TITLE;
    }

    public void setJOB_TITLE (String JOB_TITLE)
    {
        this.JOB_TITLE = JOB_TITLE;
    }

    public String getDURATION ()
    {
        return DURATION;
    }

    public void setDURATION (String DURATION)
    {
        this.DURATION = DURATION;
    }
}