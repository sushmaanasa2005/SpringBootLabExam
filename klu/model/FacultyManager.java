package klu.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import klu.repository.FacultyRepository;

@Service
public class FacultyManager {
	
	@Autowired
	FacultyRepository FR;
	
	public String addFaculty(Faculty F)
	{
		FR.save(F); //INSERT OPERATION
		
		Map<String, String> resp = new HashMap<String,String>();
		resp.put("code", "200");
		resp.put("msg", "New faculty has been added");
		return toJSON(resp);
	}
	
	//Convert into JSON
	public String toJSON(Object obj)
	{
		GsonBuilder GB = new GsonBuilder();
		Gson G = GB.create();
		return G.toJson(obj);
	}
}
