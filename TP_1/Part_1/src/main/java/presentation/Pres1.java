package presentation;

import dao.IDAOImpl;
import metier.IMetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDAOImpl dao=new IDAOImpl();
        IMetierImpl metier =new IMetierImpl(dao);
        metier.setDao(dao); //injection des dépendances
        System.out.println("RES="+metier.calcul());
    }
}
