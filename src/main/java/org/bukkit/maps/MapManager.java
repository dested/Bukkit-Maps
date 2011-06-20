package org.bukkit.maps;

import org.bukkit.Server;

public interface MapManager {
	MapView getMapView(String mapIndex);

	boolean activate(MapView map);

	public Server getServer();
}