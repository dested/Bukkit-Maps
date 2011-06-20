package org.bukkit.maps;

public interface MapFont{//Thanks fullwall!
	void setBytes(byte[][] bytes);
	byte[][] getBytes();
	String getName();
	void setName(String name);
	int getCharacterSize();
	int getCharacterHeight();
	int getCharacterWidth();
	int getSpaceWidth() ;
	boolean characterAllowed(Character ch);
	int getCharIndex(Character ch);
}