package test;

import java.io.Serializable;

import enums.Sex;

public abstract class Animale implements Serializable{

	private String nome;
	private Sex sex;
	private boolean fly;
	private boolean herbalist;

	public Animale(String nome, Sex sex, boolean fly, boolean herbalist) {
		super();
		this.nome = nome;
		this.sex = sex;
		this.fly = fly;
		this.herbalist = herbalist;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public boolean isHerbalist() {
		return herbalist;
	}

	public void setHerbalist(boolean herbalist) {
		this.herbalist = herbalist;
	}

	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", sex=" + sex + ", fly=" + fly + ", herbalist=" + herbalist + "]";
	}

}
