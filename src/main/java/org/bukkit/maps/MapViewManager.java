package org.bukkit.maps;

import org.bukkit.entity.Player;

public interface MapViewManager {
	boolean getContextual();

	MapViewPiece getBasePiece();

	MapViewPiece getUserPiece(Player player);

	void removeUserBuffer(Player player);

	void pushUserBuffer(Player player, MapViewPiece craftMapViewPiece);

	byte[] getMergedBuffer();

	void createOverlayBuffer();
 

}