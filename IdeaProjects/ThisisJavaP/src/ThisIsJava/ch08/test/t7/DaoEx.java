package ThisIsJava.ch08.test.t7;

public class DaoEx {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new MySqlDao());
        dbWork(new OracleDao());
    }
}
