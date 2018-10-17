package ch.hearc.ig.odi.personmovie.restresource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/api")
//The java class declares root resource and provider classes
public class Config extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet resources = new HashSet<Class<?>>();
        resources.add(PersonResources.class);
        resources.add(MovieResources.class);
        return resources;
    }

}