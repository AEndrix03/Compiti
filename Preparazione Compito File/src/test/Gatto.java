package test;

import java.io.Serializable;

import enums.Sex;
import enums.TypeGatto;

public class Gatto extends Animale implements Vita, Serializable {

	private TypeGatto type;

	public Gatto(String nome, Sex sex, boolean fly, boolean herbalist, TypeGatto type) {
		super(nome, sex, fly, herbalist);
		this.type = type;
	}

	public TypeGatto getType() {
		return type;
	}

	public void setType(TypeGatto type) {
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
