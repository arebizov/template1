package com.github.template.model.db;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "D_LINK_MATNAME")
@Data
//SELECT [MATCODE]
//        ,[MATNAME]
//        ,[MATNAME_ALT]
//        FROM [java].[dbo].[D_LINK_MATNAME]
public class MaterialGroup implements Serializable {

    @Id
    @Column(name = "MATCODE")
    private Long id;

    @Column(name = "MATNAME")
    private String name;

    @Column(name = "MATNAME_ALT")
    private String group;

}
