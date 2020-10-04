package com.sprongsconfig.noxml;

public class Employee 
{
private int id;
private int name;
private int branch;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
public int getBranch() {
	return branch;
}
public void setBranch(int branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + "]";
}


}