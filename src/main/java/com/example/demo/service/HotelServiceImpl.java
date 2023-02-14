package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterLefttJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLefttJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterFulltJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterFulltJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelWhereJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelFetchJoin(tipoHabitacion);
	}

}
