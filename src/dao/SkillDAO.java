package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public Skill getSkillBylD(int skill_id) throws SQLException, Exception{
		
		
		String skills="select * from skill_s";
		Skill skill=null;
		 PreparedStatement stmt = ConnectionManager.getConnection().prepareStatement(skills);
		 
		 ResultSet resultSet = stmt.executeQuery();
		while(resultSet.next()) 
		{
			if(skill_id==resultSet.getInt("ID"))
			{

			Long ids = resultSet.getLong("ID");
			String names = resultSet.getString("NAME");
			System.out.println(ids);
			System.out.println(names);
			skill = new Skill(ids, names);
			}
		
		}
		  
		   return skill;
		   
	   }
}
