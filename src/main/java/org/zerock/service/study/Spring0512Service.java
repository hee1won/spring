package org.zerock.service.study;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.study.Spring0512Dto;
import org.zerock.mapper.study.Spring0512Mapper;

@Service
public class Spring0512Service {
	
	@Autowired
	private Spring0512Mapper mapper;

	public String getStudyCustomerName(int id) {
		
		return mapper.StudyCustomerNameById(id);
	}

	public String getStudyFirstName(int id) {
		
		return mapper.StudyEmployeeFirstNmaeById(id);
		
	}

	public List<Spring0512Dto> getStudyBoard() {
		
		return mapper.selectboard();
	}

}
