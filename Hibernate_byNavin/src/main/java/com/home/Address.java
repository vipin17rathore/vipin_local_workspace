package com.home;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
		private String road;
		private int sector;
		private String lane;
		public String getRoad() {
			return road;
		}
		public void setRoad(String road) {
			this.road = road;
		}
		public int getSector() {
			return sector;
		}
		public void setSector(int sector) {
			this.sector = sector;
		}
		public String getLane() {
			return lane;
		}
		public void setLane(String lane) {
			this.lane = lane;
		}
		
		
		
}
