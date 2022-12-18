package app.edu.University.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.edu.University.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
