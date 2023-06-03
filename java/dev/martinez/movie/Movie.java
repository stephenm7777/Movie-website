package dev.martinez.movie;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
    private List<String> backdrop; 
    @DocumentReference
    private List<String> reviewIds; 

}
