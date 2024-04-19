package service;

import java.util.*;
import java.util.Map;

import model.Hotel;
import model.RoomType;
import model.Rooms;
import storage.HotelStorage;
import model.*;
public class HoteService {
    
	
	
	Map<String,Hotel> allHotels= HotelStorage.getAllHotels();
	public void addHotel(String name, String address, List<Rooms> rooms) {
		allHotels.put(allHotels.size()+"", new Hotel(allHotels.size()+"", name, address, rooms));
	}
	public void addRoom(String hId, Rooms room) {
		if(allHotels.containsKey(hId)) {
			Hotel currentHotel= allHotels.get(hId);
			currentHotel.getRoomsList().add(room);
		}
	}
	public List<Hotel> searchHotel(String address, String availableRoomType, int persons){
		int rooms= persons/2!=0? persons/2: 1;
		for(String key: allHotels.keySet()) {
           //			
		}
		return new ArrayList<>();
	}
}
