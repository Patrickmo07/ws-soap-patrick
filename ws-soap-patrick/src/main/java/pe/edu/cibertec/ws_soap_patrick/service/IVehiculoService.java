package pe.edu.cibertec.ws_soap_patrick.service;

import pe.edu.cibertec.ws.objects.vehiculos.GetVehiculoResponse;
import pe.edu.cibertec.ws.objects.vehiculos.GetVehiculosResponse;
import pe.edu.cibertec.ws.objects.vehiculos.PostVehiculoRequest;
import pe.edu.cibertec.ws.objects.vehiculos.PostVehiculoResponse;

public interface IVehiculoService {
    GetVehiculosResponse listarVehiculos();
    GetVehiculoResponse obtenerVehiculoxId(Integer id);
    PostVehiculoResponse registrarVehiculo(PostVehiculoRequest request);

}
