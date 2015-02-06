package com.rizomm.carpooling.service;

import java.util.List;
import com.rizomm.carpooling.model.Reservation;

public interface ReservationService {

	Reservation createReservation();
	boolean saveReservation(Reservation reservation);
	boolean deleteReservation(Reservation reservation);
	boolean updateReservation(Reservation reservation);
	Reservation loadReservationById(int id);
	List<Reservation> listReservation();
}
