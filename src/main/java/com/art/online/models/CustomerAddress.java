package com.art.online.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_address")
public class CustomerAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 */
	public CustomerAddress() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customer_address_id;
	
	@Column(name = "first_line", length = 255)
	private String firstLine;
	
	@Column(name = "second_line", length = 255)
	private String secondLine;
	
	@Column(name = "city", length = 255)
	private String city;
	
	@Column(name = "state", length = 255)
	private String state;
	
	@Column(name = "zip", length = 255)
	private String zip;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable= false)
	private Customer customer;

	/**
	 * @return the customer_address_id
	 */
	public long getCustomer_address_id() {
		return customer_address_id;
	}

	/**
	 * @param customer_address_id the customer_address_id to set
	 */
	public void setCustomer_address_id(long customer_address_id) {
		this.customer_address_id = customer_address_id;
	}

	/**
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}

	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
