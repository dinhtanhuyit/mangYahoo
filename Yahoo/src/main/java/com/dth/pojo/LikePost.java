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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dinht
 */
@Entity
@Table(name = "like_post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LikePost.findAll", query = "SELECT l FROM LikePost l"),
    @NamedQuery(name = "LikePost.findById", query = "SELECT l FROM LikePost l WHERE l.likePostPK.id = :id"),
    @NamedQuery(name = "LikePost.findByIdUser", query = "SELECT l FROM LikePost l WHERE l.likePostPK.idUser = :idUser"),
    @NamedQuery(name = "LikePost.findByIdPost", query = "SELECT l FROM LikePost l WHERE l.likePostPK.idPost = :idPost"),
    @NamedQuery(name = "LikePost.findByIsLike", query = "SELECT l FROM LikePost l WHERE l.isLike = :isLike"),
    @NamedQuery(name = "LikePost.findByCreateAt", query = "SELECT l FROM LikePost l WHERE l.createAt = :createAt"),
    @NamedQuery(name = "LikePost.findByUpdateAt", query = "SELECT l FROM LikePost l WHERE l.updateAt = :updateAt")})
public class LikePost implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LikePostPK likePostPK;
    @Column(name = "is_like")
    private Short isLike;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @JoinColumn(name = "id_post", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Post post;
    @JoinColumn(name = "id_user", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;

    public LikePost() {
    }

    public LikePost(LikePostPK likePostPK) {
        this.likePostPK = likePostPK;
    }

    public LikePost(int id, int idUser, int idPost) {
        this.likePostPK = new LikePostPK(id, idUser, idPost);
    }

    public LikePostPK getLikePostPK() {
        return likePostPK;
    }

    public void setLikePostPK(LikePostPK likePostPK) {
        this.likePostPK = likePostPK;
    }

    public Short getIsLike() {
        return isLike;
    }

    public void setIsLike(Short isLike) {
        this.isLike = isLike;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (likePostPK != null ? likePostPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LikePost)) {
            return false;
        }
        LikePost other = (LikePost) object;
        if ((this.likePostPK == null && other.likePostPK != null) || (this.likePostPK != null && !this.likePostPK.equals(other.likePostPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dth.pojo.LikePost[ likePostPK=" + likePostPK + " ]";
    }
    
}
