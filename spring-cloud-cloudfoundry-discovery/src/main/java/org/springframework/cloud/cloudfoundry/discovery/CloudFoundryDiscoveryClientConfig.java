package org.springframework.cloud.cloudfoundry.discovery;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties used for configuring the CloudFoundry implementation of
 * {@link org.springframework.cloud.client.discovery.DiscoveryClient}
 *
 * @author Olga Maciaszek-Sharma
 */
@ConfigurationProperties("spring.cloud.discovery.client.cloudfoundry")
public class CloudFoundryDiscoveryClientConfig {

	private int order;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
