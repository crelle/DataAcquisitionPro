package com.archermind.springBoot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String passWord;

	private String taskId;

	private String role;

	@Column(nullable = false)
	private String age;

	@Column(nullable = false)
	private String sex;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String phone;

	private String city;

	private String education;

	private String status;

	private String salt;// 加密密码的盐

	@ManyToMany(fetch = FetchType.EAGER) // 立即从数据库中进行加载数据;
	@JoinTable(name = "UserRole", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId") })
	private List<Role> roleList;// 一个用户具有多个角色

	public User() {
		super();
	}

	public User(Long id, String userName, String passWord, String taskId, String role, String age, String sex,
			String email, String phone, String city, String education, String status, String salt,
			List<Role> roleList) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.taskId = taskId;
		this.role = role;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.education = education;
		this.status = status;
		this.salt = salt;
		this.roleList = roleList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 密码盐.
	 * 
	 * @return
	 */
	public String getCredentialsSalt() {
		return this.userName + this.salt;
	}
	// 重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解
}