package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelRepo {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterLefttJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelOuterFulltJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelWhereJoin(String tipoHabitacion);

	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);

}
