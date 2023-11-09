package com.xworkz.app.dto2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.app.dto.CameraDTO;
import com.xworkz.app.dto.SaloonDTO;

public class CameraRunner {

	public static void main(String[] args) {
	CameraDTO CameraDTO = new CameraDTO(1,"Sony","Vs1",5000.0,LocalDate.of(2023, 11, 3));
	CameraDTO CameraDTO1 = new CameraDTO(2,"Canon","Vs2",10000.0,LocalDate.of(2023, 11, 3));
	CameraDTO CameraDTO2 = new CameraDTO(1,"Vivo","Vs3",10000.0,LocalDate.of(2023, 11, 3));
	CameraDTO CameraDTO3 = new CameraDTO(1,"Sony","Vs4",50000.0,LocalDate.of(2023, 11, 3));
	CameraDTO CameraDTO4 = new CameraDTO(1,"Sony","Vs5",10000.0,LocalDate.of(2023, 11, 3));
	Collection<CameraDTO> cameras= new ArrayList<CameraDTO>();
	cameras.add(CameraDTO);
	cameras.add(CameraDTO1);
	cameras.add(CameraDTO2);
	cameras.add(CameraDTO3);
	cameras.add(CameraDTO4);
	cameras.stream().filter(camera -> camera.getBrand().contains("Canon")).forEach(cam->System.out.println(cam));
	System.out.println("---------------------------");
	cameras.stream().filter(camera -> camera.getCost()>40000).collect(Collectors.toList()).forEach(cam->System.out.println(cam.getModel()));
	System.out.println("---------------------------");
	cameras.stream().filter(camera -> camera.getModel().equals("vs1")).forEach(c->model1.add((int) c.getCost()));
	model1.foreach(s -> System.out.println(s));
	
	}
	}


