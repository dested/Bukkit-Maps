package org.bukkit.maps;

import java.awt.Color;

import org.bukkit.entity.Player;

public interface MapCanvas {
	MapView getMapView();

	MapCursorCollection getCursorCollection();

	void setMapView(MapView canv);

	void setPixel(int x, int y, byte color);

	void setPixel(int x, int y, Color rgbColor);

	byte getPixel(int x, int y);

	byte getBasePixel(int x, int y);

	byte getOverlayPixel(int x, int y);

	void invalidate();
	
	byte matchColor(Color c);

	void markDirty(int x, int startY, int endY);

	MapType getRenderType();

	void setMapType(MapType type);

	public Player getCurrentUser();

	public void setCurrentUser(Player player);

	public void setManager(MapViewManager manager);
}