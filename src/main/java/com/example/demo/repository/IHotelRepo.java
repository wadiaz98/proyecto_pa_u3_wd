package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelRepo {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);

}
