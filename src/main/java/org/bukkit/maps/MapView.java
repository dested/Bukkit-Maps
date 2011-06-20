package org.bukkit.maps;

import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public interface MapView {


	void registerOverlay(MapRenderer renderer, RenderPriority priority,
			Plugin plugin);

	void registerOverlay(ContextualMapRenderer renderer,
			RenderPriority priority, Plugin plugin);

	void registerVirtualBase(MapRenderer renderer, Plugin plugin);

	void registerVirtualBase(ContextualMapRenderer renderer, Plugin plugin);

	List<MapRendererBase> getOverlays();

	MapRendererBase getBase();

	boolean isVirtual();

	short getId();

	void setScale(byte scale);

	byte getScale();

	int getCenterX();

	int getCenterZ();

	void setCenterX(int x);

	void setCenterZ(int z);

	void setRate(int rate);

	int getRate();

	MapCanvas getCanvas(MapType type);

	MapDrawer getDrawer();

	MapStringDrawer getStringDrawer();

	boolean isContextual();

	void removeUser(Player player);

	void addUser(Player craftPlayer);

	MapViewManager getMapViewManager();

	void setPrintOrder(MapPrintOrder sequential);

	MapPrintOrder getPrintOrder();
}