package com.poyuyang.visualyser.controller;

import com.poyuyang.visualyser.entity.Record;
import com.poyuyang.visualyser.exception.ResourceNotFoundException;
import com.poyuyang.visualyser.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RecordController {

    @Autowired
    RecordRepository recordRepository;

    // Get all records
    @GetMapping("/records")
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    // Create a new record
    @PostMapping("/records")
    public Record createRecord(@Valid @RequestBody Record record) {
        return recordRepository.save(record);
    }

    // Get a single record
    @GetMapping("/records/{passengerid}")
    public Record getRecordById(@PathVariable(value = "passengerid") String passengerid) {

        return recordRepository.findById(passengerid)
                .orElseThrow(() -> new ResourceNotFoundException("Record", "passengerid", passengerid));
    }

    // Update a record
    @PutMapping("/records/{passengerid}")
    public Record updateRecord(@PathVariable(value = "passengerid") String passengerid, @Valid @RequestBody Record recordDetails) {
        Record record = recordRepository.findById(passengerid).orElseThrow(() -> new ResourceNotFoundException("Record", "passengerid", passengerid));

        record.setSurvived(recordDetails.getSurvived());
        record.setPclass(recordDetails.getPclass());
        record.setName(recordDetails.getName());
        record.setSex(recordDetails.getSex());
        record.setAge(recordDetails.getAge());
        record.setSibsp(recordDetails.getSibsp());
        record.setParch(recordDetails.getParch());
        record.setTicket(recordDetails.getTicket());
        record.setFare(recordDetails.getFare());
        record.setCabin(recordDetails.getCabin());
        record.setEmbarked(recordDetails.getEmbarked());

        Record updatedRecord = recordRepository.save(record);

        return updatedRecord;
    }

    // Delete a record
    @DeleteMapping("/records/{passengerid}")
    public ResponseEntity<?> deleteRecord(@PathVariable(value = "passengerid") String passengerid) {
        Record record = recordRepository.findById(passengerid)
                .orElseThrow(() -> new ResourceNotFoundException("Record", "passengerid", passengerid));

        recordRepository.delete(record);

        return ResponseEntity.ok().build();
    }

}
