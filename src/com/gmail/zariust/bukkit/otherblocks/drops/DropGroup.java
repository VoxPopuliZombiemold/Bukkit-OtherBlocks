package com.gmail.zariust.bukkit.otherblocks.drops;

import java.util.ArrayList;
import java.util.List;

import com.gmail.zariust.bukkit.otherblocks.options.Action;
import com.gmail.zariust.bukkit.otherblocks.options.Target;

public class DropGroup extends CustomDrop {
	private String name;
	private List<SimpleDrop> list = null;

	public DropGroup(Target targ, Action act) {
		super(targ, act);
		setDrops(new ArrayList<SimpleDrop>());
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setDrops(List<SimpleDrop> drops) {
		this.list = drops;
	}

	public List<SimpleDrop> getDrops() {
		return list;
	}
}