package space.luming.home.Entity;


import com.baomidou.mybatisplus.annotation.TableName;

import javax.persistence.Id;
import java.util.Date;

@TableName("pubg_order")
public class PUBG_item {
    @Id
    private String oid;
    //rule:Example:KA00001271124014052500--->'K'=CDK or 'C'=CRATES.'A00001'=itemID=PUBG item ID.
    //'271124'=2024,11,27.'01'=count.'405'=price(USD).'2500'=cost(RMB).
    //the reason why oid without rate beacause it can be searching everytime everyday.
    private Date date;
    private String itemname;
    private String itemid;
    private int type;//0=CDK,1=CRATES
    private double price;
    private double cost;
    private double rate1; //JP->USD
    private double rate2;//RMB->USD

    //double check
    private boolean verified1;
    private boolean verified2;


    @Override
    public String toString() {
        return "PUBG_item{" +
                "oid='" + oid + '\'' +
                ", date=" + date +
                ", itemname='" + itemname + '\'' +
                ", itemid='" + itemid + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", cost=" + cost +
                ", rate1=" + rate1 +
                ", rate2=" + rate2 +
                ", verified1=" + verified1 +
                ", verified2=" + verified2 +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getRate1() {
        return rate1;
    }

    public void setRate1(double rate1) {
        this.rate1 = rate1;
    }

    public double getRate2() {
        return rate2;
    }

    public void setRate2(double rate2) {
        this.rate2 = rate2;
    }

    public boolean isVerified1() {
        return verified1;
    }

    public void setVerified1(boolean verified1) {
        this.verified1 = verified1;
    }

    public boolean isVerified2() {
        return verified2;
    }

    public void setVerified2(boolean verified2) {
        this.verified2 = verified2;
    }
}
