package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	public static void main(String[] args) throws Exception {
		System.out.println("output :");
		PlayerDAO playerdao=new PlayerDAO();
		SkillDAO skilldao=new SkillDAO();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter skill id :");
         int skill_id=Integer.parseInt(br.readLine());
         
		Skill sk=skilldao.getSkillBylD(skill_id);
		
		System.out.println(sk);
		
	    System.out.println("enter player id :");
		int player_id =Integer.parseInt(br.readLine());
		
		List<Player> list=playerdao.getAllPlayers(player_id );
		
		System.out.println(list.toString());
//		List<Player> list = playerdao.getAllPlayers();
//		
//		System.out.println(list.toString());
	}
}
