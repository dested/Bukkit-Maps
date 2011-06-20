package org.bukkit.event.map;
 
import org.bukkit.event.Event;
import org.bukkit.maps.MapView;

/**
 * Represents events within a world
 */
public class MapEvent extends Event {
	private final MapView map;

	public MapEvent(final Type type, final MapView map) {
		super(type);

		this.map = map;
	}

	/**
	 * Gets the world primarily involved with this event
	 * 
	 * @return World which caused this event
	 */
	public MapView getMapView() {
		return map;
	}
}
