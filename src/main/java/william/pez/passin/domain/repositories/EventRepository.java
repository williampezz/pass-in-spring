package william.pez.passin.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import william.pez.passin.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {
}
