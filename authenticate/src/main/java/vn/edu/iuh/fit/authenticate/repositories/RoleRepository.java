package vn.edu.iuh.fit.authenticate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.authenticate.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}