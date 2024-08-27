package com.dth.pojo;

import com.dth.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(AuctionStatus.class)
public class AuctionStatus_ { 

    public static volatile SingularAttribute<AuctionStatus, Integer> id;
    public static volatile SingularAttribute<AuctionStatus, String> nameAuctionStatus;
    public static volatile SetAttribute<AuctionStatus, Post> postSet;

}