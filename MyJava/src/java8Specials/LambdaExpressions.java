package java8Specials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

	public static void main(String[] args) {
		List<String> name1 = new ArrayList<String>();
		name1.add("Mango");
		name1.add("Apple");
		name1.add("Cherry");
		name1.add("Berry");
		List<String> name2 = new ArrayList<String>();
		name2.add("Orange");
		name2.add("Apple");
		name2.add("Mulberry");
		name2.add("Berry");	
	
	name1.forEach ((n)-> {System.out.println(n);}); // just print the contents like a forloop
	Collections.sort(name1,(s1,s2)->s1.compareTo(s2));
	System.out.print("Now its sorted Array"+name1);
	
	/*Where Drawable is an interface
	 Drawable d=new Drawable(){  public void draw(){System.out.println("Drawing "+width);}  d.draw();
     Drawable d2=()->{     System.out.println("Drawing "+width); }; d2.draw();
    */
 	
	 List<Product> list=new ArrayList<Product>();      
     //Adding Products  
     list.add(new Product(1,"HP Laptop",25000f));  
     list.add(new Product(3,"Keyboard",300f));  
     list.add(new Product(2,"Dell Mouse",150f)); 
     
     Collections.sort(list,(p1,p2)-> p1.name.compareTo(p2.name));
     for(Product p:list) {
    	 System.out.println(p.id+","+p.name+","+p.price);
     }
       
     
     
	}
	}
