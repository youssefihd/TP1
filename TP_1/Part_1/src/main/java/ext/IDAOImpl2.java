package ext;

import dao.IDAO;

public class IDAOImpl2 implements IDAO {
    @Override
    public double getdata() {
        System.out.println("version web service");
        double data=20;
        return data;
    }
}
