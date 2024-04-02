package william.pez.passin.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import william.pez.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
