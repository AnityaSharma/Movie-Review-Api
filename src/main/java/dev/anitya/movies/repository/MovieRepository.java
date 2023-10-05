package dev.anitya.movies.repository;

import dev.anitya.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *  Even though it is Interface but when it is instantiated in the Service Layer using
 *  @Autowired we will get the object which has and all the method implementations
 *  also provide for Crud Operations by Spring Data MongoDB.
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
