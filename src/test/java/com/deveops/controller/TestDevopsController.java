package com.deveops.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.MDC;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.Validator;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TestDevopsController {

	private DevopsController controller;

	private MockMvc mvc;

	@BeforeEach
	public void init() {

		final Validator mockValidator = Mockito.mock(Validator.class);
		controller = new DevopsController();
		mvc = MockMvcBuilders.standaloneSetup(controller).setValidator(mockValidator).build();
		MDC.put("svc_start_time", String.valueOf(System.currentTimeMillis()));
		MDC.put("svc_url", "http://");
	}

	@Test
	public void testCreateBuildingGroup() throws JsonProcessingException, Exception {
		mvc.perform(MockMvcRequestBuilders.get("/message").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}

}
