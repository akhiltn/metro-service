package com.metroservice.route.business.domain;

import java.util.Date;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

//@Getter @Setter 
@Data
public class RouteTO {
    private long   routeId             ;
    private String routeNumber         ;
    private long   startingStationId   ;
    private long   endStationId        ;
    private Date   lastModifiedDate    ;

	
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("\n");
//		sb.append("routeId             =").append(routeId             ).append("\n");
//		sb.append("routeNumber         =").append(routeNumber         ).append("\n");
//		sb.append("startingStationId   =").append(startingStationId   ).append("\n");
//		sb.append("endStationId        =").append(endStationId        ).append("\n");
//		sb.append("lastModifiedDate    =").append(lastModifiedDate    ).append("\n");
//		return sb.toString();
//	}
}
