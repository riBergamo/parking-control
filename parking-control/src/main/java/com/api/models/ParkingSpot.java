package com.api.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "PARKING_SPOT")
public class ParkingSpot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)//nao pode ser nulo, é unico(ex: duas pessoas n podem ter o msm), ...
    private String parkingSpotNumber;//numero da vaga, podem ser num e/ou letras

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;//placa do carro

    @Column(nullable = false, length = 70)
    private String brandCar;//marca

    @Column(nullable = false, length = 70)
    private String modelCar;//modelo

    @Column(nullable = false, length = 70)
    private String colorCar;//cor

    @Column(nullable = false)
    private LocalDateTime registrationDate;//dia do registro da vaga

    @Column(nullable = false, length = 130)
    private String responsibleName;//nome do responsavel do veiculo ou apartamento

    @Column(nullable = false, length = 30)
    private String apartment;//num e/ou letra do apartamento

    @Column(nullable = false, length = 30)
    private String block;//bloco do ap

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
