package com.java.algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortByFrequency {
	
	public void sort(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		for(Integer s : list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(set);
		Collections.sort(ls, new FrequencyComparator());
		
		List<Integer> newList = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : ls) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
			for(int i=0; i<entry.getValue(); i++) {
				newList.add(entry.getKey());
			}
		}
		
		for(Integer num : newList) {
			System.out.println(num + ",");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(2);
		
		SortByFrequency sf = new SortByFrequency();
		sf.sort(list);
	}
}

class FrequencyComparator implements Comparator<Map.Entry<Integer, Integer>> {
	public int compare(Map.Entry<Integer, Integer> o1 , Map.Entry<Integer, Integer> o2) {
		if(o1.getValue() > o2.getValue()) {
			return 1;
		} else if (o1.getValue() < o2.getValue()) {
			return -1;
		} else {
			if(o1.getKey() > o2.getKey()) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
