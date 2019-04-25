    package com.mycompany.pruebaweb.controller;
    import com.mycompany.pruebaweb.clase.Materia;
    import com.mycompany.pruebaweb.clase.Mensaje;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.List;
    import java.util.logging.Level;
    import java.util.logging.Logger;

    /**
     *
     * @author duvan
     */
    public class MateriaController {
        private List<Materia> listaMateria;
        public MateriaController()
        {
            listaMateria = new ArrayList();
            listaMateria.add(new Materia("duvan","1234",1, "0"));
            listaMateria.add(new Materia("Steven","1234",2, "1"));
        }
        public List<Materia> getListaMateria() {
            return listaMateria;
        }

        public void setListaMateria(List<Materia> listaMateria) {
            this.listaMateria = listaMateria;
        }
        public Mensaje getMateriaEsp(String nombre,String contra){
            Mensaje obj = new Mensaje();
            int cont = 0;
            for (Materia materia : listaMateria) {
                if(materia.getNombre().equals(nombre)){
                if(materia.getNombre().equals(nombre) && materia.getContra().equals(contra)){
                    materia.setToken(generarToken() + FechaHora());
                    
                    String auxToken = materia.getToken();                
                    if(materia.getToken() == auxToken)
                    {                         
                        obj.setMensaje("Login exitoso");  
                        obj.setMensaje1(suma());
                        //FechaHora();
                    }
                }
                 else
                    {
                        obj.setMensaje("Usuario y/o contraseña incorrectos..");
                    }
                 return obj;
            }
            }
            cont ++;
            return null; 
        }
        public static String generarToken()
        {
            String numero = String.valueOf((int)(Math.random()* 1000) + 1);
            return numero;
        }

        public void anadirMateria(Materia materia) throws Exception {
           if(materia.getNombre() == "duvan" &&  materia.getContra()== "1234"){
           throw  new Exception("La materia no puede ser cero!!");
           }else{
            listaMateria.add(materia);
        }    
        }

        public void eliminar (String nombre ,String contra){
            for (Materia materia : listaMateria) {
                if(materia.getNombre()=="duvan" &&  materia.getContra()== "1234"){
                    listaMateria.remove(materia);
                    break;
                }
            }
        } 
        public String suma (){
            int a =2;
            int b = 5;
            int x =0;
            x =  a + b ;
            Mensaje obj = new Mensaje();
            obj.setMensaje("el resultado de 2 + 5 es: " + x);  
            return obj.getMensaje();
        }
public Date FechaHora() {

Date date = new Date();
DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
System.out.println("Hora y fecha: "+hourdateFormat.format(date));
return date;

}

public Mensaje getCerrar (String nombre ){
            Mensaje obj = new Mensaje();
            
            for (Materia materia : listaMateria) {
                if(materia.getNombre().equals(nombre)){ 
                if(materia.getNombre().equals(nombre)){
                    materia.setToken("0");    
                        obj.setMensaje("Cerrar sesion Exitosa");  
                 return obj;   
                }
              }
            }
            return null; 
        }

    }

