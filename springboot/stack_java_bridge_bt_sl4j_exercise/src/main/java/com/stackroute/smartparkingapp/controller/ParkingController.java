package com.stackroute.smartparkingapp.controller;


import com.stackroute.smartparkingapp.dto.ParkingDto;
import com.stackroute.smartparkingapp.model.Parking;
import com.stackroute.smartparkingapp.repo.ParkingRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.stackroute.smartparkingapp.SmartParkingApplication.modelMapper;

/**
 * As in this assignment, we are working with demonstrating the  use of sl4j for logging in microservices
 * annotate the class with @RestController annotation,@CrossOrigin and @RequestMapping
 * Please note that the default path to use this controller should be "/api/v1"
 */


@CrossOrigin("*")
@RequestMapping("api/v1")
@RestController
public class ParkingController {


    private static Logger logger = LoggerFactory.getLogger(ParkingController.class);

    private ParkingRepo parkingRepo;
    private ModelMapper modelMapper;

    /**
     * Constructor autowiring should be implemented for the ParkingRepo, ModelMapper
     * without using the new keyword
     **/
    public ParkingController(ParkingRepo parkingRepo) {
        this.parkingRepo = parkingRepo;
        this.modelMapper = modelMapper();
    }

    /**
     * API Version: 1.0
     * Define a handler method which will add new parking details by reading the Serialized
     * ParkingDto object from request body and save the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task
     * 2. 400(Bad Request - In case the request is not readable
     * This handler method should map to the URL "/api/v1/parking" using HTTP POST
     * method".
     */
    @PostMapping("/parking")
    public ResponseEntity<ParkingDto> createDetails(@RequestBody ParkingDto parkingDto){
        if (parkingDto==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Parking parking= convertToEntity(parkingDto);
        parkingRepo.save(parking);
        logger.info("file saved");
        //convertToDto(parking);
        return ResponseEntity.status(HttpStatus.CREATED).body(convertToDto(parking));
    }



    /**
     * API Version: 1.0
     * Define a handler method which will update new parking details by reading the Serialized
     * ParkingDto object from request body and update the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task
     * 2. 400(Bad Request - In case the request is not readable
     * This handler method should map to the URL "/api/v1/parking" using HTTP PUT
     * method".
     */
    @PutMapping("/parking")
    public ResponseEntity<ParkingDto> update(@RequestBody ParkingDto parkingDto){
        if (parkingDto==null){
            logger.info("object doesnot exist");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        logger.info("Succesfully updated");
        Parking parking=convertToEntity(parkingDto);
        parkingRepo.save(parking);
        return ResponseEntity.status(HttpStatus.CREATED).body(convertToDto(parking));
    }

    /**
     * API Version: 1.0
     * Define a handler method which will retrieve all parking details
     * The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 200(OK) - If the tasks found successfully
     * This handler method should map to the URL "/api/v1/parkings" using HTTP POST
     * method".
     */

    @GetMapping("/parkings")
    public ResponseEntity<List<ParkingDto>> getAll(){

        List <ParkingDto> lst=parkingRepo.findAll().stream().map(this::convertToDto).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(lst);
    }


    /**
     * API Version: 1.0
     * Define a handler method which will Delete a parking by reading the Serialized
     * TaskDto object from request body ;
     * This handler method should return any one of the status messages basis on
     * different situations:
     * 1.200(OK) - If the parking deleted successfully.
     * 2.400(BAD REQUEST) - If the request is not readable.
     * This handler method should map to the URL "/api/v1/task" using HTTP DELETE
     * method".
     */

    @DeleteMapping("/parking")
    public ResponseEntity<ParkingDto> delete(@RequestBody ParkingDto parkingDto){
        if (parkingDto==null){
            logger.warn("Given object is null");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        logger.info("Deleted the record"+parkingDto);
        Parking item=convertToEntity(parkingDto);
        parkingRepo.delete(item);

        return ResponseEntity.status(HttpStatus.OK).body(convertToDto(item));
    }


    /**
     * Define the private methods as required
     **/

    private ParkingDto convertToDto(Parking parking){
        return modelMapper.map(parking,ParkingDto.class);
    }
    private Parking convertToEntity(ParkingDto parkingDto){
        return modelMapper.map(parkingDto, Parking.class);
    }


}
