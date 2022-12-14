package com.api.parkingcontrol.controllers.swagger;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public interface ParkingSpotControllerSwagger {
    
    @Operation(summary =  "", description = "")
    @ApiResponse(responseCode = "201", description = "")
    @ApiResponse(responseCode = "400", description = "")
    ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto);

    @Operation(summary =  "", description = "")
    @ApiResponse(responseCode = "200", description = "")
    @ApiResponse(responseCode = "400", description = "")
    ResponseEntity<Page<ParkingSpotModel>> getAllParkingSpots(@PageableDefault Pageable pageable);

    @Operation(summary =  "", description = "")
    @ApiResponse(responseCode = "200", description = "")
    @ApiResponse(responseCode = "400", description = "")
    ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") UUID id);

    @Operation(summary =  "", description = "")
    @ApiResponse(responseCode = "201", description = "")
    @ApiResponse(responseCode = "400", description = "")
    ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") UUID id, @RequestBody @Valid ParkingSpotDto parkingSpotDto);
    
    @Operation(summary =  "", description = "")
    @ApiResponse(responseCode = "400", description = "")
    ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id);    
}