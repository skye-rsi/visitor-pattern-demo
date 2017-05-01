package com.example.model;

import com.example.visitor.ThingVisitor;

public class NewThing extends BaseThing implements VisitedThing {

	public String displayName;

	public NewThing() {
	}

	public NewThing(String name, String type, Integer size) {
		setName(name);
		setType(type);
		setSize(size);
	}

	public NewThing(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return getName().toUpperCase() + " " + getType();
	}

	public void accept(ThingVisitor visitor) {
		visitor.visit(this);
	}

}
