package warriordiningback.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import warriordiningback.repository.InquiryRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class InquiryController {

	@Autowired
	private InquiryRepository iqr;
	
	@GetMapping("/inquriy")
	public Map<String, Object> inquiry() {
		Map<String, Object> map = new HashMap<>();
		map.put("data", iqr.findAll());
		return map;
	}
	
}
