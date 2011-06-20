package org.bukkit.event.inventory;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Type;
import org.bukkit.inventory.Inventory;

public class InventoryOpenedClosedEvent extends Event {

	private final Inventory container;

	public InventoryOpenedClosedEvent(final Type type, final Inventory container) {
		super(type);
		this.container = container;
	}

	public Inventory getContainer() {
		return container;
	}

	boolean cancled;

	public boolean isCancled() {
		return cancled;
	}

	public void setCancled(boolean value) {
		cancled = value;
	}
}