/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dth.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dinht
 */
@Embeddable
public class ReportUserPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user_reported")
    private int idUserReported;

    public ReportUserPK() {
    }

    public ReportUserPK(int idUser, int idUserReported) {
        this.idUser = idUser;
        this.idUserReported = idUserReported;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUserReported() {
        return idUserReported;
    }

    public void setIdUserReported(int idUserReported) {
        this.idUserReported = idUserReported;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUser;
        hash += (int) idUserReported;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportUserPK)) {
            return false;
        }
        ReportUserPK other = (ReportUserPK) object;
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.idUserReported != other.idUserReported) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dth.pojo.ReportUserPK[ idUser=" + idUser + ", idUserReported=" + idUserReported + " ]";
    }
    
}
