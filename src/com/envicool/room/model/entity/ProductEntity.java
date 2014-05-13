package com.envicool.room.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 产品
 * @author maleo
 *
 */
@Entity
@Table(name="tbl_product")
public class ProductEntity extends PostEntity {

    private static final long serialVersionUID = -8909305519062871557L;

    //Path to 产品
    @Column(name="product_img")
    private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

 
}
