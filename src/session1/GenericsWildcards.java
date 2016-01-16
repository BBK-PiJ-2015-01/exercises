package session1;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	public static void main(String[] args) {

		new GenericsWildcards().runGenericWildCards();
	}
	
	private void runGenericWildCards() {
		
		List<SuperClass> superList = new ArrayList<>();
		
		addSuperClassToList(superList);
		addSubClassType1ToList(superList);
		addSubClassType2ToList(superList);
		
		processList(superList);
		
		List<SubClassType1> subClassType1List = new ArrayList<>();
		subClassType1List.add(new SubClassType1());
		
		processList(subClassType1List);

	}
	
	private void processList(List<? extends SuperClass> l) {
		
		for(SuperClass c : l) {
			c.classMethod();			
		}	
	}
	
	private void addSuperClassToList(List<? super SuperClass> l) {
		
		l.add(new SuperClass());
	}
	private void addSubClassType1ToList(List<? super SuperClass> l) {
		
		l.add(new SubClassType1());
	}
	private void addSubClassType2ToList(List<? super SuperClass> l) {
		
		l.add(new SubClassType2());
	}
	
	class SuperClass {
		
		void classMethod() {			
			System.out.println("Method in super class");
		}
	}
	
	class SubClassType1 extends SuperClass{
		
		@Override
		void classMethod() {			
			System.out.println("Method in sub class type 1");
		}
	}
	
	class SubClassType2 extends SuperClass{
		
		@Override
		void classMethod() {			
			System.out.println("Method in sub class type 2");
		}
	}
	
	class NonInheritedCLass {
		
		void classMethod() {			
			System.out.println("Method in non-inherited class");
		}
	}
}
