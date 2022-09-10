package com.lagou.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "c_order")
public class Order implements Serializable {

    @Id
    @Column(name="id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "is_del")
    private Boolean isDel;

    @Column( name = "user_id")
    private Integer userId;

    @Column( name = "company_id")
    private Integer companyId;

    @Column( name = "publish_user_id")
    private Integer publishUserId;

    @Column( name = "position_id")
    private Integer positionId;

    @Column( name = "resume_type")
    private Integer resumeType;

    @Column( name = "status")
    private String status;

    @Column( name = "create_time")
    private LocalDateTime createTime;

    @Column( name = "update_time")
    private LocalDateTime updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(Integer publishUserId) {
        this.publishUserId = publishUserId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getResumeType() {
        return resumeType;
    }

    public void setResumeType(Integer resumeType) {
        this.resumeType = resumeType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", isDel=" + isDel +
                ", userId=" + userId +
                ", companyId=" + companyId +
                ", publishUserId=" + publishUserId +
                ", positionId=" + positionId +
                ", resumeType=" + resumeType +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
