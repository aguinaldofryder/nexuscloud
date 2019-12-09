package br.com.nexuscloud.cadastro.resource.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.nexuscloud.cadastro.dto.UsuarioCreateDTO;
import br.com.nexuscloud.cadastro.dto.UsuarioDTO;

@Path("usuario")
public interface UsuarioResource extends AbstractCrudResouce<UsuarioDTO> {

    /**
     * Salva um novo registro
     * 
     * @param entity
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response save(UsuarioCreateDTO entity);
}
