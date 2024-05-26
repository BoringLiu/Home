package Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import javax.annotation.processing.Generated;

public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;
    private String name;
    private int count;
    private String position;
    private String last_update;
    private int price;
    private int warning;
    private String from;

    @Override
    public String toString() {
        return "Daily_Usings{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", position='" + position + '\'' +
                ", last_update='" + last_update + '\'' +
                ", price=" + price +
                ", warning=" + warning +
                ", from=" + from +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarning() {
        return warning;
    }

    public void setWarning(int warning) {
        this.warning = warning;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
