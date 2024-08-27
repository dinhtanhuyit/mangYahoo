package com.dth.pojo;

import com.dth.pojo.PostTag;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(HashTag.class)
public class HashTag_ { 

    public static volatile SingularAttribute<HashTag, Integer> id;
    public static volatile SetAttribute<HashTag, PostTag> postTagSet;
    public static volatile SingularAttribute<HashTag, String> content;

}