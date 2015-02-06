package com.rizomm.carpooling.service;

import java.util.List;

import com.rizomm.carpooling.model.Membre;


public interface MembreService {

	Membre createMembre();
	boolean saveMembre(Membre membre);
	boolean deleteMembre(Membre membre);
	boolean updateMembre(Membre membre);
	Membre loadMembreById(int id);
	List<Membre> listMembre();
}
