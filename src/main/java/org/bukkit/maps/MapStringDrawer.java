package org.bukkit.maps;

import java.awt.Rectangle;

public interface MapStringDrawer {
	void setCanvas(MapCanvas canv);
 

	void setDirection(int direction);

	void setFont(MapFont font);

	MapFont getFont();

	void drawText(int x, int y, String text);

	void drawText(int x, int y, String text, MapStringAnchorPosition locationPosition);

 

	Rectangle measureString(String string);
}