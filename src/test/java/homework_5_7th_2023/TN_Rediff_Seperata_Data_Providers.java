package homework_5_7th_2023;

import org.testng.annotations.DataProvider;

public class TN_Rediff_Seperata_Data_Providers {

	@DataProvider(name = "dataForTN")
	public static Object[][] getNinjaData(){
		Object[][] data = {{"cnonur@yahoo.com", "onur@123"},
				                     {"cnonur@hotmail.com", "onur@124"},
				                     {"cnonur@gmail.com", "onur@125"}};
		return data ;
	}	
		
		@DataProvider(name = "dataForRediff")
		public static Object[][] getRediffData(){
			Object[][] data =  {{"cnonur@yahoo.com", "onur@123"},
                                         {"cnonur@hotmail.com", "onur@124"}};
			
			return data;
		
		
		}
				
				
	}
	
