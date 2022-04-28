package com.controller;


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Data;
import com.pojo.RestResponse;



@RestController
public class RestApi 
{
	
	@PostMapping(path="/bfhl",consumes = { MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public RestResponse response(@RequestBody Data d)
	{
		List<String> number=new ArrayList<>();
		List<String> alphabet=new ArrayList<>();
		RestResponse rs=new RestResponse();
		rs.setIs_success(true);
		rs.setUser_id("rushi_mohite_06111997");
		rs.setEmail("rushi@xyz.com");
		rs.setRoll_no("ABCD999");
		String []data=d.getArr();
		if(data!=null)
		{
			for(int i=0;i<data.length;i++)
			{
				if(((String) data[i]).charAt(0)>='A' && ((String) data[i]).charAt(0)<='Z')
				{
					alphabet.add((String) data[i]);
				}
				else
				{
					number.add((String) data[i]);
				}
			}
		}
		
		rs.setAlphabets(alphabet);
		rs.setNumbers(number);
		
		return rs;
	}
	
}
