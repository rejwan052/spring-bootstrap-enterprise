package org.andidev.applicationname.repository;

import org.andidev.applicationname.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByIdNotAndUsername(Long id, String username);
}
