package test.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class Test2 {

	@Lookup
	public Test1 getTest1(){
		return null;
	}

}
