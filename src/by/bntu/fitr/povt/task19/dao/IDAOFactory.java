package by.bntu.fitr.povt.task19.dao;

import by.bntu.fitr.povt.task19.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task19.pojos.Employee;

/**
 * Created by Alexey Druzik on 29.08.2016.
 */
public interface IDAOFactory {
	IDAOUser<Employee> getDAOUser();

}
