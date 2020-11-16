package com.example.book.controller;

import com.example.book.bean.BillRecord;
import com.example.book.bean.Page.PageRequest;
import com.example.book.interfacer.UserLoginToken;
import com.example.book.service.Bill.BillService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

//@CrossOrigin(origins = {"http://localhost:8080", "http://xxxx:8080"})
 @CrossOrigin(value = "http://localhost:8083",maxAge = 1800 ,allowedHeaders = "*")
@UserLoginToken
public class BillController extends AbstractController {
    @Autowired
    private BillService billService = null;

    /**
     * 主页
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "page/index.html";
    }


    @RequestMapping("test")
    public String test() {
        return "page/test.html";
    }


    /**
     *
     * 添加记账记录
     * @param billRecord
     * @return
     */
    @RequestMapping(value = "addRecord",method = RequestMethod.POST)
    @ResponseBody
    public String addRecord(@RequestBody BillRecord billRecord) {
        try {
            billService.addRecord(billRecord);
            return showSuccessMessage("success");
        } catch (Exception e) {
            return showErrorMessage("error");
        }
    }



    /**
     * 获取所有记账记录
     * @return
     */
    @RequestMapping(value = "getAllRecord",method = RequestMethod.GET)
    @ResponseBody
    public String getAllRecord(){
        List<BillRecord> records = billService.getAllRecord();
        return toJSON(records);
    }



    /**
     * 获取所有记账记录-分页
     * @return
     */
    @UserLoginToken
    @RequestMapping(value = "getAllRecordByPage",method = RequestMethod.POST)
    @ResponseBody
    public Object  getAllRecordByPage(@RequestBody  PageRequest pageRequest ){
        return billService.getAllRecordByPage(pageRequest);
    }



    /**
     * 批量删除记账记录
     * @return
     */
    @RequestMapping("delRecordByIDs")
    @ResponseBody
    public String delRecordByIDs(@RequestParam("ids") String[] ids){
        System.out.println(ids);
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        int i  = billService.delRecordByIDs(ids);
        return toJSON(i);
    }



    /**
     * 更新记账记录
     * @return
     */
    @RequestMapping("updateBillRecordById")
    @ResponseBody
    public String updateBillRecordById(@RequestBody BillRecord billRecord){
        billService.updateBillRecordById(billRecord);

        return toJSON("success");
    }

























}
