package com.scottrbrtsn.spring.boiler.plate.controllers;

import com.scottrbrtsn.spring.boiler.plate.domain.Logs;
import com.scottrbrtsn.spring.boiler.plate.ras.ILogsRepository;
import com.scottrbrtsn.spring.boiler.plate.services.ILogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/logs")
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private ILogService logService;

    @Autowired
    private ILogsRepository logsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Logs>> getAtos() {
        LOGGER.debug("getATOs");
        return new ResponseEntity<>(logsRepository.findAll(), new HttpHeaders(), HttpStatus.OK);
    }
}