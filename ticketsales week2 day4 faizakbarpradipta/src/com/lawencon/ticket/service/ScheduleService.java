package com.lawencon.ticket.service;

import java.util.List;

import com.lawencon.ticket.model.Schedule;
import com.lawencon.ticket.model.Vehicle;

public interface ScheduleService {

	List<Vehicle> getVehicles();

	List<Schedule> getSchedule();

}
