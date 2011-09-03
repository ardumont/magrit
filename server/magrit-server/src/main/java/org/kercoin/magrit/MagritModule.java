package org.kercoin.magrit;

import org.kercoin.magrit.services.BuildStatusesService;
import org.kercoin.magrit.services.DummyBuildStatusesService;

import com.google.inject.AbstractModule;

public class MagritModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BuildStatusesService.class).to(DummyBuildStatusesService.class);
	}

}