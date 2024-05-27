package space.luming.home.Entity;

public class Warnings {

    private int wid;
    private String name;
    private int type;
    private String sdate;
    private String edate;

    @Override
    public String toString() {
        return "Warnings{" +
                "wid=" + wid +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", sdate='" + sdate + '\'' +
                ", edate='" + edate + '\'' +
                '}';
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }
}
