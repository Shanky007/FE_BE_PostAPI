package com.sscode.service;

import org.springframework.stereotype.Service;

import com.sscode.entity.Form;
import com.sscode.repository.FormRepository;

@Service
public class FormService {
	
	FormRepository formRepository;
	
	public FormService(FormRepository formRepository) {
		this.formRepository = formRepository;
	}

	public Form saveForm(Form form) {
		return formRepository.save(form);
	}

}
