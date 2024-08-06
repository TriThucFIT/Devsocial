package vn.edu.iuh.fit.authenticate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.authenticate.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}