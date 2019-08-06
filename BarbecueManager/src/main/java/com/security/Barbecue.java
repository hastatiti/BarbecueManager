package com.security;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="barbecue_table")
public class Barbecue {
	private Long barbecueId;
	private String name;
	private String description;
	private BigDecimal authorizedHours;
	private BigDecimal authorizedFunds;
	
	public Barbecue() {
		super();
	}

	@Id
	@Column(name="BARBECUEID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getBarbecueId() {
		return barbecueId;
	}

	public void setBarbecueId(Long barbecueId) {
		this.barbecueId = barbecueId;
	}
	@Column(name="NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="AUTHORIZEDHOURS")
	public BigDecimal getAuthorizedHours() {
		return authorizedHours;
	}

	public void setAuthorizedHours(BigDecimal authorizedHours) {
		this.authorizedHours = authorizedHours;
	}
	@Column(name="AUTHORIZEDFUNDS")
	public BigDecimal getAuthorizedFunds() {
		return authorizedFunds;
	}

	public void setAuthorizedFunds(BigDecimal authorizedFunds) {
		this.authorizedFunds = authorizedFunds;
	}


	@Override
	public String toString() {
		return "Barbecue [barbecueId=" + barbecueId + ", name=" + name + ", description=" + description
				+ ", authorizedHours=" + authorizedHours + ", authorizedFunds=" + authorizedFunds + "]";
	}
	
}
