package com.xworks.app.repository.app;
import com.xworks.app.repository.impl.*;
public class MedicineRunner {

	public static void main(String[] args) {
		Medicine ref = new Mediciniimpl();
		ref.cure("paracetomal");
		ref.cure("cymbalta");
		ref.cure("lisinopril");
		ref.cure("tramadol");
		ref.cure("trazodone");
		ref.cure("ativan");
		ref.cure("gabapentin");
		ref.cure("metformin");
		ref.cure("omeprazole");
		ref.cure("diazepam");
		
	}


	}


