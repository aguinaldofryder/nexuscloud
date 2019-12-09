package br.com.nexuscloud.cadastro.resource.api;

import javax.ws.rs.Path;

import br.com.nexuscloud.cadastro.dto.ClienteDTO;

@Path("/cliente")
public interface ClienteResource extends AbstractCrudResouce<ClienteDTO> {

}
