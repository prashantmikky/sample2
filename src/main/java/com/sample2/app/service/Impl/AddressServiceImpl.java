package com.sample2.app.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample2.app.io.entity.AddressEntity;
import com.sample2.app.io.entity.UserEntity;
import com.sample2.app.repository.AddressRepository;
import com.sample2.app.repository.UserRepository;
import com.sample2.app.service.AddressService;
import com.sample2.app.shared.AddressDto;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public List<AddressDto> getAddresses(String userId) {
		List<AddressDto> returnValue = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();
		
		UserEntity userEntity = userRepository.findByUserId(userId);
		if(userEntity == null) return returnValue;
		
		Iterable<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
		for(AddressEntity addressEntity : addresses)
		{
			returnValue.add(modelMapper.map(addressEntity, AddressDto.class));
		}
		
		return returnValue;
	}

	@Override
	public AddressDto getAddress(String addressId) {
		
		AddressEntity addressEntity = addressRepository.findByAddressId(addressId);
		AddressDto returnValue = null;
		if( addressEntity != null)
		{
			returnValue = new ModelMapper().map(addressEntity, AddressDto.class);
		}
		
		
		
		return returnValue;
	}

}
