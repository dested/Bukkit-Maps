package org.bukkit.event.map;

import org.bukkit.event.Event.Type;
import org.bukkit.maps.MapView;

public class MapIndexCreatedEvent extends MapEvent {
	protected int _index;

	public MapIndexCreatedEvent(Type type, int index) {
		super(type, null);
	}

	protected boolean _shouldSkip;
	public boolean shouldSkip() {
		return _shouldSkip;
	}
	public void shouldSkip(boolean s) {
		_shouldSkip = s;
	}
	public int getIndex() {
		return _index;
	}
	
}