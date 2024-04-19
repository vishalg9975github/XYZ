package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "userdetails")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String primaryMobile;
	private String secondaryMobile;
	private String dob;
	private Integer age;
	private String gender;
	private String refferalType;
	private String refferalInfo;
	private String address;
	private String city;
	private String state;
	/** Below fields should be auto generate while creating new user **/

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on")
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_on")
	private Date modifiedOn;

	private boolean deleted = false;
	private boolean status = true;

	private String comments;

	@PrePersist
	protected void onCreate() {
		createdOn = new Date();
		modifiedOn = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		modifiedOn = new Date();
	}
}
