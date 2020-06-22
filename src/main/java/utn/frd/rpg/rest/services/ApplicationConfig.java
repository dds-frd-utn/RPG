/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.rpg.rest.services;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.Path;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utn.frd.rpg.entity.Clientes;
import utn.frd.rpg.sessions.ClientesFacade;


@ApplicationPath("rest")
public class ApplicationConfig extends Application{


@Path("/cliente")
public class ClientesRest {
    public class ClienteRest {
    @EJB
    private ClientesFacade ejbClientesFacade;
     @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Clientes> findAll(){
        return ejbClientesFacade.findAll();

    }
 @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Clientes cliente){
        ejbClientesFacade.create(cliente);
    }
@PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Clientes cliente){
        ejbClientesFacade.edit(cliente);
    
    }
@DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejbClientesFacade.remove( ejbClientesFacade.find(id) );
    }
@GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Clientes findById(@PathParam("id")long id){
        return ejbClientesFacade.find(id);
    }
}
}
}
