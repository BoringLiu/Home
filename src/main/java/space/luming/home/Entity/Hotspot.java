package space.luming.home.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.micrometer.core.lang.Nullable;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@TableName("networkhotpot")
public class Hotspot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hid;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime recorddate;
    private String platform;
    private String example;
    private String reason;
    private String url;

    @Override
    public String toString() {
        return "NetworkHotpot{" +
                "hid=" + hid +
                ", name='" + name + '\'' +
                ", recorddate=" + recorddate +
                ", platform='" + platform + '\'' +
                ", example='" + example + '\'' +
                ", reason='" + reason + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(LocalDateTime recorddate) {
        this.recorddate = recorddate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
