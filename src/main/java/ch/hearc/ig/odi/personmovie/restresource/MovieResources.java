package ch.hearc.ig.odi.personmovie.restresource;

import ch.hearc.ig.odi.personmovie.business.Movie;
import ch.hearc.ig.odi.personmovie.service.PersistanceService;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestScoped
@Path("/movies")
public class MovieResources {

    @Inject
    PersistanceService persistanceService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getAllMovies() {
        return this.persistanceService.getAllMovies();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMovieById(@PathParam("id") Long id) {
        return persistanceService.getMovieById(id);
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public void addMovie(@FormParam("movieId") Long id, @FormParam("movieName") String name, @FormParam("movieProducer") String producer) {
        this.persistanceService.addMovie(id, name, producer);
    }

    @DELETE
    @Path("/{id}")
    public void deleteMovieById(@PathParam("id") Long id) {
        this.persistanceService.deleteMovieById(id);
    }



}
