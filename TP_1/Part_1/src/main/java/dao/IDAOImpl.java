package dao;
import org.springframework.stereotype.Component;

@Component
public class IDAOImpl implements IDAO {
    @Override
    public double getdata() {
        System.out.println("version base de données");
        double data=34;
        return data;
    }
}
