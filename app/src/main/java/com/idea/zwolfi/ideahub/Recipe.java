package com.idea.zwolfi.ideahub;

public class Recipe {
    private Integer nStatus;
    private String strTitle;
    private String strDetail;
    private Integer nMarkbar = 0;

    public void setStatus(Integer nRepStatus)
    {
        this.nStatus = nRepStatus;
    }

    public int getStatus()
    {
        return nStatus;
    }

    public void setTitle(String strTitle)
    {
        this.strTitle = strTitle;
    }

    public String getTitle()
    {
        return strTitle;
    }

    public void setDetail(String strDetail)
    {
        this.strDetail = strDetail;
    }

    public String getDetail()
    {
        return strDetail;
    }

    public void setMarkbar(Integer nMarkbar)
    {
        this.nMarkbar = nMarkbar;
    }

    public int getMarkbar()
    {
        return nMarkbar;
    }
}
