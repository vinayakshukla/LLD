package storage;
import java.util.*;

import model.Hotel;
public class HotelStorage {
   
	private static Map<String,Hotel> hotels;
	
	public static Map<String,Hotel>  getAllHotels(){
		if(hotels==null) {
			return new HashMap<>();
		}
		return hotels;
	}
}
