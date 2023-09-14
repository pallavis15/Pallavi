package com.xworks.app.repositary;

import com.xworks.app.dto1.PhoneDTO;

public class PhoneRepositaryImpl implements PhoneRepositary {

		
		public void save1(PhoneDTO dto) {
			this.p[pos]=dto;
			System.out.println(dto+ " " +pos);
			pos++;
			
		}
		public boolean isExist1(PhoneDTO dto) {
			for(int i=0;i<=this.pos;i++) {
				PhoneDTO ref=p[i];
				if(ref!=null && ref.equals(dto)) {
					System.out.print("sorry it cant store");
					return true;
					
				}
				else {
					System.out.println("it is present in the database");
				}
			}
			return false;
		}
		public PhoneDTO findByname(String name) {
			for(int i=0;i<=this.pos;i++) {
				PhoneDTO p=m[i];
				if(p.getName().equals(name)) {
					System.out.println("it is been found" +p);
					return p;
					
				}
			}
			return null;
		}
		public PhoneDTO findBynameAndlocation(String name, String location) {
			for(int i=0;i<=this.pos;i++) {
			PhoneDTO k=p[i];
			if(k!=null && k.getName().equals(name) && k.getLocation().equals(location)) {
				System.out.println(k);
				return k;
			}
			}
			return null;
		}
		public PhoneDTO findAll() {
			for(int i=0;i<=this.pos;i++) {
				PhoneDTO o=m[i];
				System.out.println(o);
				return o;
			}
			return null;
		}
		@Override
		public void save(PhoneDTO dto) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean isExist(PhoneDTO dto) {
			
			return false;
		}
		

	}


