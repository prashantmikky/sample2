package com.sample2.app.service;

import java.util.List;

import com.sample2.app.shared.AddressDto;

public interface AddressService {
	List<AddressDto> getAddresses(String userId);
	AddressDto getAddress(String addressId);
}
