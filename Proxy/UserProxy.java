package Proxy;

//代理类
public class UserProxy implements UserDao {
    private UserDao dao;

    public UserProxy() {
    }

    public UserProxy(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void delete() {
        System.out.println("开启事务");
        dao.delete();
        System.out.println("提交事务");
    }

}
