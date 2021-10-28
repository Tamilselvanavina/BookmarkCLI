import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.*;



public class BookmarkCLI{
	public static void main(String args[]) throws IOException{
		int list=0;	
		HashMap<String,HashMap> blist = new HashMap<>(); // Hashmap that stores the listname and their correcponding bookmarkList or hashMap
		String targetlist;
		String listname;
		while(list==0){ 
			System.out.println("Enter the name of the bookmarkList:");
			Scanner sc2 = new Scanner(System.in);
			listname = sc2.nextLine();
			HashMap<String,URL> map = new HashMap<>(); // hashMap that stores the bookmark and their names
			blist.put(listname,map);	// adding the listname and their correcponding map in the List hashmap
			int n=0;
					while(n==0){
						
						Scanner sc = new Scanner(System.in);
						
						
					
							System.out.println("enter the url:");
							String urlString;
							
							String s1 = new String();	
							s1=sc.nextLine();
							
							 System.out.println("enter the bookmarkname:");
							 String name1 = new String();
							 name1 = sc.nextLine();
							if(s1.contains("http")){
								urlString =s1;	
								URL url = new URL(urlString);
								map.put(name1,url); // adding the address and their correcponding address in the map of current list
								System.out.println("Bookmark added successfully");
							}else{
								throw new IOException("invalid url!!!"); // throws exception when url is invalid
							}
							System.out.println("When you finish adding the bookmarks in the list enter 1,to add another bookmark enter 0:");
							n=sc.nextInt();
					}
			System.out.println("To create a new bookmarklist enter 0,otherwise enter 1:");
			Scanner sc3 = new Scanner(System.in);
			list=sc3.nextInt();
		
		}
		
		
		System.out.println();
		System.out.println("Enter the bookmarkList name tag to be found:");
		Scanner sc4 = new Scanner(System.in);
		targetlist=sc4.nextLine(); // geting the target bookmark List name
		HashMap resultmap = blist.get(targetlist); 
		
			System.out.println("BookmarkList:"+resultmap);
		
		
		
	}
}