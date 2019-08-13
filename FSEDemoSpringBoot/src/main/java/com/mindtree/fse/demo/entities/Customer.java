/**
 * 
 */
package com.mindtree.fse.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author M1031960
 *
 */
@Entity
@Table(name = "customer")
@EntityListeners(AuditingEntityListener.class)
public class Customer {
	
	@Column(name = "customer_id")
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@Column(name = "full_name")
	@NotNull(message = "Full name is required!")
	private String fullName;
	
	@Column(name = "email_address")
	@NotNull(message = "Email Address is required!")
	private String emailAddress;
	
	@Column(name = "mobile_number")
	private long mobileNumber;
	
	@Column(name = "date_of_birth")
	
	private Date dateOfBirth;
	
	@Column(name = "acive_flag", columnDefinition="INT")
	
	private boolean active;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
