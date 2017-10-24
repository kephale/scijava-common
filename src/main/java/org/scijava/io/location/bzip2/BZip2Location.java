
package org.scijava.io.location.bzip2;

import org.scijava.io.handle.DataHandle;
import org.scijava.io.location.AbstractHigherOrderLocation;
import org.scijava.io.location.Location;

/**
 * {@link Location} backed by a {@link DataHandle} that is BZip2 compressed.
 * 
 * @author Gabriel Einsdorf
 * @see BZip2Handle
 */
public class BZip2Location extends AbstractHigherOrderLocation {

	/**
	 * Creates a {@link BZip2Location} wrapping the given location
	 *
	 * @param location the location to operate on
	 */
	public BZip2Location(final Location location) {
		super(location);
	}

}
