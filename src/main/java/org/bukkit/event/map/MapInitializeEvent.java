package org.bukkit.event.map;

import org.bukkit.maps.MapView;

public class MapInitializeEvent extends MapEvent {
	protected MapView map;

	public MapInitializeEvent(Type type, MapView map) {
		super(type, map);
	}

}