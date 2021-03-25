package com.HRMS.Serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.Dao.TeamRepo;
import com.HRMS.Entity.Team;
@Service
public class Teamserviceimpl implements TeamService{
	@Autowired
	TeamRepo tr;
	@Override
	public String createTeam(Team tm) {
		tr.save(tm);
		return "data will created for team";
	}

}
