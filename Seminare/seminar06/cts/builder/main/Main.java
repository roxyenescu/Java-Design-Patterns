package cts.builder.main;

import cts.builder.Pacient;
import cts.builder.PacientBuilder;

public class Main {

	public static void main(String[] args) {
		
		PacientBuilder pacientBuilder = new PacientBuilder("Ion");
		
//		Pacient pacient = pacientBuilder.setNume("Ion").setMicDejunInclus(true).setPapuciDeCamera(true).build();
//		Pacient pacientNou = new PacientBuilder().setNume("Maria").build();
		
		Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPapuciDeCamera(true).build();
		Pacient pacientNou = new PacientBuilder("Maria").build();
		Pacient pacientNou2 = new PacientBuilder("Vasile").setMicDejunInclus(true).setPatRabatabil(true).build();
		Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).build();
		
		
		System.out.println(pacient.toString());
//		System.out.println(pacientNou.toString());
//		System.out.println(pacientNou2.toString());
		System.out.println(pacientNou3.toString());
		

	}

}
