package services;

import com.scottrbrtsn.boiler.spring.plate.ras.ILogsRepository;
import com.scottrbrtsn.boiler.spring.plate.services.impl.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestLogService {

    @Mock
    ILogsRepository logsRepository;

    @InjectMocks
    LogService logService;

    @Test
    public void testReadFile() {
        String test = logService.testMe();
        assertEquals("passed", test);
    }

}
