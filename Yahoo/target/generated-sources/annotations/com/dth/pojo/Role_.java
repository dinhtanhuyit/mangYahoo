package com.dth.pojo;

import com.dth.pojo.UserRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SetAttribute<Role, UserRole> userRoleSet;
    public static volatile SingularAttribute<Role, String> nameRole;
    public static volatile SingularAttribute<Role, Date> updateAt;
    public static volatile SingularAttribute<Role, Integer> id;
    public static volatile SingularAttribute<Role, Date> createAt;

}