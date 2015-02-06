package com.rizomm.carpooling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.ReservationDAO;
import com.rizomm.carpooling.model.Reservation;
import com.rizomm.carpooling.service.ReservationService;

@Repository("reservationService")
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationDAO reservationDAO;
	
	@Override
	public Reservation createReservation() {
		return new Reservation();
	}

	@Transactional
	@Override
	public boolean saveReservation(Reservation reservation) {
		return reservationDAO.saveReservation(reservation);
	}

	@Transactional
	@Override
	public boolean deleteReservation(Reservation reservation) {
		return reservationDAO.deleteReservation(reservation);
	}

	@Transactional
	@Override
	public boolean updateReservation(Reservation reservation) {
		return reservationDAO.updateReservation(reservation);
	}

	@Transactional
	@Override
	public Reservation loadReservationById(int id) {
		return reservationDAO.loadReservationById(id);
	}

	@Transactional
	@Override
	public List<Reservation> listReservation() {
		return reservationDAO.listReservation();
	}

}
