package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findOneUserByUserNameAndPassword(String userName, String password);

	User findOneUserByUserName(String userName);

}
