
package org.scijava.io.location;

public abstract class AbstractHigherOrderLocation implements Location {

	private final Location baseLocation;

	public AbstractHigherOrderLocation(final Location location) {
		this.baseLocation = location;
	}

	public Location getBaseLocation() {
		return baseLocation;
	}
}
