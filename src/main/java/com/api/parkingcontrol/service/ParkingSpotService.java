package com.api.parkingcontrol.service;

import com.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

//para melhorar: criar interface para o service para esta classe implementar ela pq se caso precisar trocar a implementação nao vai precisar fazer refatoração grande no controller
@Service
public class ParkingSpotService {

    //final:
    final ParkingSpotRepository parkingSpotRepository; //controller assiona service, service assiona repository

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {//criar injeção de dependencias: @autowared ou (melhor) criar construtor
        this.parkingSpotRepository = parkingSpotRepository;
    }


}
