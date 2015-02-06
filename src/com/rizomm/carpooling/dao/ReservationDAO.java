package com.rizomm.carpooling.dao;

import java.util.List;

import com.rizomm.carpooling.model.Reservation;

public interface ReservationDAO {

	public Reservation createReservation();
	public boolean saveReservation(Reservation reservation);
	public boolean deleteReservation(Reservation reservation);
	public boolean updateReservation(Reservation reservation);
	public Reservation loadReservationById(int id);
	public List<Reservation> listReservation();
}
