package com.animalshelter.data;

public class AnimalShelter_Dog extends AnimalShelter_Data {

public String animalType;
public String animalName;
public int animalAge;
public String animalGender;
public String animalSound;
public static String animalSerialNumberCapsule;

/*@Override
public String animalType(String type) {
	return type = "DOG";	*/


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
