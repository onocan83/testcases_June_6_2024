package homework_java;

abstract class SoccerTeams{
	
		String name;
		String name2;

		public abstract void display();
		
		public void showme(){

		System.out.println("Fenerbahce");

		}

		}



		
		
class TrTeams  extends SoccerTeams { 

		TrTeams(String name, String name2){
		
		this.name="Fenerbahce";
		this.name2="Galatasaray";
		
		}

		public void display(){
		System.out.println(name + "is bigger than" + name2);

		}
		 public void showme(){
		System.out.println("Fener daha buyuk");
		 }
	

		public static void main (String[] args){

		TrTeams tm= new TrTeams("Fenerbahce", "Galatasaray");
		tm.showme();
		tm.display();



		}

		}




		

		 

