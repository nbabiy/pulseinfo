package com.nbabiy.infopulse;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ContactControllerIT extends AbstractInfoPulseControllerIT {

    @Test
    public void whenReadContacts_thenReturn200() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/contacts"))
                .andDo(print())
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.[0].firstName").value("Ivan"))
                .andExpect(jsonPath("$.[0].lastName").value("Melnyk"))
                .andExpect(jsonPath("$.[0].cars.[0].brand").value("BMW"))
                .andExpect(jsonPath("$.[0].cars.[0].model").value("M4"))

                .andExpect(jsonPath("$.[1].firstName").value("Nazarii"))
                .andExpect(jsonPath("$.[1].lastName").value("Babii"))
                .andExpect(jsonPath("$.[1].cars.[0].brand").value("BMW"))
                .andExpect(jsonPath("$.[1].cars.[0].model").value("M5"))
                .andExpect(jsonPath("$.[1].cars.[1].brand").value("Lexus"))
                .andExpect(jsonPath("$.[1].cars.[1].model").value("LX500"))

                .andExpect(jsonPath("$.[2].firstName").value("Mike"))
                .andExpect(jsonPath("$.[2].lastName").value("Chikhuta"))
                .andExpect(jsonPath("$.[2].cars.[0].brand").value("Volvo"))
                .andExpect(jsonPath("$.[2].cars.[0].model").value("VC60"))
                .andExpect(jsonPath("$.[2].cars.[1].brand").value("Mercedes"))
                .andExpect(jsonPath("$.[2].cars.[1].model").value("GTR63 AMG"));
    }
}
