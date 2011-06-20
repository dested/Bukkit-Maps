package org.bukkit.maps;

import org.bukkit.entity.Player;

public interface ContextualMapRenderer extends MapRendererBase {
	void render(MapView map, MapCanvas canvas, Player player);

}