package com.blaxman.market.rest.service.message;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Response<T> {

	@Nonnull
	final private boolean isSuccessful;
	@Nonnull
	final private T response;
	private Throwable throwable;
	private String responseDescription;
}
