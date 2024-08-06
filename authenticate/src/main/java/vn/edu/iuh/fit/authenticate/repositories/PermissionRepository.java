package vn.edu.iuh.fit.authenticate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.authenticate.models.Permission;

public interface PermissionRepository extends JpaRepository<Permission, String> {

}