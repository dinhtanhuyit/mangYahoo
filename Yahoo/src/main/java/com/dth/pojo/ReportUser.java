/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dth.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinht
 */
@Entity
@Table(name = "report_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReportUser.findAll", query = "SELECT r FROM ReportUser r"),
    @NamedQuery(name = "ReportUser.findByIdUser", query = "SELECT r FROM ReportUser r WHERE r.reportUserPK.idUser = :idUser"),
    @NamedQuery(name = "ReportUser.findByIdUserReported", query = "SELECT r FROM ReportUser r WHERE r.reportUserPK.idUserReported = :idUserReported"),
    @NamedQuery(name = "ReportUser.findByCreateAt", query = "SELECT r FROM ReportUser r WHERE r.createAt = :createAt"),
    @NamedQuery(name = "ReportUser.findByUpdateAt", query = "SELECT r FROM ReportUser r WHERE r.updateAt = :updateAt")})
public class ReportUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReportUserPK reportUserPK;
    @Lob
    @Size(max = 65535)
    @Column(name = "report_reason")
    private String reportReason;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @JoinColumn(name = "id_user", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;
    @JoinColumn(name = "id_user_reported", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user1;

    public ReportUser() {
    }

    public ReportUser(ReportUserPK reportUserPK) {
        this.reportUserPK = reportUserPK;
    }

    public ReportUser(int idUser, int idUserReported) {
        this.reportUserPK = new ReportUserPK(idUser, idUserReported);
    }

    public ReportUserPK getReportUserPK() {
        return reportUserPK;
    }

    public void setReportUserPK(ReportUserPK reportUserPK) {
        this.reportUserPK = reportUserPK;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportUserPK != null ? reportUserPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportUser)) {
            return false;
        }
        ReportUser other = (ReportUser) object;
        if ((this.reportUserPK == null && other.reportUserPK != null) || (this.reportUserPK != null && !this.reportUserPK.equals(other.reportUserPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dth.pojo.ReportUser[ reportUserPK=" + reportUserPK + " ]";
    }
    
}
