package space.luming.home.Entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@TableName("MedicationsInfo")
public class Medications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;
    private String name;
    private int count;
    private String position;
    private String outdate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastupdate;
    private int price;
    private int warning = 0;
    private String from;
    private int remove = 0;
    private String remark;


    
    
}