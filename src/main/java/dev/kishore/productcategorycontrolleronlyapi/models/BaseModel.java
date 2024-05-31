package dev.kishore.productcategorycontrolleronlyapi.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;

    // lombok crtl + shift + A delombok
//    public Long getId() {
//        return this.id;
//    }
//
//    public Date getCreatedAt() {
//        return this.createdAt;
//    }
//
//    public Date getLastUpdatedAt() {
//        return this.lastUpdatedAt;
//    }
//
//    public boolean isDeleted() {
//        return this.isDeleted;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public void setLastUpdatedAt(Date lastUpdatedAt) {
//        this.lastUpdatedAt = lastUpdatedAt;
//    }
//
//    public void setDeleted(boolean isDeleted) {
//        this.isDeleted = isDeleted;
//    }
}
