package com.abhinay;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        MyService service = new MyService(mockAPI);
        service.fetchData();

        verify(mockAPI).getData();
    }
}