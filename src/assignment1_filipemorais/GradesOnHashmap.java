package assignment1_filipemorais;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class GradesOnHashmap {


	public class GradesCalculater {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i = 0; i < s; i++) {
	String name = sc.next();
	int number = sc.nextInt();
	hm.put(name, number);
	}
	TreeMap<String, String> tm = new TreeMap<String, String>();
	tm = display(hm);
	Iterator<String> it = tm.keySet().iterator();
	for (int i = 0; i < s; i++) {
	String n = it.next();
	String fac = tm.get(n);
	System.out.println(n);
	System.out.println(fac);
	}
	}
	public static TreeMap<String, String> display(HashMap<String, Integer> hm) {
	TreeMap<String, String> tm = new TreeMap<String, String>();
	Iterator<String> it = hm.keySet().iterator();
	while (it.hasNext()) {
	String id = it.next();
	int mark = hm.get(id);
	if (mark >= 60) tm.put(id, "PASS");
	else if(mark < 60) tm.put(id, "FAIL");
	else tm.put(id, "FAIL");
	}
	return tm;
	}
	}

}
