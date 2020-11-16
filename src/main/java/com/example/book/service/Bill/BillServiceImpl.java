package com.example.book.service.Bill;

import com.example.book.bean.BillRecord;
import com.example.book.bean.Page.PageRequest;
import com.example.book.dao.BillDao;
import com.example.book.util.BookUtils;
import com.example.book.util.Page.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao = null;

    @Override
    public void addRecord(BillRecord billRecord) {
        String id = UUID.randomUUID().toString();
        String time = BookUtils.getCurrentDateAndTime();
        billRecord.setId(id);
        billRecord.setCreateTime(time);
        billRecord.setLastUpdateTime(time);

        billDao.addRecord(billRecord);
    }

    @Override
    public List<BillRecord> getAllRecord() {
        return billDao.getAllRecord();
    }

    @Override
    public int delRecordByIDs(String[] ids) {
        return billDao.delRecordByIDs(ids);
    }

    @Override
    public void updateBillRecordById(BillRecord billRecord) {
        String time = BookUtils.getCurrentDateAndTime();
        billRecord.setLastUpdateTime(time);
        billDao.updateBillRecordById(billRecord);
    }

    @Override
    public Object getAllRecordByPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<BillRecord> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);   // 分页核心代码,必须在调用mapper之前执行
        List<BillRecord> sysMenus = billDao.getAllRecord();
        return new PageInfo<BillRecord>(sysMenus);
    }
}
