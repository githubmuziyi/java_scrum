package muzi.obj.dao.impl;

import muzi.obj.dao.StudentDao;

/**
 * Created by muzi on 2017/10/6.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public void regist() {
        System.out.println("regist");
    }
}
