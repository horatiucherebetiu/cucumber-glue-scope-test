package test.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest2 {

	@Lookup
	public ServiceTest1 getTest1(){
		return null;
	}

}
