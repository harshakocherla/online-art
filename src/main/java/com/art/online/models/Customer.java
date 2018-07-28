package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long customer_id;
	
	@Column(name = "customer_name", length = 225)
	private String customerName;
	
	@Column(name = "phone", length = 225)
	private String phone;
	
	@OneToMany(mappedBy = "customer")
	private Set<CustomerAddress> customerAddress;
	
	@ManyToOne
	@JoinColumn(name = "painting_id", nullable= false)
	private Painting painting;

	/**
	 * @return the customer_id
	 */
	public long getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the customerAddress
	 */
	public Set<CustomerAddress> getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(Set<CustomerAddress> customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the painting
	 */
	public Painting getPainting() {
		return painting;
	}

	/**
	 * @param painting the painting to set
	 */
	public void setPainting(Painting painting) {
		this.painting = painting;
	}
}
