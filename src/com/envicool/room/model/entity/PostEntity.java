package com.envicool.room.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="tbl_post")
public class PostEntity extends BaseEntity {
    
    private static final long serialVersionUID = -5567307628796319874L;

    //标题
    @Column(name="post_title")
    protected String title;
    
    //内容
    @Column(name="post_content")
    protected String content;

    //编码
    //页面编码如下：blog（博文）,contact（联系我们）,about(关于我们)，infor(行业资讯)，product（产品信息）
    @Column(name="post_code")
    protected String code = "blog";
    
    @Column(name="post_at")
    protected Date at = new Date();
    
    public PostEntity() {
        super();
    }

    public PostEntity(String title, String content) {
        super();
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getAt() {
        return at;
    }

    public void setAt(Date at) {
        this.at = at;
    }
    
}
