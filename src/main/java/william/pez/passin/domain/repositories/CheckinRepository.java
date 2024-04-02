package william.pez.passin.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import william.pez.passin.domain.checkin.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
}
