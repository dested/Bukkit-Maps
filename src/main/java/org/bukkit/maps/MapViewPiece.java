package org.bukkit.maps;

public interface MapViewPiece{
	public byte[] getBaseBuffer();
	public byte[] getOverlayBuffer();
	public byte[] getMergedBuffer();
	public void createOverlayBuffer(); 
}