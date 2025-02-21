package myDairy.Application.mydairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myDairy.Application.mydairy.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
