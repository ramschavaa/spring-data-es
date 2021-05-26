package com.test.elasticsearch.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.elasticsearch.demo.service.UpdateService;

@RestController
@RequestMapping("/demo")
public class TestUpdateController {

	@Autowired
	private UpdateService updateService;

	@GetMapping("/update")
	public String update() {
		updateService.testUpdateQuery();
		return "success";
	}

}
