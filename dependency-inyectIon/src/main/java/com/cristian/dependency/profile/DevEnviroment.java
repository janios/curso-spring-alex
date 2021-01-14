package com.cristian.dependency.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevEnviroment implements EnviromentService {

	@Override
	public String getEnviroment() {
		return "Dev";
	}

}
