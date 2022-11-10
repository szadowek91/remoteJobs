package pl.szadowek91.remoteJobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szadowek91.remoteJobs.entity.UserE;

@Repository
public interface UserRepo extends JpaRepository<UserE,Long> {


    UserE findByName(String name);
}
