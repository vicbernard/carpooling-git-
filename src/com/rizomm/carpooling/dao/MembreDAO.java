package com.rizomm.carpooling.dao;

import java.util.List;

import com.rizomm.carpooling.model.Membre;

public interface MembreDAO {

	public Membre createMembre();
	public boolean saveMembre(Membre membre);
	public boolean deleteMembre(Membre membre);
	public boolean updateMembre(Membre membre);
	public Membre loadMembreById(int id);
	public List<Membre> listMembre();
}
