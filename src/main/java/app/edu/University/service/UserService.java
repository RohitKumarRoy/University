package app.edu.University.service;

import java.util.List;

import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.edu.University.entity.User;
import app.edu.University.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUserList(){
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		
		try {
			return userRepository.save(user);
		} catch(PropertyValueException e) {
			return null;
		}
		
	}

}
