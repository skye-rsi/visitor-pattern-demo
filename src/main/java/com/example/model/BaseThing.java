package com.example.model;

import com.example.visitor.ThingVisitor;

public class BaseThing implements VisitedThing {

	private String name;
	private String type;
	private Integer size;

	public BaseThing() {
	}

	public BaseThing(String name, String type, Integer size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void accept(ThingVisitor visitor) {
		visitor.visit(this);
	}

}
