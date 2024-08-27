package com.dth.pojo;

import com.dth.pojo.Post;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-27T04:36:58")
@StaticMetamodel(Auction.class)
public class Auction_ { 

    public static volatile SingularAttribute<Auction, User> idUser;
    public static volatile SingularAttribute<Auction, Short> isWinnerAuctioned;
    public static volatile SingularAttribute<Auction, Double> price;
    public static volatile SingularAttribute<Auction, Date> updateAt;
    public static volatile SingularAttribute<Auction, Integer> id;
    public static volatile SingularAttribute<Auction, Date> createAt;
    public static volatile SingularAttribute<Auction, Post> idPost;

}