package com.project.bootcamp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.project.bootcamp.model.dto.StockDTO;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/stock")

public class StockController {
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto){
        return  ResponseEntity.ok(dto);
    }
    
    @GetMapping
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("name1");
        dto.setPrice(1.5);
        dto.setVariation(1.78);
        dto.setDate(LocalDate.now());
        list.add(dto);

        return ResponseEntity.ok(list); 
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findByID(@PathVariable Long id){
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("name1");
        dto.setPrice(1.5);
        dto.setVariation(1.78);
        dto.setDate(LocalDate.now());
        list.add(dto);

        return ResponseEntity.ok(dto); 
    }
}