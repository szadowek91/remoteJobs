package pl.szadowek91.remoteJobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szadowek91.remoteJobs.entity.AdvertE;

@Repository
public interface AdvertRepo extends JpaRepository<AdvertE,Long> {
}
