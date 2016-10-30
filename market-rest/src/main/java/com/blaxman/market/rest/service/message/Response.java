package com.blaxman.market.rest.service.message;

import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import lombok.Getter;

@Getter
@Immutable
public class Response<T> {
	@Nonnull
	private boolean isSuccessful;
	private Optional<T> response;
	private Optional<Throwable> throwable;
	private Optional<String> responseDescription;
	
	public Response(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public Response(T response) {
		this.isSuccessful = true;
		this.response = Optional.ofNullable(response);
	}
	
	public Response(Throwable throwable) {
		this.isSuccessful = false;
		this.throwable = Optional.ofNullable(throwable);
	}
	
	public Response(boolean isSuccessful, String responseDescription) {
		this.isSuccessful = isSuccessful;
		this.responseDescription = Optional.ofNullable(responseDescription);
	}
	
	public Response(boolean isSuccessful, T response, Throwable throwable, String responseDescription) {
		this.isSuccessful = isSuccessful;
		this.response = Optional.ofNullable(response);
		this.throwable = Optional.ofNullable(throwable);
		this.responseDescription = Optional.ofNullable(responseDescription);
	}
}
