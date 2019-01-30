package com.myself.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable { //Entity  实体类
    private  Long deptno;
    private  String dname;
    private String  db_source;  //来自哪个数据库
    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

}
