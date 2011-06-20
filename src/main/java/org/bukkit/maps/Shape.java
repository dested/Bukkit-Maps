package org.bukkit.maps;

import java.awt.Point;

public interface Shape {
	Point[] getCoordinates();

	void pushCoordinate(int x, int y);

	void setCenter(int x, int y);

	Point getCenter();
}

   