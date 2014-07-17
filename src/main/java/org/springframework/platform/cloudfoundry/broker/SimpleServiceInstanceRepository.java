/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.platform.cloudfoundry.broker;

import java.util.ArrayList;
import java.util.List;

import org.cloudfoundry.community.servicebroker.model.ServiceInstance;

/**
 * @author Dave Syer
 *
 */
public class SimpleServiceInstanceRepository implements ServiceInstanceRepository {

	private String serviceDefinitionId;

	public SimpleServiceInstanceRepository(String serviceDefinitionId) {
		// TODO: add dashboard URL
		this.serviceDefinitionId = serviceDefinitionId;
	}

	@Override
	public List<ServiceInstance> findAll() {
		return new ArrayList<ServiceInstance>();
	}

	@Override
	public ServiceInstance findOne(String serviceInstanceId) {
		return new ServiceInstance(serviceInstanceId, serviceDefinitionId, null, null, null, null);
	}

	@Override
	public void save(ServiceInstance instance) {
	}

	@Override
	public void delete(String id) {
	}

}
