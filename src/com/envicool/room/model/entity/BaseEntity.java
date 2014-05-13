package com.envicool.room.model.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 7743262266808669171L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    @GenericGenerator(name = "uuid", strategy = "uuid")
    protected long id;
    
}
