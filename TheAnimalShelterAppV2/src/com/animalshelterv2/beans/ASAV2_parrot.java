package com.animalshelterv2.beans;

public class ASAV2_parrot extends ASAV2_data {
	
	public String animalType;
	public String animalName;
	public int animalAge;
	public String animalGender;
	public String animalSound;
	public static String animalSerialNumberCapsule;


	@Override
	public String animalName(String name) {
		return name;
	}

	@Override
	public int animalAge(int age) {
		return age;
	}

	@Override
	public String animalGender(String gender) {
		return gender;
	}

}
