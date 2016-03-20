package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Cyprian Kamil Norwid","Pigmalion"));
		bookList.add(new Book("Adam Mickiewicz","Gra¿yna"));
		bookList.add(new Book("Juliusz S³owacki","Balladyna"));
		
		
		for (Book b : bookList){
			System.out.println(b.getAuthor()+" "+b.getTitle());
		}
		
		Collections.sort(bookList);
		System.out.println("==================");
		for (Book b : bookList){
			System.out.println(b.getAuthor()+" "+b.getTitle());
		}

		Collections.sort(bookList,new BookTitleComparator());
		System.out.println("==================");
		for (Book b : bookList){
			System.out.println(b.getAuthor()+" "+b.getTitle());
		}
		
		Collections.sort(bookList,Book.comparatorByAuthorAlphabethicallyDesc());
		System.out.println("==================");
		for (int i=0; i<bookList.size(); i++ ){
			Book b= bookList.get(i);
			System.out.println( i+ ": "+ b.getAuthor()+" "+b.getTitle());
		}
		
		System.out.println("=====ZBIORY=====");
		Set<Book> bookSet = new HashSet<>();
		bookSet.addAll(bookList);
		bookSet.add(new Book("Adam Mickiewicz","Gra¿yna"));
		for (Book b : bookSet){
			System.out.println(b.getAuthor()+" "+b.getTitle());
			System.out.println(b);
		}
		System.out.println("==================");
		Iterator<Book> it = bookSet.iterator();
		while(it.hasNext()){
			Book b = it.next();
			if (b.equals(new Book("Juliusz S³owacki","Balladyna"))){
				it.remove();
			}
			else System.out.println(b.getAuthor()+" "+b.getTitle());
		}
		System.out.println(bookSet.size());
		
		System.out.println("=====MAPY=====");
		Map<Book,String> bookMap = new HashMap<>();
		bookMap.put(new Book("Cyprian Kamil Norwid","Pigmalion"),"BU£");
		bookMap.put(new Book("Adam Mickiewicz","Gra¿yna"),"BU£");
		bookMap.put(new Book("Juliusz S³owacki","Balladyna"),"BU£");
		bookMap.put(new Book("Bruce Eckel","Thinking in Java"),"BFIIS");
		bookMap.put(new Book("Bjarne Stroustrup","Jêzyk C++"),"BFIIS");
		for (Book b : bookMap.keySet()){
			System.out.println(b.getAuthor()+" "+b.getTitle() + " :: "+
					bookMap.get(b));
		}
		
		Map<String,Set<Book>> libMap = new HashMap<>();
		for (Book b : bookMap.keySet()){
			String lib = bookMap.get(b);
			if (libMap.containsKey(lib)){
				Set<Book> set = libMap.get(lib);
				set.add(b);
			}
			else{
				Set<Book> set = new HashSet<>();
				set.add(b);
				libMap.put(lib, set);
			}
		}
		
		for (String lib : libMap.keySet()){
			Set<Book> set = libMap.get(lib);
			System.out.println(lib);
			for (Book b : set){
				System.out.println("\t"+b.getAuthor()+" "+b.getTitle());
			}
			
		}

		
	}

}
