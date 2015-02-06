package com.rizomm.carpooling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rizomm.carpooling.dao.MembreDAO;
import com.rizomm.carpooling.model.Membre;
import com.rizomm.carpooling.service.MembreService;

@Repository("membreService")
public class MembreServiceImpl implements MembreService {

	@Autowired
	MembreDAO membreDAO;
	
	@Override
	public Membre createMembre() {
		return new Membre();
	}

	@Transactional
	@Override
	public boolean saveMembre(Membre membre) {
		return membreDAO.saveMembre(membre);
	}

	@Transactional
	@Override
	public boolean deleteMembre(Membre membre) {
		return membreDAO.deleteMembre(membre);
	}

	@Transactional
	@Override
	public boolean updateMembre(Membre membre) {
		return membreDAO.updateMembre(membre);
	}

	@Transactional
	@Override
	public Membre loadMembreById(int id) {
		return membreDAO.loadMembreById(id);
	}

	@Transactional
	@Override
	public List<Membre> listMembre() {
		return membreDAO.listMembre();
	}

}
