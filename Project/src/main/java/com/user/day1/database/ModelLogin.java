package com.user.day1.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "gamex")
	public class ModelLogin {
		
		

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private int userid;
			private String username;
			private String password;
			private String name;
			private int age;
			private int phonenumber;
			private String gender;
			private int dob;
			private String emailid;
			private int location;
			
			public int getUserid() {
				return userid;
			}
			public void setUserid(int userid) {
				this.userid = userid;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPhonenumber() {
				return phonenumber;
			}
			public void setPhonenumber(int phonenumber) {
				this.phonenumber = phonenumber;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public int getDob() {
				return dob;
			}
			public void setDob(int dob) {
				this.dob = dob;
			}
			public String getEmailid() {
				return emailid;
			}
			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getLocation() {
				return location;
			}
			public void setLocation(int location) {
				this.location = location;
			}
			@Override
			public String toString() {
				return "ModelLogin [userid=" + userid + ", username=" + username + ", password=" + password + ", age="
						+ age + ", phonenumber=" + phonenumber + ", gender=" + gender + ", dob=" + dob + ", emailid="
						+ emailid + ", name=" + name + ", location=" + location + ", getUserid()=" + getUserid()
						+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getAge()="
						+ getAge() + ", getPhonenumber()=" + getPhonenumber() + ", getGender()=" + getGender()
						+ ", getDob()=" + getDob() + ", getEmailid()=" + getEmailid() + ", getName()=" + getName()
						+ ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
						+ hashCode() + ", toString()=" + super.toString() + "]";
			}
}