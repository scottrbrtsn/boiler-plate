package com.scottrbrtsn.boiler.spring.plate.controllers;

import com.scottrbrtsn.boiler.spring.plate.domain.Logs;
import com.scottrbrtsn.boiler.spring.plate.ras.ILogsRepository;
import com.scottrbrtsn.boiler.spring.plate.services.ILogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping(value = "/")
    public ResponseEntity<List<Logs>> getAtos() {
        LOGGER.debug("getATOs");
        return new ResponseEntity<>(logsRepository.findAll(), new HttpHeaders(), HttpStatus.OK);
    }
}