package Data;

import androidx.room.Database;

import Model.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDatabase {
}
