package by.bntu.fitr.povt.task20.dao;

import by.bntu.fitr.povt.task20.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task20.dao.impl.UserDAO;
import by.bntu.fitr.povt.task20.pojos.Employee;

/**
 * Created by Alexey Druzik on 29.08.2019.
 */
public class DAOMaker implements IDAOFactory {

	public IDAOUser<Employee> getDAOUser() {
		return new UserDAO();
	}
	
}
