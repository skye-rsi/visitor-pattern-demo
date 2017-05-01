package com.example.visitor.impl;

import com.example.model.BaseThing;
import com.example.model.EvenNewerThing;
import com.example.model.NewThing;
import com.example.visitor.ThingVisitor;

public class NamePrintVisitor implements ThingVisitor {

	public void visit(BaseThing baseThing) {
		System.out.println(baseThing.getName());
	}

	public void visit(NewThing newThing) {
		System.out.println(newThing.getDisplayName());
	}

	public void visit(EvenNewerThing evenNewerThing) {
		System.out.println("Even newer things got no name!");
	}

}
