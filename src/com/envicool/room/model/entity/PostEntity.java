package com.envicool.room.model.entity;

public class PostEntity extends BaseEntity {
    
    private static final long serialVersionUID = -5567307628796319874L;

    //标题
    protected String title;
    
    //内容
    protected String content;

    //编码
    //页面编码如下：blog（博文）,contact（联系我们）,about(关于我们)，infor(行业资讯)，product（产品信息）
    protected String code = "blog";
}
