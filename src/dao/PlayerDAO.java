package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	
	public List<Player> getAllPlayers(int player_id) throws Exception {
		List<Player> list=new ArrayList<Player>();
		String player ="Select player_p.id, player_p.name, skill_s.id,skill_s.name from player_p inner join skill_s on skill_s.id = player_p.id";
//				"SELECT ID,NAME,COUNTRY,S.ID,SKILLNAME FROM PLAYER_P P INNERJOIN SKILL_S S ON SKILL_S.ID = PLAYER_P.ID";
//		Player players=null;
//		 PreparedStatement stmt = ConnectionManager.getConnection().prepareStatement(player);
//		 ResultSet resultSet = stmt.executeQuery();
//		 
//		 while(resultSet.next()){
//			 if(player_id==resultSet.getInt("ID"))
//				{
//
//				Long ids = resultSet.getLong("ID");
//				String names = resultSet.getString("NAME");
//				System.out.println(ids);
//				System.out.println(names);
//				skill = new Skill(ids, names);
//		 }
		 
		Connection cn=null;
		try {
			cn=ConnectionManager.getConnection();
			Statement st=cn.createStatement();
			ResultSet resultset =st.executeQuery(player);
			
			while(resultset.next()) {
				Long playerId=resultset.getLong("ID");
				String name=resultset.getString("NAME");
				String country=resultset.getString("COUNTRY");
				Long skillid =resultset.getLong("ID");
				String skillName=resultset.getString("NAME");
				Skill skill=new Skill(skillid, skillName);
				
				Player pr=new Player(playerId, name, country, skill);
				list.add(pr);
			}
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
}
