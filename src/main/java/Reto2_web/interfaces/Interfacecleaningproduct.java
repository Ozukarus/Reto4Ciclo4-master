
package Reto2_web.interfaces;

import Reto2_web.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fabio Ortiz
 */
public interface Interfacecleaningproduct extends MongoRepository<Supplements, String>{
    
}
