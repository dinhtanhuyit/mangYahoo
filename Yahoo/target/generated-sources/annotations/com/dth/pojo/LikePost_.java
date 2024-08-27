package com.dth.pojo;

import com.dth.pojo.LikePostPK;
import com.dth.pojo.Post;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(LikePost.class)
public class LikePost_ { 

    public static volatile SingularAttribute<LikePost, LikePostPK> likePostPK;
    public static volatile SingularAttribute<LikePost, Short> isLike;
    public static volatile SingularAttribute<LikePost, Post> post;
    public static volatile SingularAttribute<LikePost, Date> updateAt;
    public static volatile SingularAttribute<LikePost, User> user;
    public static volatile SingularAttribute<LikePost, Date> createAt;

}