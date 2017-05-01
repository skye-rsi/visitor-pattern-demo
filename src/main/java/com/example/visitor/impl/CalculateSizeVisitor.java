package com.example.visitor.impl;

import com.example.model.BaseThing;
import com.example.model.EvenNewerThing;
import com.example.model.NewThing;
import com.example.visitor.ThingVisitor;

public class CalculateSizeVisitor implements ThingVisitor {

	private static final Integer BASE_SIZE_MULTIPLIER = 2;
	private static final double NEWER_SIZE_MULTIPLIER = 3.4;

	public void visit(BaseThing baseThing) {
		System.out.println("Base Thing size: " + baseThing.getSize() * BASE_SIZE_MULTIPLIER);
	}

	public void visit(NewThing newThing) {
		System.out.println("New Thing size: " + newThing.getSize());
	}

	public void visit(EvenNewerThing evenNewerThing) {
		System.out.println("Even newer thing size: " + evenNewerThing.getNewerSize() * NEWER_SIZE_MULTIPLIER);
	}

}
