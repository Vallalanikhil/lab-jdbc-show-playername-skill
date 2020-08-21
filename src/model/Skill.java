package model;

public class Skill{
	private Long skillid;
	private String skillName;
	 
	 public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(Long skillid, String skillName) {
		
		this.skillid = skillid;
		this.skillName = skillName;
	}
	 
	 public Long getSkillid() {
		return skillid;
	}
	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skill [skillid=" + skillid + ", skillName=" + skillName + "]";
	}
	
}
