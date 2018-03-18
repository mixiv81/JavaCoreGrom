package Lesson11.APIandImplementation;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int countInd = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    countInd++;
                }
            }
        }

        Room[] apisRes = new Room[countInd];
        int count = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    apisRes[count] = room;
                    count++;
                }
            }
        }
        return apisRes;
    }


    public Room[] check(API api1, API api2) {
        int countInd = 0;
        for (int i = 0; i < api1.getAll().length; i++) {
            for (int k = 0; k < api2.getAll().length; k++) {
                if (api2.getAll()[i] != null && api1.getAll()[k] != null) {
                    if (api1.getAll()[i].getPrice() == api2.getAll()[k].getPrice() && api1.getAll()[i].getPersons() == api2.getAll()[k].getPersons()) {
                        if (api1.getAll()[i].getHotelName().equals(api2.getAll()[k].getHotelName()) && api1.getAll()[i].getCityName().equals(api2.getAll()[k].getCityName())) {
                       countInd++;
                        }
                    }
                }
            }
        }

        Room[] resultRoom = new Room[countInd];
        for (int i = 0; i < api1.getAll().length; i++) {
            for (int k = 0; k < api2.getAll().length; k++) {
                if (api2.getAll()[i] != null && api1.getAll()[k] != null) {
                    if (api1.getAll()[i].getPrice() == api2.getAll()[k].getPrice() && api1.getAll()[i].getPersons() == api2.getAll()[k].getPersons()) {
                        if (api1.getAll()[i].getHotelName().equals(api2.getAll()[k].getHotelName()) && api1.getAll()[i].getCityName().equals(api2.getAll()[k].getCityName())) {
                            resultRoom[i] = api1.getAll()[i];
                        }
                    }
                }
            }
        }
        return resultRoom;
    }
}
