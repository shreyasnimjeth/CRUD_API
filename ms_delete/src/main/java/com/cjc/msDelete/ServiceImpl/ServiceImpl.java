package com.cjc.msDelete.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.msDelete.HomeRepositry.HomeRepositry;
import com.cjc.msDelete.ServiceI.ServiceI;
@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	HomeRepositry hr;
	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
	}

}
