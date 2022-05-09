package lecture.c08core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Memory {

	private Memory memory;
	
	@Autowired
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
}
