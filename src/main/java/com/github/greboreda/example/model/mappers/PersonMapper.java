package com.github.greboreda.example.model.mappers;

import java.util.List;

import org.springframework.util.CollectionUtils;

import com.github.greboreda.example.model.person.Person;
import com.github.greboreda.example.model.person.PersonVO;
import com.github.greboreda.example.model.telephone.Telephone;
import com.github.greboreda.example.model.telephone.TelephoneVO;

public class PersonMapper {

	public static Person proccessVOBO(PersonVO personVO, List<TelephoneVO> telephones) {
		
		if(personVO == null) {
			return null;
		}
		
		Person person = new Person();
		
		person.setId(personVO.getId());
		person.setName(personVO.getName());
		
		if(CollectionUtils.isEmpty(telephones) == false) {
		
			for(TelephoneVO telephoneVO : telephones) {
				
				Telephone telephone = new Telephone();
				telephone.setId(telephoneVO.getId());
				telephone.setNumber(telephoneVO.getNumber());
				
				person.appendTelephone(telephone);
			}
		
		}
		
		return person;
	}
	
	public static PersonVO proccessBOVO(Person person) {
		
		if(person == null) {
			return null;
		}
		
		PersonVO personVO = new PersonVO();

		personVO.setId(person.getId());
		personVO.setName(person.getName());
		
		return personVO;
	}
	
}
