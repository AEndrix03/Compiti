package test;

import java.io.Serializable;

import enums.Sex;
import enums.TypeAquila;

public class Aquila extends Animale implements Vita, Serializable {

	private TypeAquila type;

	public Aquila(String nome, Sex sex, boolean fly, boolean herbalist, TypeAquila type) {
		super(nome, sex, fly, herbalist);
		this.type = type;
	}

	public TypeAquila getType() {
		return type;
	}

	public void setType(TypeAquila type) {
		this.type = type;
	}

	@Override
	public void muovi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bevi() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Gatto [type=" + type + ", getNome()=" + getNome() + ", getSex()=" + getSex() + ", isFly()=" + isFly()
				+ ", isHerbalist()=" + isHerbalist() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
