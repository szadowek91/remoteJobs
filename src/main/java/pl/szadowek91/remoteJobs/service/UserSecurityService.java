package pl.szadowek91.remoteJobs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.szadowek91.remoteJobs.entity.UserE;
import pl.szadowek91.remoteJobs.repository.UserRepo;

/**
 * @author PG
 */
@Service
@RequiredArgsConstructor
public class UserSecurityService implements UserDetailsService {

    private final UserRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserE user = userRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
