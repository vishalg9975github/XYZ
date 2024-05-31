package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productdetails")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bike_id;
	private String bikenum;
	private String bikename;
	private String bikevar;
	private int modelyear;
	private String status;
	private LocalDate createdon;
	private int price;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bike_id", referencedColumnName = "bike_id")
	private List<Booking> booking;

	public int getId() {
		return bike_id;
	}

	public void setId(int bike_id) {
		this.bike_id = bike_id;
	}

	public String getBikenum() {
		return bikenum;
	}

	public void setBikenum(String bikenum) {
		this.bikenum = bikenum;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getBikevar() {
		return bikevar;
	}

	public void setBikevar(String bikevar) {
		this.bikevar = bikevar;
	}

	public int getModelyear() {
		return modelyear;
	}

	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDate createdon) {
		this.createdon = createdon;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

}
