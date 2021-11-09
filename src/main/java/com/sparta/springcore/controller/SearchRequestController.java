package com.sparta.springcore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sparta.springcore.dto.ItemDto;
import com.sparta.springcore.utils.NaverShopSearch;

import lombok.RequiredArgsConstructor;

@RestController // JSON으로 응답함을 선언합니다.
@RequiredArgsConstructor
public class SearchRequestController {

	private final NaverShopSearch naverShopSearch;

	@GetMapping("/api/search")
	public List<ItemDto> getItems(@RequestParam String query) {
		String resultString = naverShopSearch.search(query);
		return naverShopSearch.fromJSONtoItems(resultString);
	}
}
