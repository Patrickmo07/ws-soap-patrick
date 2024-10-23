package pe.edu.cibertec.ws_soap_patrick.service;

import pe.edu.cibertec.ws.objects.cliente.GetClienteResponse;
import pe.edu.cibertec.ws.objects.cliente.GetClientesResponse;
import pe.edu.cibertec.ws.objects.cliente.PostClienteRequest;
import pe.edu.cibertec.ws.objects.cliente.PostClienteResponse;

public interface IClienteService {
    GetClientesResponse listarClientes();
    GetClienteResponse obtenerClientexId(Integer id);
    PostClienteResponse registrarCliente(PostClienteRequest request);
}
