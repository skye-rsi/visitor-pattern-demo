package com.example.model;

import com.example.visitor.ThingVisitor;

public interface VisitedThing {

	public void accept(ThingVisitor visitor);

}
