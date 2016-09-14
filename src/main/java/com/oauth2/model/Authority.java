package com.oauth2.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @author huangd7
 */
@Entity
@Table(name = "t_authority")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
