package org.bukkit.event.inventory;

import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryTransactionEvent extends Event {

	private final TransactionType leftType;
	private final TransactionType rightType;
	private ItemStack left;
	private ItemStack right;
	private final Inventory container;

	public InventoryTransactionEvent(final Type type,
			final TransactionType leftType, final TransactionType rightType,
			final ItemStack left, final ItemStack right,
			final Inventory container) {
		super(type);
		this.leftType = leftType;
		this.rightType = rightType;
		this.left = left;
		this.right = right;
		this.container = container;
	}

	public Inventory getContainer() {
		return container;
	}

	public TransactionType getLeftType() {
		return leftType;
	}

	public TransactionType getRightType() {
		return rightType;
	}

	public ItemStack getLeft() {
		return left;
	}

	public ItemStack getRight() {
		return right;
	}

	boolean cancled;

	public boolean isCancled() {
		return cancled;
	}

	public void setCancled(boolean value) {
		cancled = value;
	}

	public void setLeft(ItemStack left) {
		this.left = left;
	}
	public void setRight(ItemStack right) {
		this.right= right;
	}

}