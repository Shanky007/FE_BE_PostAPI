package com.sscode.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sscode.dto.FormDTO;
import com.sscode.entity.Form;
import com.sscode.service.FormService;

@Controller
public class FormController {
	
	FormService formService;
	
	public FormController(FormService formService) {
		this.formService = formService;
	}

	@GetMapping(value = "/")
	public String formView() {
		return "form.html";
	}
	
	@PostMapping(value = "/submit", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Form formSubmit(@RequestBody Map<String, String> payload) {
		
		Form createForm = new Form();
		for(Map.Entry<String, String> entry: payload.entrySet()) {
			if(entry.getKey()=="name") {
				createForm.setName(entry.getValue());
			}
			if(entry.getKey()=="job") {
				createForm.setJob(entry.getValue());
			}
		}
			
		return formService.saveForm(createForm);
	}
}
