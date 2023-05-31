package metier;
import dao.IDAO;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    private IDAO dao ; //couplage faible

    public IMetierImpl(IDAO dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double data= dao.getdata();
        double res=data*11.6;
        return res;
    }
/**
 * pour permettre d'injecter dans la variable dao
 * un objet d'une classe qui implémente l'interface IDAO

        */
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
