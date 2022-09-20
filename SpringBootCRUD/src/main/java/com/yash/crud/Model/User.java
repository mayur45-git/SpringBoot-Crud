package com.yash.crud.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private Integer uid;
	private String uname;
	private long mobile;
	private String addr;
	
	public User() {}
	
	public User(Integer uid, String uname, long mobile, String addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mobile = mobile;
		this.addr = addr;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
