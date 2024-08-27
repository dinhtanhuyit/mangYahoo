package com.dth.pojo;

import com.dth.pojo.ReportUserPK;
import com.dth.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2024-08-23T01:22:36")
@StaticMetamodel(ReportUser.class)
public class ReportUser_ { 

    public static volatile SingularAttribute<ReportUser, User> user1;
    public static volatile SingularAttribute<ReportUser, ReportUserPK> reportUserPK;
    public static volatile SingularAttribute<ReportUser, Date> updateAt;
    public static volatile SingularAttribute<ReportUser, User> user;
    public static volatile SingularAttribute<ReportUser, Date> createAt;
    public static volatile SingularAttribute<ReportUser, String> reportReason;

}