package com.sunchenbin.store.model.test;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sunchenbin.store.annotation.Column;
import com.sunchenbin.store.annotation.Table;
import com.sunchenbin.store.command.BaseModel;
import com.sunchenbin.store.constants.MySqlTypeConstant;

@Table(name = "t_ad")
public class Ad extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6373044273389162658L;
	/** 主键ID */
	@Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isNull = false, isKey = true, isAutoIncrement = true)
	private Integer id;
	private String uuid;
	/** 微信公众号ID */
	@Column(name = "appid", type = MySqlTypeConstant.VARCHAR, length = 90)
	private String appid;
	/** 广告名称 */
	@Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String name;
	/** 广告投放开始日期 */
	@Column(name = "start_date", type = MySqlTypeConstant.DATETIME, length = 0)
	private Date startDate;
	/** 广告投放结束日期 */
	@Column(name = "end_date", type = MySqlTypeConstant.DATETIME, length = 0)
	private Date endDate;
	/** 广告投放平台 */
	@Column(name = "platform", type = MySqlTypeConstant.INT, length = 11)
	private Integer platform;
	/** 广告类型（微信推广、设备广告） */
	@Column(name = "adtype", type = MySqlTypeConstant.INT, length = 11)
	private Integer adType;
	/** 广告计划名称（关联d_ad_schedule） */
	@Column(name = "ad_schedule_id", type = MySqlTypeConstant.INT, length = 11)
	private Integer adScheduleId;
	/** 广告图片url */
	@Column(name = "ad_url", type = MySqlTypeConstant.VARCHAR, length = 255)
	private String adUrl;
	/** 打印链接 */
	@Column(name = "link_url", type = MySqlTypeConstant.VARCHAR, length = 255)
	private String linkUrl;
	/** 跳转链接 */
	@Column(name = "redirect_url", type = MySqlTypeConstant.VARCHAR, length = 255)
	private String redirectUrl;
	/** 用户选择的地点 */
	@Column(name = "area", type = MySqlTypeConstant.VARCHAR, length = 255)
	private String area;
	/** 广告标签 */
	@Column(name = "tag", type = MySqlTypeConstant.VARCHAR, length = 50)
	private String tag;
	/** 广告收费类型 */
	@Column(name = "charge_type", type = MySqlTypeConstant.INT, length = 11)
	private Integer chargeType;
	/** 广告收费价格 */
	@Column(name = "charge", type = MySqlTypeConstant.INT, length = 11)
	private Integer charge;
	/** 广告审核 */
	@Column(name = "checkflag", type = MySqlTypeConstant.INT, length = 11)
	private Integer checkflag;
	/** 审核未通过原因 */
	@Column(name = "reason", type = MySqlTypeConstant.TEXT, length = 100)
	private String reason;
	/** 创建者 */
	@Column(name = "create_user_id", type = MySqlTypeConstant.INT, length = 11)
	private Integer createUserId;
	/** 更新者 */
	@Column(name = "update_user_id", type = MySqlTypeConstant.INT, length = 11)
	private Integer updateUserId;
	/** 创建时间 */
	@Column(name = "create_time", type = MySqlTypeConstant.DATETIME, length = 0)
	private Date createTime;
	/** 更新时间 */
	@Column(name = "update_time", type = MySqlTypeConstant.DATETIME, length = 0)
	private Date updateTime;
	/** 广告限额 */
	@Column(name = "quota", type = MySqlTypeConstant.INT, length = 11)
	private Integer quota;
	/** 广告开关 */
	@Column(name = "onoff", type = MySqlTypeConstant.INT, length = 11)
	private Integer onoff;
	/** 存市编码，如果area包含省编码，换算成市编码 */
	@Column(name = "area_city", type = MySqlTypeConstant.VARCHAR, length = 111)
	private String areaCity;
	/** 广告优先级 */
	@Column(name = "priority", type = MySqlTypeConstant.INT, length = 11)
	private Integer priority;

	private String area_city;
	@Column(name = "sex", type = MySqlTypeConstant.VARCHAR, length = 11)
	private String sex;
	@Column(name = "os", type = MySqlTypeConstant.VARCHAR, length = 100)
	private String os;
	@Column(name = "industry", type = MySqlTypeConstant.VARCHAR, length = 100)
	private String industry;

	public String getArea_city() {
		return area_city;
	}

	public void setArea_city(String area_city) {
		this.area_city = area_city;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getAreaCity() {
		return areaCity;
	}

	public void setAreaCity(String areaCity) {
		this.areaCity = areaCity;
	}

	public Integer getOnoff() {
		return onoff;
	}

	public void setOnoff(Integer onoff) {
		this.onoff = onoff;
	}

	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Integer getAdType() {
		return adType;
	}

	public void setAdType(Integer adType) {
		this.adType = adType;
	}

	public Integer getAdScheduleId() {
		return adScheduleId;
	}

	public void setAdScheduleId(Integer adScheduleId) {
		this.adScheduleId = adScheduleId;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getChargeType() {
		return chargeType;
	}

	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getCharge() {
		return charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

	public Integer getCheckflag() {
		return checkflag;
	}

	public void setCheckflag(Integer checkflag) {
		this.checkflag = checkflag;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
