package com.gmh.entity;

import java.util.Date;

/**
 * 会员主表
 */
public class Member extends FixedField{
	private static final long serialVersionUID = 1L;
	/** 会员id主键  */
	private Integer id;
	/** 会员等级（0：公司，1：合作者，2：股东，3：高总，4：总代，5代理：6：会员） */
	private Integer memberLevel;
	/** 上级Id */
	private Integer parentId; 
	/** 登陆账号  */
	private String loginName;
	/** 昵称  */
	private String nickName;
	/** 密码  */
	private String pwd = "";
	/** Mac Address  */
	private String macAddress;
	/** 芯片卡Id  */
	private String nfcId;
	
	/** 密碼到期日  */
	private Date pwdExpiryTime;
	/** 密码错误次数 */
	private Integer pwdFailuerCount = 0;
	/** 货币类型  */
	private String currency;
	/** 货币的倍数  */
	private Double currencyMtp = 1.0;
	
	/** 自己账户域名,指向域名表  */
	private String domainIds;	
	/** 下级账户域名 */
	private String lowerDomainIds;	
	
	/** CASH/CREDIT  默认信用额用户      (cash 现金用户) */
	private Integer market=1;   //1 信用账号，2现金账号 ，0 代表公司所有
	/** 整個上線 */
	private String parentPath;
	/** 会员状态（默认为1:活动，2：暫停,3  关闭） */
	private Integer memberState=1;    
	/** 密码错误次数>5锁定  */
	private Boolean isLocked=Boolean.FALSE;
	/** 是否接受条款  */
	private Integer isAgree=0;
	/** 是否已经删除  */
	private Integer isDelete=0;  //0:开启，1：关闭
	/** 非法进入 */
	private Integer noIllegalAccess=0; 
	/** 判断是用户名或者是昵称还是只能是昵称登陆 1为两者都可以0为只能是昵称登陆 */
	private Integer loginMode=1;
	/** 现在登录时间 */
	private Date loginTime;
	/** 现在登录IP */
	private String loginIp;
	/** 上次登陆时间 */
	private Date  lastLoginTime;
	/** 上次登录脑IP */
	private String lastLoginIp;
	/**全名 */
	private String fullName;
	/**  电话 */
	private String phone;
	/** 电邮 */
	private String email;
	
	private String errorCode;
	
	private String loginDomain;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getParentPath() {
		return parentPath;
	}
	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	
	public Integer getNoIllegalAccess() {
		return noIllegalAccess;
	}
	public void setNoIllegalAccess(Integer noIllegalAccess) {
		this.noIllegalAccess = noIllegalAccess;
	}
	
	public Integer getIsAgree() {
		return isAgree;
	}
	public void setIsAgree(Integer isAgree) {
		this.isAgree = isAgree;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Integer getMemberState() {
		return memberState;
	}
	public void setMemberState(Integer memberState) {
		this.memberState = memberState;
	}
	
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	public String getNfcId() {
		return nfcId;
	}
	public void setNfcId(String nfcId) {
		this.nfcId = nfcId;
	}
	public Boolean getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	public Integer getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
	
	public Date getPwdExpiryTime() {
		return pwdExpiryTime;
	}
	public void setPwdExpiryTime(Date pwdExpiryTime) {
		this.pwdExpiryTime = pwdExpiryTime;
	}
	public Integer getPwdFailuerCount() {
		return pwdFailuerCount;
	}
	public void setPwdFailuerCount(Integer pwdFailuerCount) {
		this.pwdFailuerCount = pwdFailuerCount;
	}
	
	public String getDomainIds() {
		return domainIds;
	}
	public void setDomainIds(String domainIds) {
		this.domainIds = domainIds;
	}
	
	public String getLowerDomainIds() {
		return lowerDomainIds;
	}
	public void setLowerDomainIds(String lowerDomainIds) {
		this.lowerDomainIds = lowerDomainIds;
	}
	
	public Integer getMarket() {
		return market;
	}
	public void setMarket(Integer market) {
		this.market = market;
	}
	
	public Integer getLoginMode() {
		return loginMode;
	}
	public void setLoginMode(Integer loginMode) {
		this.loginMode = loginMode;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Double getCurrencyMtp() {
		return currencyMtp;
	}
	public void setCurrencyMtp(Double currencyMtp) {
		this.currencyMtp = currencyMtp;
	}
	//####################
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

	
	public String getLoginDomain() {
		return loginDomain;
	}
	public void setLoginDomain(String loginDomain) {
		this.loginDomain = loginDomain;
	}
	
	
}
