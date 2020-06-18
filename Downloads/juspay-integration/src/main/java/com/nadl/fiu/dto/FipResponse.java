package com.nadl.fiu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FipResponse {
@JsonProperty("fips")
List<Fips> fips;

public List<Fips> getFips() {
	return fips;
}

public void setFips(List<Fips> fips) {
	this.fips = fips;
}

@Override
public String toString() {
	return "FipResponse [fips=" + fips + "]";
}

}
