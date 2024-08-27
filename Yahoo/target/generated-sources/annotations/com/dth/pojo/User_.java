package com.dth.pojo;

import com.dth.pojo.Auction;
import com.dth.pojo.Comment;
import com.dth.pojo.LikePost;
import com.dth.pojo.Post;
import com.dth.pojo.ReportUser;
import com.dth.pojo.Share;
import com.dth.pojo.UserRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-27T04:36:58")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SetAttribute<User, Auction> auctionSet;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, Short> gender;
    public static volatile SingularAttribute<User, Date> updateAt;
    public static volatile SetAttribute<User, ReportUser> reportUserSet;
    public static volatile SetAttribute<User, Share> shareSet;
    public static volatile SingularAttribute<User, Date> dateOfBirth;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SetAttribute<User, ReportUser> reportUserSet1;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SetAttribute<User, Post> postSet;
    public static volatile SingularAttribute<User, Date> createAt;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, UserRole> userRoleSet;
    public static volatile SetAttribute<User, Comment> commentSet;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SetAttribute<User, LikePost> likePostSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;

}