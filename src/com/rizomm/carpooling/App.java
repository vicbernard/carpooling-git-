package com.rizomm.carpooling;

import java.util.List;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.rizomm.carpooling.model.Membre;
import com.rizomm.carpooling.model.Reservation;
import com.rizomm.carpooling.service.MembreService;
import com.rizomm.carpooling.service.ReservationService;

public class App {

	public static void main(String[] args) throws InterruptedException {

		/* chargement du fichier de contexte */
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/main/resources/applicationContext.xml");
		
		/* service */
	
		MembreService membreService = (MembreService) context.getBean("membreService");
		
		ReservationService reservationService = (ReservationService) context.getBean("reservationService");
	
		/* instanciation d'un objet Membre */
		
		Membre membre = new Membre();
		
		membre.setNomMembre("BON");
		
		membre.setPrenomMembre("JEAN");
	
		/* instanciation d'un objet reservation */
		
		Reservation reservation = new Reservation();
		
		reservation.setDateReservation("2016-01-05");
		
		java.util.Set reservations = new java.util.HashSet();
		
		reservations.add(reservation);
	
		membre.setReservations(reservations);
	
		/* creation du membre */
		
		membreService.saveMembre(membre);
		
		System.out.println("creation du membre");
		
		Thread.sleep(5000);
		
		System.out.println("R�cup�ration et mise � jour du membre");
	
		Membre membreRecup = membreService.loadMembreById(1);
		
	
		membreRecup.setNomMembre("JEAN");
		
		membreRecup.setPrenomMembre("BON");
	
		/* sauvegarde du membre */
		
		membreService.updateMembre(membreRecup);
		
		System.out.println("Sauvegarde du membre");
		
		Thread.sleep(5000);
		
		System.out.println("Sauvegarde de la reservation");
		
		Thread.sleep(5000);
	
		/* mise � jour de la reservation */
		
		java.util.Set<Reservation> reservationsForMaj = membreService.loadMembreById(1).getReservations();
		
		for(Reservation r : reservationsForMaj) {
			r.setDateReservation("2015-02-01");
			reservationService.updateReservation(r);
		}
	
		Thread.sleep(5000);
		
		System.out.println("Suppression du membre");
		
		membreService.deleteMembre(membre);
		
		context.close();
	}
}