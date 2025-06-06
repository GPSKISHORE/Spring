package com.tcs.enty;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpComp {

	private String compname;
	private String Location;
	private String salary;
	private EmpEnty EmpDetails;
	private List<String> relocationLocations;
	private Set<String> History;
	private Map<String,Integer> Education;
}
