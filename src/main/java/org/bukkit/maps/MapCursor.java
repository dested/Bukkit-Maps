package org.bukkit.maps;

public interface MapCursor {
	boolean isDefault();
	int getX();
	int getY();
	byte getDirection();
	byte getCursorType();
	boolean getVisible();
	void setX(int x);
	void setY(int y);
	void setDirection(byte direction);
	void setCurstorType(byte cursorType);
	void setVisible(boolean visible);
}