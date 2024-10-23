package pe.edu.cibertec.ws_soap_patrick.service;

import pe.edu.cibertec.ws.objects.empleado.*;

public interface IEmpleadoService {
    GetEmpleadosResponse listarEmpleados();
    GetEmpleadoResponse obtenerEmpleadpxId(Integer id);
    PostEmpleadoResponse registrarEmpleado (PostEmpleadoRequest request);

}
