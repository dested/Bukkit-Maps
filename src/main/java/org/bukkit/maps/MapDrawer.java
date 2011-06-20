package org.bukkit.maps;

import java.awt.image.BufferedImage;

public interface MapDrawer {
	void setCanvas(MapCanvas canv);

	MapCanvas getCanvas();

	void setLineWidth(int width);

	void drawLine(int startX, int startY, int endX, int endY, int width);

	void drawRectangle(int startX, int startY, int width, int height);

	void fillRectangle(int startX, int startY, int width, int height);

	void drawShape(int x, int y, Shape shape);

	void fillShape(int x, int y, Shape shape);

	void drawShape(int x, int y, Shape shape, int scale);

	void fillShape(int x, int y, Shape shape, int scale);

	void drawImage(BufferedImage img); 
	void drawImage(int width, int height, int[] pixels);

	void fill(int x, int y);

	void setForeColor(byte colorIndex);

	void setBackColor(byte colorIndex);

	byte getForeColor();

	byte getBackColor();

	void drawCircle(int x, int y, int radius);
	void fillCircle(int x, int y, int radius);
}