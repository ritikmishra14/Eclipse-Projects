package car_Showroom;

public class QueriesForDb {
	
  static String insertIntoShowroom="INSERT INTO showroom "
  		+ " VALUES (?,?,?,?,?); ";
  static String updateShowroomDetail="UPDATE showroomdetails SET ?"
  		+ " WHERE ?";
  static String deleteShowroomDetails="DELETE FROM showroomdetails WHERE ?";
  
  
  // read data queries.
  static String readAllShowroom="SELECT *FROM showroom";
  static String readAllEmplyoee="SELECT *FROM emplyoees";
  static String readAllCar="SELECT *FROM cars";
		  
}
