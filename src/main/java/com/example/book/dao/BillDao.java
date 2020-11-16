package com.example.book.dao;

import com.example.book.bean.BillRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface BillDao {
    void addRecord(BillRecord billRecord);
    List<BillRecord> getAllRecord();
    int delRecordByIDs( String[] ids);
    void updateBillRecordById(BillRecord billRecord);

}
