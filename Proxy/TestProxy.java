package Proxy;

public class TestProxy {
    public static void main(String[] args) {
        UserDao dao =new UserDaoImpl();
        dao.delete();
        UserDao proxy= new UserProxy(dao);
//        proxy.delete();
    }
}
