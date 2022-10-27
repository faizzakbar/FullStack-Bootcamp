package com.lawencon.ticket.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.model.Seat;
import com.lawencon.ticket.model.Vehicle;
import com.lawencon.ticket.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {

	@Override
	public List<Vehicle> getVehicles() {

		final List<Vehicle> vehicle = new ArrayList<>();
		final List<Seat> bus = new ArrayList<>();

		Seat seat1 = new Seat();
		seat1.setSeat("Kursi 1");

		Seat seat2 = new Seat();
		seat2.setSeat("Kursi 2");

		Seat seat3 = new Seat();
		seat3.setSeat("Kursi 3");

		Seat seat4 = new Seat();
		seat4.setSeat("Kursi 4");

		Seat seat5 = new Seat();
		seat5.setSeat("Kursi 5");

		bus.add(seat1);
		bus.add(seat2);
		bus.add(seat3);
		bus.add(seat4);
		bus.add(seat5);

		final Vehicle vehicleBus = new Vehicle();
		vehicleBus.setType("Bus");
		vehicleBus.setList(bus);
		vehicleBus.setPrice(2_00_000);

		final List<Seat> train = new ArrayList<>();

		Seat djaya1 = new Seat();
		djaya1.setSeat("Kursi 1");

		Seat djaya2 = new Seat();
		djaya2.setSeat("Kursi 2");

		Seat djaya3 = new Seat();
		djaya3.setSeat("Kursi 3");

		Seat djaya4 = new Seat();
		djaya4.setSeat("Kursi 4");

		Seat djaya5 = new Seat();
		djaya5.setSeat("Kursi 5");

		train.add(djaya1);
		train.add(djaya2);
		train.add(djaya3);
		train.add(djaya4);
		train.add(djaya5);

		Vehicle vehicleTrain = new Vehicle();
		vehicleTrain.setType("Kereta");
		vehicleTrain.setList(train);
		vehicleTrain.setPrice(3_00_000);

		final List<Seat> plane = new ArrayList<>();

		Seat plane1 = new Seat();
		plane1.setSeat("Kursi 1");

		Seat plane2 = new Seat();
		plane2.setSeat("Kursi 2");

		Seat plane3 = new Seat();
		plane3.setSeat("Kursi 3");

		Seat plane4 = new Seat();
		plane4.setSeat("Kursi 4");

		Seat plane5 = new Seat();
		plane5.setSeat("Kursi 5");

		plane.add(plane1);
		plane.add(plane2);
		plane.add(plane3);
		plane.add(plane4);
		plane.add(plane5);

		final Vehicle vehiclePlane = new Vehicle();
		vehiclePlane.setType("Pesawat");
		vehiclePlane.setList(plane);
		vehiclePlane.setPrice(4_00_000);

		vehicle.add(vehicleBus);
		vehicle.add(vehiclePlane);
		vehicle.add(vehicleTrain);

		return vehicle;
	}

	@Override
	public List<Schedule> getSchedule() {
		final List<Schedule> departTime = new ArrayList<>();

		Schedule time1 = new Schedule();
		time1.setDate("22-09-2022 09:00");

		Schedule time2 = new Schedule();
		time2.setDate("23-09-2022 09:00");

		Schedule time3 = new Schedule();
		time3.setDate("24-09-2022 09:00");

		Schedule time4 = new Schedule();
		time4.setDate("25-09-2022 09:00");

		Schedule time5 = new Schedule();
		time5.setDate("26-09-2022 09:00");

		departTime.add(time1);
		departTime.add(time2);
		departTime.add(time3);
		departTime.add(time4);
		departTime.add(time5);

		return departTime;
	}
}
