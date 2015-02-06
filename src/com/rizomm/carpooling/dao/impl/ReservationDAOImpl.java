package com.rizomm.carpooling.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.ReservationDAO;
import com.rizomm.carpooling.model.Membre;
import com.rizomm.carpooling.model.Reservation;

@Repository("reservationDAO")
public class ReservationDAOImpl implements ReservationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Reservation createReservation() {
		return new Reservation();
	}

	@Override
	public boolean saveReservation(Reservation reservation) {
		try {
			sessionFactory.getCurrentSession().save(reservation);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteReservation(Reservation reservation) {
		try {
			sessionFactory.getCurrentSession().delete(reservation);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean updateReservation(Reservation reservation) {
		try {
			sessionFactory.getCurrentSession().update(reservation);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Reservation loadReservationById(int id) {
		try{
			return (Reservation) sessionFactory.getCurrentSession().get(Reservation.class,  id);
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public List<Reservation> listReservation() {
		List<Reservation> reservations = sessionFactory.getCurrentSession().createQuery("from Reservation").list();
		return reservations;
	}

	

}
