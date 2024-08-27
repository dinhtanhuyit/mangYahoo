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
public class LikePostPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_post")
    private int idPost;

    public LikePostPK() {
    }

    public LikePostPK(int id, int idUser, int idPost) {
        this.id = id;
        this.idUser = idUser;
        this.idPost = idPost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idUser;
        hash += (int) idPost;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LikePostPK)) {
            return false;
        }
        LikePostPK other = (LikePostPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.idPost != other.idPost) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dth.pojo.LikePostPK[ id=" + id + ", idUser=" + idUser + ", idPost=" + idPost + " ]";
    }
    
}
