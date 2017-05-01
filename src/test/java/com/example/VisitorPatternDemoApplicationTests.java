package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.BaseThing;
import com.example.model.EvenNewerThing;
import com.example.model.NewThing;
import com.example.visitor.ThingVisitor;
import com.example.visitor.impl.CalculateSizeVisitor;
import com.example.visitor.impl.NamePrintVisitor;
import com.example.visitor.impl.SaveThingVisitor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitorPatternDemoApplicationTests {

	@Test
	public void testNamePrint() {
		BaseThing thing1 = new BaseThing("thing1", "basic", 5);
		BaseThing thing2 = new NewThing("thing2", "new", 5);
		BaseThing thing3 = new EvenNewerThing("thing3", "even newer!", 1.2543);

		List<BaseThing> thingList = new ArrayList<BaseThing>();
		thingList.add(thing1);
		thingList.add(thing2);
		thingList.add(thing3);

		System.out.println("****** testPrintName");
		for (BaseThing thing : thingList) {
			if (thing instanceof NewThing) {
				System.out.println(((NewThing) thing).getDisplayName());
			} else if (thing instanceof EvenNewerThing) {
				System.out.println("Even newer things got no name!");
			} else {
				System.out.println(thing.getName());
			}
		}
	}

	@Test
	public void testNamePrintVisitor() {
		BaseThing thing1 = new BaseThing("thing1", "basic", 5);
		BaseThing thing2 = new NewThing("thing2", "new", 5);
		BaseThing thing3 = new EvenNewerThing("thing3", "even newer!", 1.2543);

		System.out.println("****** testPrintNameVisitor");
		ThingVisitor nameVisitor = new NamePrintVisitor();
		thing1.accept(nameVisitor);
		thing2.accept(nameVisitor);
		thing3.accept(nameVisitor);
	}

	@Test
	public void testSizeCalculation() {
		BaseThing thing1 = new BaseThing("thing1", "basic", 5);
		BaseThing thing2 = new NewThing("thing2", "new", 12);
		BaseThing thing3 = new EvenNewerThing("thing3", "even newer!", 1.2543);

		List<BaseThing> thingList = new ArrayList<BaseThing>();
		thingList.add(thing1);
		thingList.add(thing2);
		thingList.add(thing3);

		ThingVisitor sizeVisitor = new CalculateSizeVisitor();
		for (BaseThing thing : thingList) {
			thing.accept(sizeVisitor);
		}
	}

	@Test
	public void testSave() {
		BaseThing thing1 = new BaseThing("thing1", "basic", 5);
		BaseThing thing2 = new NewThing("thing2", "new", 12);
		BaseThing thing3 = new EvenNewerThing("thing3", "even newer!", 1.2543);

		List<BaseThing> thingList = new ArrayList<BaseThing>();
		thingList.add(thing1);
		thingList.add(thing2);
		thingList.add(thing3);

		ThingVisitor saveVisitor = new SaveThingVisitor();
		for (BaseThing thing : thingList) {
			thing.accept(saveVisitor);
		}
	}
}
