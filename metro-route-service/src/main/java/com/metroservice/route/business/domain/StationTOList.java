package com.metroservice.route.business.domain;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

//@Getter @Setter 
@Data
public class StationTOList {
	private List<StationTO> stationList ;

//    public List<StationTO> getStationList() { 
//		return stationList;
//	}
//	public void setStationList(List<StationTO> stationList) { 
//		this.stationList = stationList;
//	}
}
