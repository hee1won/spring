package org.zerock.mapper.study;

import java.util.List;

import org.zerock.domain.study.Spring0512Dto;

public interface Spring0512Mapper {

	String StudyCustomerNameById(int id);

	String StudyEmployeeFirstNmaeById(int id);

	List<Spring0512Dto> selectboard();

}
