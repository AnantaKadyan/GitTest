package edu.ncu.main;
import  edu.ncu.exception.*;
import edu.ncu.processor.*;
public  class DriverClass{
	public static void main(String[] args) {
		A a = new C();
		try{
			a.f();
		}catch(LevelThreeException e3){System.out.println("caught e3 exception");}
		catch(LevelTwoException e2){System.out.println("caught e2 exception");}
		catch(LevelOneException e1){System.out.println("caught e1 exception");}

	}
}