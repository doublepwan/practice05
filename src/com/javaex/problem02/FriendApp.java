package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	System.out.println("친구를 3명 등록해 주세요");
    	for(int i=0; i<3; i++) {
    		String fri = sc.nextLine();
    		String[] data = fri.split(" ");
    		
    		Friend friend = new Friend();
			friend.setName(data[0]);
			friend.setHp(data[1]);
			friend.setSchool(data[2]);

			// 배열에 추가하기
			fList.add(friend);
    	}
    	
    	for (int i = 0; i < fList.size(); i++) {
    		fList.get(i).showInfo();
		}

		sc.close();
       
    }

}
