package dev.anitya.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/***
 **
 * @Data is used for all Getter, Setters and toString methods
 * @Document is reffered to a column in RDBMMS
 * collection is used for specifying Table
 */
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;

    /***
     **
     *  DocumentReference states that the field won't have the whole review,
     *  instead it will have the list of ids of reviews and the whole reviews
     *  for these ids will be stored in a different table
     */
}
