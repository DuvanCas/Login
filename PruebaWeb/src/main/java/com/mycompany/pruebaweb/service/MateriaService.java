    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package com.mycompany.pruebaweb.service;

    import com.mycompany.pruebaweb.clase.Materia;
    import com.mycompany.pruebaweb.controller.MateriaController;
    import javax.ejb.Stateless;
    import javax.ws.rs.Consumes;
    import javax.ws.rs.DELETE;
    import javax.ws.rs.GET;
    import javax.ws.rs.POST;
    import javax.ws.rs.Path;
    import javax.ws.rs.PathParam;
    import javax.ws.rs.Produces;
    import javax.ws.rs.core.MediaType;
    import javax.ws.rs.core.Response;

    /**
     *
     * @author duvan
     */
    @Stateless
    @Path("materia")
    public class MateriaService {
     MateriaController mt = new MateriaController();

     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public Response retornMaterias(){

       return Response.ok(mt.getListaMateria()).build();
       }   
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     @Path("/{nombre}/{contra}") 
     public Response retornaMateriaEspecifica(@PathParam("nombre") String nombre,@PathParam("contra") String contra){
        return Response.ok(mt.getMateriaEsp(nombre, contra)).build();
     }   

    @GET
     @Produces(MediaType.APPLICATION_JSON)
     @Path("/{nombre}") 
     public Response cerrar(@PathParam("nombre") String nombre){
        return Response.ok(mt.getCerrar(nombre)).build();
     }   

     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     @Path("/{nombre}/{contra}") 
     public Response agregarMateria(@PathParam("nombre") String nombre,@PathParam("contra") String contra, Materia materia){
      {
         try{
         //   public Response retornaMateriaEspecifica(@PathParam("nombre") String nombre,@PathParam("contra") String contra){
            mt.anadirMateria(materia);
             return Response.ok(mt.getMateriaEsp(nombre,contra)).build();

         }catch (Exception ex){
             return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();

         }         
       }

     }
     @DELETE
     @Produces(MediaType.APPLICATION_JSON)
     @Path("/{nombre}/{contra}")
     public Response eliminar(@PathParam("nombre") String nombre,@PathParam("contra") String contra){
         mt.eliminar(nombre,contra);
        return Response.status(Response.Status.OK).build();
       }   


     }   



