package edu.wpi.teamname.entity;


import java.awt.*;
import java.util.ArrayList;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	private String text;

	public void setText(String text){
	this.text = text;
	notifyObservers();
	}

	public String getText(){
		return text;
	}

	@Override
	public void register(Observer o){
			observerList.add(o);
	}

	@Override
	public void notifyObservers(){
		for (Observer observer : observerList){
			observer.notify();
		}

	}
}
