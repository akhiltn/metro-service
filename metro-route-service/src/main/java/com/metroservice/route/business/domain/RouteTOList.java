package com.metroservice.route.business.domain;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

//@Getter @Setter 
@Data
public class RouteTOList {
	private List<RouteTO> routeList ;

//    public List<RouteTO> getRouteList() { 
//		return routeList;
//	}
//	public void setRouteList(List<RouteTO> routeList) { 
//		this.routeList = routeList;
//	}
}
