package com.dth.pojo;

import com.dth.pojo.Auction;
import com.dth.pojo.AuctionStatus;
import com.dth.pojo.Comment;
import com.dth.pojo.LikePost;
import com.dth.pojo.PostTag;
import com.dth.pojo.Share;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, Double> startPrice;
    public static volatile SingularAttribute<Post, String> image;
    public static volatile SingularAttribute<Post, Date> auctionStartTime;
    public static volatile SetAttribute<Post, Auction> auctionSet;
    public static volatile SingularAttribute<Post, Date> updateAt;
    public static volatile SetAttribute<Post, Share> shareSet;
    public static volatile SingularAttribute<Post, String> title;
    public static volatile SetAttribute<Post, PostTag> postTagSet;
    public static volatile SingularAttribute<Post, String> content;
    public static volatile SingularAttribute<Post, Date> createAt;
    public static volatile SingularAttribute<Post, User> idUser;
    public static volatile SetAttribute<Post, Comment> commentSet;
    public static volatile SingularAttribute<Post, AuctionStatus> auctionStatus;
    public static volatile SetAttribute<Post, LikePost> likePostSet;
    public static volatile SingularAttribute<Post, Integer> id;
    public static volatile SingularAttribute<Post, Date> auctionEndTime;

}