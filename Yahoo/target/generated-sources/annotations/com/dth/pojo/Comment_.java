package com.dth.pojo;

import com.dth.pojo.Post;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, User> idUser;
    public static volatile SingularAttribute<Comment, Date> updateAt;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, String> content;
    public static volatile SingularAttribute<Comment, Date> createAt;
    public static volatile SingularAttribute<Comment, Post> idPost;

}