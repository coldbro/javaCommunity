package Proxy;

public class UserDaoImpl implements  UserDao {
    @Override
    public void delete() {
        System.out.println("删除数据");
    }
}
