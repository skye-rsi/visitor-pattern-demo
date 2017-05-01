package com.example.model;

import com.example.visitor.ThingVisitor;

public class EvenNewerThing extends BaseThing implements VisitedThing {

	private double newerSize;

	public EvenNewerThing() {
	}

	public EvenNewerThing(String name, String type, double size) {
		setName(name);
		setType(type);
		setNewerSize(size);
	}

	public double getNewerSize() {
		return newerSize;
	}

	public void setNewerSize(double newerSize) {
		this.newerSize = newerSize;
	}

	public void accept(ThingVisitor visitor) {
		visitor.visit(this);
	}

}