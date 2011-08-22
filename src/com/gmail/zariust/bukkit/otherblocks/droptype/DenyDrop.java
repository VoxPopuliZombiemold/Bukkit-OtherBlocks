package com.gmail.zariust.bukkit.otherblocks.droptype;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;

public class DenyDrop extends DropType {
	// TODO: Passing in a Cancellable just doesn't work since it's not available at the time of construction
	private Cancellable event;
	
	public DenyDrop(Cancellable evt) {
		super(DropCategory.DENY);
		event = evt;
	}

	public DenyDrop() {
		super(DropCategory.DENY);
		// TODO Auto-generated constructor stub
	}

	public Cancellable getEvent() {
		return event;
	}

	@Override
	protected void performDrop(Location where, DropFlags flags) {
		event.setCancelled(true);
	}
}