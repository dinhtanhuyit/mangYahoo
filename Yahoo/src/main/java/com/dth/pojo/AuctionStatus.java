/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dth.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dinht
 */
@Entity
@Table(name = "auction_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuctionStatus.findAll", query = "SELECT a FROM AuctionStatus a"),
    @NamedQuery(name = "AuctionStatus.findById", query = "SELECT a FROM AuctionStatus a WHERE a.id = :id"),
    @NamedQuery(name = "AuctionStatus.findByNameAuctionStatus", query = "SELECT a FROM AuctionStatus a WHERE a.nameAuctionStatus = :nameAuctionStatus")})
public class AuctionStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "name_auction_status")
    private String nameAuctionStatus;
    @OneToMany(mappedBy = "auctionStatus")
    private Set<Post> postSet;

    public AuctionStatus() {
    }

    public AuctionStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAuctionStatus() {
        return nameAuctionStatus;
    }

    public void setNameAuctionStatus(String nameAuctionStatus) {
        this.nameAuctionStatus = nameAuctionStatus;
    }

    @XmlTransient
    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuctionStatus)) {
            return false;
        }
        AuctionStatus other = (AuctionStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dth.pojo.AuctionStatus[ id=" + id + " ]";
    }
    
}
