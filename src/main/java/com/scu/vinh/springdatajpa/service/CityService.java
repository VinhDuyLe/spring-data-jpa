package com.scu.vinh.springdatajpa.service;

import com.scu.vinh.springdatajpa.dto.requestDto.CityRequestDto;
import com.scu.vinh.springdatajpa.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    public City addCity(CityRequestDto cityRequestDto);
    public List<City> getCities();
    public City getCity(Long cityId);
    public City deleteCity(Long cityId);
    public City editCity(Long cityId, CityRequestDto cityRequestDto);
}
