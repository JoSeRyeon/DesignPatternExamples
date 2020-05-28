package com.example.designpattern.abstractfactory;

public class SamsungElevatorFactory extends ElevatorFactory {

	@Override
	Motor createMotor() {
		return new SamsungMotor();
	}

	@Override
	Door createDoor() {
		return new SamsungDoor();
	}
}
