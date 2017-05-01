package com.example.visitor;

import com.example.model.BaseThing;
import com.example.model.EvenNewerThing;
import com.example.model.NewThing;

public interface ThingVisitor {

	public void visit(BaseThing baseThing);

	public void visit(NewThing newThing);

	public void visit(EvenNewerThing evenNewerThing);
}
