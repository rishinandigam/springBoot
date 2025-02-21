package myDairy.Application.mydairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import myDairy.Application.mydairy.entity.Entry;
import myDairy.Application.mydairy.entity.User;
import myDairy.Application.mydairy.service.EntryService;
import myDairy.Application.mydairy.service.UserService;
@RestController
public class UserEntityController {
	
	@Autowired
	UserService userService;
	EntryService entryService;
	
	
	@PostMapping("/addUser/")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	
	@PostMapping("/addEntry/ ")
	public Entry addEntry(@RequestBody Entry entry)
	
	{
		return entryService.addEntry(entry);
	}
	
	@GetMapping("/getuser/{id}")
	public User getUserById(@RequestParam Integer id )
	{
		User user = userService.getUser(id);
		return user;
	}
	
	
}


