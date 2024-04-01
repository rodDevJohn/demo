package com.example.demo.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApplicantRequestDTO;
import com.example.demo.dto.ApplicationRequestDTO;
import com.example.demo.procedureModel.Parametro;


@RestController
@RequestMapping("/all")
public class controller {
	

	
	@GetMapping("/this")
	public String hacerGet() {

		System.out.println("aquí");

		return "funciona";
	}
	

	@PostMapping(path = "/post",         
			consumes = MediaType.APPLICATION_JSON_VALUE,         
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String methodPost(@RequestBody ApplicationRequestDTO applicationRequestDTO) throws NoSuchFieldException, SecurityException {
		
		
		//-------------------------Parametros
		ArrayList<Parametro> listaParametros = new ArrayList<Parametro>();
		
		listaParametros.add(new Parametro("street_type","CL","03"));
		listaParametros.add(new Parametro("street_type","AV","02"));
		listaParametros.add(new Parametro("street_type","PL","04"));
		listaParametros.add(new Parametro("maritalStatus","S","01"));
		listaParametros.add(new Parametro("maritalStatus","C","02"));
		listaParametros.add(new Parametro("maritalStatus","V","03"));
		listaParametros.add(new Parametro("maritalStatus","D","04"));
		//-----------------------------------------
		
		
		List<Field> listaAtributos = getAllFields(applicationRequestDTO.getClass());
		
//		Field[] listaAtributos_0 = applicationRequestDTO.getClass().getDeclaredFields();
//		Field[] listaAtributos_1 = applicationRequestDTO.getClass().getSuperclass().getDeclaredFields();
		
		
		
		
		
		
		for (Field field : listaAtributos) {
            // Hacer que el campo sea accesible, en caso de ser privado
            field.setAccessible(true);
            
            try {
                // Obtener el valor del campo para la instancia actual
                Object value = field.get(applicationRequestDTO);
                
                if(value != null) {
                	System.out.println("no es null");
                	if(value instanceof List) {
                		ArrayList<ApplicantRequestDTO> applicantRequestDTO = (ArrayList<ApplicantRequestDTO>) value;
                		System.out.println("es un ArrayList");
                		if(applicantRequestDTO.size() != 0) {
                			System.out.println("TAMAÑO LISTA: "+ applicantRequestDTO.size());
                		}else {
                    		System.out.println("entra en el último else");
                    	}
                	}else {
                		System.out.println("no es un ArrayList");

                	}
                	
              
//                	if(applicantRequestDTO.isEmpty()) {
//                		ArrayList<ApplicantRequestDTO> applicantRequestDTO =  (ArrayList<ApplicantRequestDTO>) value;
            		
                	
                }
                // Imprimir el nombre del campo y su valor
                System.out.println("Campo: " + field.getName() + ", Tipo: " + field.getType()+ ", Valor: " + value);
                
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
		
//		String atributo_1 = applicationRequestDTO.getEntityCode()
//		if(atributo_1!= null) {
//			//comprobar
//		}
//		
//		String atributo_2 = applicationRequestDTO.getEntityCode()
//		if(atributo_1!= null) {
//			//comprobar
//		}
		
//		for (Parametro parametro : listaParametros) {
//		    String atributoObjetivo_a_buscar = parametro.getAtributo();
//		 
//		    try {
//		        Field field = applicationRequestDTO.getClass().getDeclaredField(atributoObjetivo_a_buscar);
//		        // Establecer el campo como accesible
//		        field.setAccessible(true);
//		 
//		        Object valorCampo = field.get(applicationRequestDTO);
//		        System.out.println(valorCampo);
//		    } catch (NoSuchFieldException e) {
//		        // El campo no existe en la clase
//		        System.out.println("El campo " + atributoObjetivo_a_buscar + " no existe en la clase.");
//		        return "el objeto está null";
//		    } catch (IllegalArgumentException | IllegalAccessException e) {
//		        // Manejar otras excepciones
//		        e.printStackTrace();
//		    }
//		}
		
//		for (String key : hashMap.keySet()) {
//            LOG.info("[TestPl] " + key + ": " + hashMap.get(key));
//        }
	  
		
		 
		
		
		System.out.println("aquí");

		return "funciona";
	}
	
	public static List<Field> getAllFields(Class<?> clazz) {
		List<Field> fields = new ArrayList<>();
		for (Class<?> c = clazz; c != null; c = c.getSuperclass()) {
			for (Field field : c.getDeclaredFields()) {
				fields.add(field);
			}
		}
		return fields;
    }
}
