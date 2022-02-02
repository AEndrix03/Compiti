package test;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import enums.Sex;
import enums.TypeAquila;
import enums.TypeGatto;

public class Main implements Serializable{

	private static ArrayList<Animale> zoo = new ArrayList<>();
	
	public static void main(String[] args) {
		
		load();
		
		zoo.add(new Gatto("Pippo", Sex.MALE, false, true, TypeGatto.EUROPEO));
		zoo.add(new Gatto("Palla_di_neve", Sex.FEMALE, false, true, TypeGatto.SIAMESE));
		zoo.add(new Aquila("Corno", Sex.MALE, false, true, TypeAquila.CALVA));
		
		save();
		
	}
	
	public static void load() {
		FileInputStream file;
		ObjectInputStream fIN;
		try {
			file = new FileInputStream("list.dat");
			fIN = new ObjectInputStream(file);
			
			while(true) {
				try {
					
					Animale o = (Animale) fIN.readObject();
					if (o instanceof Gatto) 
						zoo.add((Gatto)o);
					else if (o instanceof Aquila) 
						zoo.add((Aquila)o);
					
				} catch (EOFException | ClassNotFoundException ex) {
					break;
				}
			}
			
			System.out.println("letti: "+zoo.size());
			
			file.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("File non trovato. Creazione...");
			try {
				new File("list.dat").createNewFile();
			} catch (IOException ignored) {}
		} catch (SecurityException e) {
			System.out.println("Permessi di lettura assenti");
		} catch (IOException e) {
			System.out.println("IOEX");
			e.printStackTrace();
		}
	}
	
	public static void save() {
		FileOutputStream file;
		ObjectOutputStream fOUT;
		try {
			
			file = new FileOutputStream("list.dat");
			fOUT = new ObjectOutputStream(file);
			
			for (Animale a : zoo)
				if (a instanceof Gatto)
					fOUT.writeObject((Gatto)a);
				else if (a instanceof Aquila)
					fOUT.writeObject((Aquila)a);
			
			file.flush();
			file.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("File non trovato. Creazione...");
		} catch (SecurityException e) {
			System.out.println("Permessi di lettura assenti");
		} catch (Exception e) {
			System.out.println("EX " +  e.getMessage());
			e.printStackTrace();
		}
	}
	
}
