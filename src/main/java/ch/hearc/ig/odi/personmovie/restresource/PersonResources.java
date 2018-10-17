package ch.hearc.ig.odi.personmovie.restresource;

import ch.hearc.ig.odi.personmovie.business.Person;
import ch.hearc.ig.odi.personmovie.service.PersistanceService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestScoped
@Path("/people")
public class PersonResources {

    @Inject
    private PersistanceService persistanceService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPeople() {
        return this.persistanceService.getAllPeople();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonById(@PathParam("id") Long id) {
        return this.persistanceService.getPersonById(id);
    }


    @DELETE
    @Path("/{id}")
    public void deletePersonById(@PathParam("id") Long id) {
        this.persistanceService.deletePersonById(id);
    }

}
