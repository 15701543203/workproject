package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.OperatorLog;
import com.TaiKang.permission.system.dao.OperatorLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorLogServiceImpl implements OperatorLogService {

    @Autowired
    private OperatorLogMapper operatorLogMapper;

    @Override
    public boolean addOperatorLog(OperatorLog operatorLog) {
        int i = operatorLogMapper.insertOperatorLog(operatorLog);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
