package com.sunchenbin.store.model.test;

import com.sunchenbin.store.annotation.Column;
import com.sunchenbin.store.annotation.Table;
import com.sunchenbin.store.command.BaseModel;
import com.sunchenbin.store.constants.MySqlTypeConstant;

/**
 * Created by allen on 2017/3/15.
 */
@Table(name="t_library")
public class Library extends BaseModel {
    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isNull = false, isKey = true, isAutoIncrement = true)
    private Integer id;
    @Column(name="pid",type=MySqlTypeConstant.INT,length = 11,isNull = false)
    private Integer pid;
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 255)
    private String name;
    @Column(name = "create_time", type = MySqlTypeConstant.DATETIME, length = 0)
    private String createTime;
    @Column(name = "update_time", type = MySqlTypeConstant.DATETIME, length = 0)
    private String updateTime;
    @Column(name = "is_delete", type = MySqlTypeConstant.INT, length = 11)
    private Integer isDelete;
    @Column(name = "create_user", type = MySqlTypeConstant.VARCHAR, length = 255)
    private String createUser;
    @Column(name = "update_user", type = MySqlTypeConstant.VARCHAR, length = 255)
    private String updateUser;
    @Column(name = "level_id", type = MySqlTypeConstant.INT, length = 11)
    private Integer levelId;
    @Column(name = "order_id", type = MySqlTypeConstant.INT, length = 11)
    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
