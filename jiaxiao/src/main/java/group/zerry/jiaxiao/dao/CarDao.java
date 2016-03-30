package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Car;

public interface CarDao {
	Car[] selectCarsInRest(String date);

}
