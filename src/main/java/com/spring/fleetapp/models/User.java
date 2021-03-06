package com.spring.fleetapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.stream.Collectors;

@Entity
@Data
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;

    @NotNull
    @NotEmpty(message = "please enter your first name")
    private String firstname;
    @NotNull
    private String lastname;

    @NotNull
    @NotEmpty(message = "please enter username")
	private String username;
    @NotNull
	private String password;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role){
        roles.add(role);

    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<SimpleGrantedAuthority> authorties = new ArrayList<>();
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

        // return Collections.singleton(new SimpleGrantedAuthority("ADMIN"));
    }

    @Override
    public String getPassword() {
        return  password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
