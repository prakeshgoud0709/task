package com.ty.springboottask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@GetMapping("/test")
	public String test() {
		return "Done Test";
	}
	
	@GetMapping("/disp")
	public String disp() {
		return "Holi Holyday";
	}
	
	@GetMapping("/task")
	public String task() {
		return "done by Task";
	}
}
