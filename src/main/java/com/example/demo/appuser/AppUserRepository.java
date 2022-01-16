package com.example.demo.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
//@Transactional(readOnly = true)
@Transactional()
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
