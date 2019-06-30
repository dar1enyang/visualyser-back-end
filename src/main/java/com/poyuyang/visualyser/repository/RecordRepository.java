package com.poyuyang.visualyser.repository;

import com.poyuyang.visualyser.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, String> {
    public Record findRecordByPassengerid(String passengerid) ;
    public List<Record> findRecordsBySurvived(String survived);
    public List<Record> findRecordsBySurvivedAndPclass(String survived, String pclass);

}
