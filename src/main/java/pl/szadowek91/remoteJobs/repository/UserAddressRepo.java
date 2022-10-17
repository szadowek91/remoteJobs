package pl.szadowek91.remoteJobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szadowek91.remoteJobs.entity.UserEAddress;

@Repository
public interface UserAddressRepo extends JpaRepository<UserEAddress,Long> {
}
