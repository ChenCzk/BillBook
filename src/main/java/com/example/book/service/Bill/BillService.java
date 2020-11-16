package com.example.book.service.Bill;

import com.example.book.bean.BillRecord;
import com.example.book.bean.Page.PageRequest;

import java.util.List;

public interface BillService {
    void addRecord(BillRecord billRecord);
    List<BillRecord> getAllRecord();
    int delRecordByIDs(String[] ids);
    void updateBillRecordById(BillRecord billRecord);

    Object getAllRecordByPage(PageRequest pageRequest);
}
