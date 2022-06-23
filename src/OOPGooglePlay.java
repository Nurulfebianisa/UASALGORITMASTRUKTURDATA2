package OOPGooglePlay;

public class OOPGooglePlay {
    private int filesize;
    private String icon;
    private String inAppBilling;
    private String Name;
    private int numdownload;
    private int operatingsystem;

    public OOPGooglePlay(){
    }

    public OOPGooglePlay(int filesize, String icon, String inAppBilling, String Name, int numdownload, int operatingsystem) {
        this.filesize = filesize;
        this.icon = icon;
        this.inAppBilling = inAppBilling;
        this.Name = Name;
        this.numdownload = numdownload;
        this.operatingsystem = operatingsystem;
    }

    public String getOOPGooglePlay() { return String.valueOf(this.filesize);}

    public void setFilesize(int filesize) { this.filesize = filesize; }

    public String getIcon() { return this.icon; }

    public void setIcon(String icon) { this.icon = icon;}

    public String getInAppBilling() { return this.inAppBilling; }

    public void setInAppBilling(String inAppBilling) { this.inAppBilling = inAppBilling;}

    public String getName() { return this.Name; }

    public void setName(String Name) { this.Name = Name; }

    public int getNumdownload(){
        return this.numdownload;
    }

    public void setNumdownload(){
        this.numdownload = numdownload;
    }

    public int getOperatingsystem(){
        return this.operatingsystem;
    }

    public int setOperatingSystem() { return this.operatingsystem = operatingsystem; }
}
