package com.scottrbrtsn.boiler.spring.plate.services.impl;

import com.scottrbrtsn.boiler.spring.plate.ras.ILogsRepository;
import com.scottrbrtsn.boiler.spring.plate.services.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements ILogService {

    @Autowired
    ILogsRepository logsRepository;

    @Override
    public String testMe(){
        return "passed";
    }

}