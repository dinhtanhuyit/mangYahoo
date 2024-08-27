package com.dth.pojo;

import com.dth.pojo.Post;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-27T04:36:58")
@StaticMetamodel(Share.class)
public class Share_ { 

    public static volatile SingularAttribute<Share, User> idUser;
    public static volatile SingularAttribute<Share, Date> updateAt;
    public static volatile SingularAttribute<Share, Integer> id;
    public static volatile SingularAttribute<Share, String> content;
    public static volatile SingularAttribute<Share, Date> createAt;
    public static volatile SingularAttribute<Share, Post> idPost;

}