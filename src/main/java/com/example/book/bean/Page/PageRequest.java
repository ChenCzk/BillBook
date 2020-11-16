package com.example.book.bean.Page;

import com.example.book.bean.BillRecord;

import java.util.Collections;
import java.util.List;
/**
 * 分页请求
 * */
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }    private List<BillRecord> rows = Collections.emptyList();//本次返回的数据列表
}
