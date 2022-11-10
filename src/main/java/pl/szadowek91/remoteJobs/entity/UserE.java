package pl.szadowek91.remoteJobs.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Entity
public class UserE implements UserDetails {

    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    @GeneratedValue(generator = "id")
    private Long id;
    private String name;
    private String password;
    private Long phoneNumber;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userE")
    private List<AdvertE> advertE;

    @Setter(AccessLevel.NONE)
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "usersE")
    private List<UserEAddress> userEAddresses;

    public UserE() {
        userEAddresses = new ArrayList<>();
    }

    public void addAddress(UserEAddress userAddress) {
        userEAddresses.add(userAddress);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getUsername() {
        return name;
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
