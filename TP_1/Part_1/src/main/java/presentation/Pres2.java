package presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
       // IDAOImpl dao=new IDAOImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDAO dao=(IDAO) cDao.getConstructor().newInstance(); //new DaoImpl
        System.out.println(dao.getdata());

       // IMetierImpl metier =new IMetierImpl();
        String metierClassName=scanner.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.getConstructor().newInstance(); //new IMetierImpl

        // metier.setDao(dao); //statique
        Method setDao=cmetier.getDeclaredMethod("setDao",IDAO.class);
        setDao.invoke(metier,dao); //injection des dépendences dynamique
        System.out.println("RES="+metier.calcul());

    }
}
