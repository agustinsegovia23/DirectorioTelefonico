package tp7;


import java.util.*;

public class Directorio {
    
    TreeMap<Long, Cliente> clientes  = new TreeMap<>();

      
    public void agregarCliente(long tel, Cliente cli) {
        
        clientes.put(tel, cli);      
    }

    public Cliente buscarCliente(long telefono) {
       if(clientes.containsKey(telefono)){
           return clientes.get(telefono);
       }else{
           return null;
       }
    }
    
    public Set<Long> buscarTelefonos (String apellido){
        HashSet<Long> telefonos  = new HashSet<>();
        for(Map.Entry<Long, Cliente> cli : clientes.entrySet()){
            long clave = cli.getKey();
            String apellidos = cli.getValue().getApellido();
            if(apellidos.equals(apellido)){
                telefonos.add(clave);
            }
        }
        return telefonos;
    }
    
    public List<Cliente> buscarClientes (String ciudad){
        List<Cliente> cli  = new ArrayList<>();
        for(Map.Entry<Long, Cliente> c: clientes.entrySet()){
            String valorCiudad = c.getValue().getCiudad();
            Long valor = c.getKey();
            if(valorCiudad.equals(ciudad)){
                cli.add(clientes.get(valor));
            }
        }
      return cli;  
    }
    
    public void borrarClientes(long dni){
        
        for(Map.Entry<Long,Cliente> cli: clientes.entrySet()){
            Long doc = cli.getValue().getDni();
            Long valor = cli.getKey();
            if(doc.equals(dni)){
                clientes.clear();
            }
        }
    
    
    }
}
