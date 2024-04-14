package codoacodo.flights.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;
 import codoacodo.flights.model.Flight;
import java.util.List;


 @Repository

 public interface FlightRepository extends JpaRepository<Flight,Long> {
  
 List<Flight> findByOrigin(String origin);
 //List<Flight> findByDestiny(String destiny);
    
 }
