package com.example.visitor.impl;

import com.example.dao.impl.BaseThingDao;
import com.example.dao.impl.EvenNewerThingDao;
import com.example.dao.impl.NewThingDao;
import com.example.model.BaseThing;
import com.example.model.EvenNewerThing;
import com.example.model.NewThing;
import com.example.visitor.ThingVisitor;

public class SaveThingVisitor implements ThingVisitor {

	private BaseThingDao baseSaver = new BaseThingDao();
	private NewThingDao newThingSaver = new NewThingDao();
	private EvenNewerThingDao evenNewerThingSaver = new EvenNewerThingDao();

	public void visit(BaseThing baseThing) {
		baseSaver.saveThing(baseThing);
	}

	public void visit(NewThing newThing) {
		newThingSaver.saveThing(newThing);
	}

	public void visit(EvenNewerThing evenNewerThing) {
		evenNewerThingSaver.saveThing(evenNewerThing);
	}

}
