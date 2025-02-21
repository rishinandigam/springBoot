package myDairy.Application.mydairy.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myDairy.Application.mydairy.entity.User;
import myDairy.Application.mydairy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public User addUser(User user)
	{
		 return userRepository.save(user);
	}
	
	
	public User updateUser(User user)
	{
			return userRepository.save(user);
	}
	
	
	
	
	
	public Optional<User> deleteUser(Integer id) {
		return userRepository.findById(id);
	}
	
	
	public User getUser(Integer id )
	{
		return userRepository.findById(id).get();
	}
	public ArrayList<User> findAll()
	{
		 return (ArrayList<User>) userRepository.findAll();
	}
}
