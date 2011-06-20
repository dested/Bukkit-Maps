package org.bukkit.maps;

public interface MapCursorCollection {
	MapCursor getCursor(int cursorIndex);

	int cursorLength();

	MapCursor addCursor(int x, int y, byte direction, byte type);

	MapCursor addCursor(int x, int y, byte direction, byte type, boolean visible);

	void removeCursor(int cursorIndex);

	void insertCursor(int index, MapCursor cu);
}