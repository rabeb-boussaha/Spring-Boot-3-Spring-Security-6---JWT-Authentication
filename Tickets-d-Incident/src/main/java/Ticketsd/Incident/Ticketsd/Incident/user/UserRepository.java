package Ticketsd.Incident.Ticketsd.Incident.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //create a methode to fetch  user  c-a-d  find user by mail (because mail is unique)

    Optional<User> findByEmail(String email);
}
