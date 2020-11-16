package com.example.book.typeHandler;

import com.example.book.util.BillUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecordTypeHandler implements TypeHandler<String> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        return tranfer(resultSet.getString(s));
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        return  tranfer(resultSet.getString(i));
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        return  tranfer(callableStatement.getString(i));
    }

    public String tranfer(String in) {
        String out = null;
        if (in != null) {
            if (BillUtils.isContains(in)){
                out = BillUtils.get(in);
            }
        }
        return out;
    }
}
