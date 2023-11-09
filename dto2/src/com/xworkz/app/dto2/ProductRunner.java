package com.xworkz.app.dto2;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		ProductDTO product1 = new ProductDTO(1, "Sample Product 1", 100, "Sample Company 1", LocalDate.now(),
				LocalDate.now(), 0.1, "Sample Description 1", 10, 5, 100, 50, 30, 10, 5, 80, "Sample Packer 1", 500,
				true, "Generic Name 1", false, "Sample Country 1", 1234567890L, 9876543210L, true, 1,
				"Primary Delivery 1", LocalDate.now(), LocalDate.now());

		ProductDTO product2 = new ProductDTO(2, "Sample Product 2", 150, "Sample Company 2", LocalDate.now(),
				LocalDate.now(), 0.2, "Sample Description 2", 20, 4, 90, 40, 35, 15, 5, 90, "Sample Packer 2", 600,
				true, "Generic Name 2", false, "Sample Country 2", 9876543210L, 1234567890L, true, 2,
				"Secondary Delivery 2", LocalDate.now(), LocalDate.now());

		ProductDTO product3 = new ProductDTO(3, "Sample Product 3", 200, "Sample Company 3", LocalDate.now(),
				LocalDate.now(), 0.15, "Sample Description 3", 15, 4, 85, 45, 25, 5, 10, 50, "Sample Packer 3", 700,
				false, "Generic Name 3", true, "Sample Country 3", 1234567890L, 9876543210L, true, 3,
				"Tertiary Delivery 3", LocalDate.now(), LocalDate.now());

		ProductDTO product4 = new ProductDTO(4, "Sample Product 4", 120, "Sample Company 4", LocalDate.now(),
				LocalDate.now(), 0.05, "Sample Description 4", 12, 4, 95, 55, 35, 10, 8, 70, "Sample Packer 4", 550,
				true, "Generic Name 4", false, "Sample Country 4", 9876543210L, 1234567890L, true, 4,
				"Quaternary Delivery 4", LocalDate.now(), LocalDate.now());

		ProductDTO product5 = new ProductDTO(5, "Sample Product 5", 180, "Sample Company 5", LocalDate.now(),
				LocalDate.now(), 0.08, "Sample Description 5", 18, 3, 80, 60, 30, 10, 5, 30, "Sample Packer 5", 450,
				true, "Generic Name 5", false, "Sample Country 5", 1234567890L, 9876543210L, true, 5,
				"Quinary Delivery 5", LocalDate.now(), LocalDate.now());

		ProductDTO product6 = new ProductDTO(6, "Sample Product 6", 250, "Sample Company 6", LocalDate.now(),
				LocalDate.now(), 0.12, "Sample Description 6", 15, 3, 85, 55, 35, 12, 5, 40, "Sample Packer 6", 650,
				true, "Generic Name 6", false, "Sample Country 6", 9876543210L, 1234567890L, true, 6,
				"Senary Delivery 6", LocalDate.now(), LocalDate.now());

		ProductDTO product7 = new ProductDTO(7, "Sample Product 7", 140, "Sample Company 7", LocalDate.now(),
				LocalDate.now(), 0.09, "Sample Description 7", 14, 4, 75, 45, 25, 9, 7, null, "Sample Packer 7", 700,
				true, "Generic Name 7", false, "Sample Country 7", 1234567890L, 9876543210L, true, 7,
				"Septenary Delivery 7", LocalDate.now(), LocalDate.now());

		ProductDTO product8 = new ProductDTO(8, "Sample Product 8", 160, "Sample Company 8", LocalDate.now(),
				LocalDate.now(), 0.11, "Sample Description 8", 16, 5, 90, 50, 30, 10, 6, 60, "Sample Packer 8", 750,
				true, "Generic Name 8", false, "Sample Country 8", 9876543210L, 1234567890L, true, 8,
				"Octonary Delivery 8", LocalDate.now(), LocalDate.now());

		ProductDTO product9 = new ProductDTO(9, "Sample Product 9", 220, "Sample Company 9", LocalDate.now(),
				LocalDate.now(), 0.14, "Sample Description 9", 22, 4, 80, 40, 20, 8, 6, 40, "Sample Packer 9", 600,
				true, "Generic Name 9", false, "Sample Country 9", 1234567890L, 9876543210L, true, 9,
				"Nonary Delivery 9", LocalDate.now(), LocalDate.now());

		ProductDTO product10 = new ProductDTO(10, "Sample Product 10", 120, "Sample Company 10", LocalDate.now(),
				LocalDate.now(), 0.07, "Sample Description 10", 12, 5, 95, 55, 35, 7, 5, 20, "Sample Packer 10", 500,
				true, "Generic Name 10", false, "Sample Country 10", 9876543210L, 1234567890L, true, 10,
				"Decenary Delivery 10", LocalDate.now(), LocalDate.now());
		Collection<ProductDTO> collection = new LinkedList<ProductDTO>();
		collection.add(product1);
		collection.add(product2);
		collection.add(product3);
		collection.add(product4);
		collection.add(product5);
		collection.add(product6);
		collection.add(product7);
		collection.add(product8);
		collection.add(product9);
		collection.add(product10);
		System.out.println("Arranging in descending");

		System.out.println("Sorted According to the Company");
		Comparator<ProductDTO> com = (r1, r2) -> {
			return r1.getCompany().compareTo(r2.getCompany());
		};
		collection.stream().sorted(com).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Id");
		Comparator<ProductDTO> com1 = (r1, r2) -> {
			return r1.getId().compareTo(r2.getId());
		};
		collection.stream().sorted(com1).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the ItemWeigth");
		Comparator<ProductDTO> com2 = (r1, r2) -> {
			return r1.getItemWeight().compareTo(r2.getItemWeight());
		};
		collection.stream().sorted(com2).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Peoplerating5");
		Comparator<ProductDTO> com3 = (r1, r2) -> {
			return r1.getPeoplerating5().compareTo(r2.getPeoplerating5());
		};
		collection.stream().sorted(com3).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Peoplerating");
		Comparator<ProductDTO> com4 = (r1, r2) -> {
			return r1.getPeoplerating().compareTo(r2.getPeoplerating());
		};
		collection.stream().sorted(com4).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Peoplerating2");
		Comparator<ProductDTO> com6 = (r1, r2) -> {
			return r1.getPeoplerating2().compareTo(r2.getPeoplerating2());
		};
		collection.stream().sorted(com6).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the getPeoplerating3");
		Comparator<ProductDTO> com7 = (r1, r2) -> {
			return r1.getPeoplerating3().compareTo(r2.getPeoplerating3());
		};
		collection.stream().sorted(com7).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the getPeoplerating4");
		Comparator<ProductDTO> com8 = (r1, r2) -> {
			return r1.getPeoplerating4().compareTo(r2.getPeoplerating4());
		};
		collection.stream().sorted(com8).forEach(ref -> System.out.println(ref));
		Comparator<ProductDTO> com9 = (r1, r2) -> {
			return r1.getPrice().compareTo(r2.getPrice());
		};
		System.out.println("Sorted According to the Price");
		collection.stream().sorted(com9).forEach(ref -> System.out.println(ref));

		Comparator<ProductDTO> com10 = (r1, r2) -> {
			return r1.getQuantity().compareTo(r2.getQuantity());
		};
		System.out.println("Sorted According to the Quantity");
		collection.stream().sorted(com10).forEach(ref -> System.out.println(ref));

		System.out.println("----------------------------------------------------------");
		System.err.println("Arranging in Ascending");

		System.out.println("Sorted According to the Rating");
		Comparator<ProductDTO> com11 = (r1, r2) -> {
			return r2.getRating().compareTo(r1.getRating());
		};
		collection.stream().sorted(com11).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Warranty");
		Comparator<ProductDTO> com12 = (r1, r2) -> {
			return r2.getWarranty().compareTo(r1.getWarranty());
		};
		collection.stream().sorted(com12).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Company");
		Comparator<ProductDTO> com13 = (r1, r2) -> {
			return r2.getCompany().compareTo(r1.getCompany());
		};
		collection.stream().sorted(com13).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the CountryOfOrigin");
		Comparator<ProductDTO> com14 = (r1, r2) -> {
			return r2.getCountryOfOrigin().compareTo(r1.getCountryOfOrigin());
		};
		collection.stream().sorted(com14).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the SerialNumber");
		Comparator<ProductDTO> com15 = (r1, r2) -> {
			return r2.getSerialNumber().compareTo(r1.getSerialNumber());
		};
		collection.stream().sorted(com15).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the ReturnBy");
		Comparator<ProductDTO> com16 = (r1, r2) -> {
			return r2.getReturnBy().compareTo(r1.getReturnBy());
		};
		collection.stream().sorted(com16).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the Returnable");
		Comparator<ProductDTO> com17 = (r1, r2) -> {
			return r2.getReturnable().compareTo(r1.getReturnable());
		};
		collection.stream().sorted(com17).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the PhoneNumber");
		Comparator<ProductDTO> com18 = (r1, r2) -> {
			return r2.getPhoneNumber().compareTo(r1.getPhoneNumber());
		};
		collection.stream().sorted(com18).forEach(ref -> System.out.println(ref));

		System.out.println("Sorted According to the PhoneNumber");
		Comparator<ProductDTO> com19 = (r1, r2) -> {
			return r2.getSerialNumber().compareTo(r1.getSerialNumber());
		};
		collection.stream().sorted(com19).forEach(ref -> System.out.println(ref));

		System.out.println("Collection all data");
		Collection<ProductDTO> N = collection.stream().collect(Collectors.toList());
		System.out.println(N);
	}

}
