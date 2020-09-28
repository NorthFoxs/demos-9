package com.example.demos9.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("kq_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String pwd;
}
