package resolver.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends MongoRepository<Xpath, String> {

     Xpath findByXpath(String xpath);
//     List<Xpath> findByLastName(String lastName);

}