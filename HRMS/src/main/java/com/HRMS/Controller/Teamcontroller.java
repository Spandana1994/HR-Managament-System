package com.HRMS.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.HRMS.Entity.Team;
import com.HRMS.Serivce.TeamService;

@Controller
public class Teamcontroller {
	private static final Logger log = LoggerFactory.getLogger(Teamcontroller.class);

	@Autowired
	TeamService ts;
	
	@PostMapping(value="/team/add", consumes="application/json")
	public String addTeam(@RequestBody Team t) {
		log.info("Entering into addTeam method");
		 String team = ts.createTeam(t);
		 log.info("Existing into addTeam method");
		 return team;
	}

}
