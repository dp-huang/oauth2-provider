package com.oauth2.dao;

import com.oauth2.model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangd7
 */
public interface CredentialsRepository extends JpaRepository<Credentials, Long> {
    Credentials findByName(String name);
}
