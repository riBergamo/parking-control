package com.api.parkingcontrol.service;

import com.api.parkingcontrol.model.ParkingSpot;
import com.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//para melhorar: criar interface para o service para esta classe implementar ela pq se caso precisar trocar a implementação nao vai precisar fazer refatoração grande no controller
@Service
public class ParkingSpotService {

    //final:
    final ParkingSpotRepository parkingSpotRepository; //controller assiona service, service assiona repository

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {//criar injeção de dependencias: @autowared ou (melhor) criar construtor
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpot save(ParkingSpot parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpot> findAll() {
        return parkingSpotRepository.findAll();
    }
}
