package com.rizomm.carpooling.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rizomm.carpooling.dao.MembreDAO;
import com.rizomm.carpooling.model.Membre;

@Repository("membreDAO")
public class MembreDAOImpl implements MembreDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Membre createMembre() {
		return new Membre();
	}

	@Override
	public boolean saveMembre(Membre membre) {
		try {
			sessionFactory.getCurrentSession().save(membre);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteMembre(Membre membre) {
		try {
			sessionFactory.getCurrentSession().delete(membre);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean updateMembre(Membre membre) {
		try {
			sessionFactory.getCurrentSession().update(membre);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Membre loadMembreById(int id) {
		try{
			return (Membre) sessionFactory.getCurrentSession().get(Membre.class,  id);
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public List<Membre> listMembre() {
		List<Membre> membres = sessionFactory.getCurrentSession().createQuery("from Membre").list();
		return membres;
	}

	

	

}
