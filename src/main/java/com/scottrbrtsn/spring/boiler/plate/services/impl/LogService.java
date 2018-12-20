package com.scottrbrtsn.spring.boiler.plate.services.impl;

import com.scottrbrtsn.spring.boiler.plate.ras.ILogsRepository;
import com.scottrbrtsn.spring.boiler.plate.services.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements ILogService {

    @Autowired
    ILogsRepository logsRepository;

}


