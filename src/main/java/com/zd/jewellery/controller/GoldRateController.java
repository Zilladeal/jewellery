package com.zd.jewellery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zd.jewellery.dto.GoldItemDto;
import com.zd.jewellery.service.GoldProductServiceImpl;

@RestController
@RequestMapping("/jewellery")
public class GoldRateController {

	@Autowired
	private GoldProductServiceImpl service;
	@GetMapping("/gold/rate")
	public List<GoldItemDto> getGoldRate()
	{
		return service.getGoldRate();
	}
}
