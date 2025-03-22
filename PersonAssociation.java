class VoterID{
  
  private int voterIdNum;
  
  public int getVoterIdNum(){
    return voterIdNum;
  }
  
  public void setVoterIdNum(int voterIdNum){
    this.voterIdNum=voterIdNum;
  }
}

class Person{
	private String per_name;
	private VoterID voterid; //contains an instance of another class(voter id) using a variable.
  
	public String getName(){
		return per_name;
	}
  
	public void setName(String per_name){
		this.per_name=per_name;
	}

	public VoterID getVoterIdNum(){
		return voterid;
	}

	public void setVoterIdNum(VoterID voterid){
		this.voterid= voterid;
	}
}

public class PersonAssociation{
  public static void main(String[] args){
    Person person= new Person();
    person.setName("Praga"); //setting person name
    String name=person.getName(); //getting person name
	
	VoterID vid= new VoterID();
	vid.setVoterIdNum(12345);
	person.setVoterIdNum(vid);

	int voterid=person.getVoterIdNum().getVoterIdNum();
	System.out.println("Person Name: "+name);
	System.out.println("Voter ID Number: "+voterid);
    
	}

}
