package pl.szadowek91.remoteJobs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szadowek91.remoteJobs.config.CryptoConfig;
import pl.szadowek91.remoteJobs.entity.UserE;
import pl.szadowek91.remoteJobs.repository.UserRepo;

/**
 * @author PG
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;
    private final CryptoConfig cryptoConfig;

    public void createNewUser(UserE userE) {
        userE.setPassword(cryptoConfig.passwordEncoder().encode(userE.getPassword()));
        userRepo.save(userE);
    }

}
