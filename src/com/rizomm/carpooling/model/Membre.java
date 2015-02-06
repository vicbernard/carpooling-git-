/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.rizomm.carpooling.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Membre")
public class Membre implements Serializable {
	public Membre() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="COM_RIZOMM_CARPOOLING_MODEL_MEMBRE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_RIZOMM_CARPOOLING_MODEL_MEMBRE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="NomMembre", nullable=true, length=255)	
	private String nomMembre;
	
	@Column(name="PrenomMembre", nullable=true, length=255)	
	private String prenomMembre;
	
	@OneToMany(targetEntity=com.rizomm.carpooling.model.Reservation.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MembreID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set reservations = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNomMembre(String value) {
		this.nomMembre = value;
	}
	
	public String getNomMembre() {
		return nomMembre;
	}
	
	public void setPrenomMembre(String value) {
		this.prenomMembre = value;
	}
	
	public String getPrenomMembre() {
		return prenomMembre;
	}
	
	public void setReservations(java.util.Set value) {
		this.reservations = value;
	}
	
	public java.util.Set getReservations() {
		return reservations;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
