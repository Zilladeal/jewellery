package com.zd.jewellery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zd.jewellery.dto.GoldItemDto;

@Service
public class GoldProductServiceImpl {
	
	public List<GoldItemDto> getGoldRate()
	{
		GoldItemDto dto = new GoldItemDto("Chain",45000 , "It is Gold Chain", Double.parseDouble("2.5"));
		List<GoldItemDto> list = new ArrayList<>();
		list.add(dto);
		return list;
	}

}
