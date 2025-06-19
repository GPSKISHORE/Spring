package com.tcs.enty;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpComp {

	private String compname;
	private String Location;
	private String salary;
	private EmpEnty empDetails;
	//@JacksonXmlElementWrapper(useWrapping = false) // No <relocationLocations> wrapper
	//@JacksonXmlProperty(localName = "relocationLocations")
	private List<String> relocationLocations;
	private Set<String> History;
	private Map<String,Integer> Education;
}
