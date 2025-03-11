import models.ConnexionDAO;
import models.User;
import models.UserDao;

import java.sql.SQLException;

import controllers.FAccueilController;
import controllers.ConnexionController;
import views.FAccueilView;
import views.FConnexionView;
public class Main {

    //private static boolean isValid;

    public static void main(String[]args) {
        FConnexionView view = new FConnexionView();
        ConnexionDAO connexion = new ConnexionDAO("localhost","root","" ,"aichi");
        //new Controller(null, view, null);
        //view.setVisible(true);
        //FAccueilView viewAccueil = new FAccueilView();
        //viewAccueil.setVisible(true);


        //TEST CONNEXION
        if (connexion.testConnection()) {
            new ConnexionController(view);
            view.setVisible(true);
        } else {
            System.out.println("Erreur : Impossible de se connecter à la base de données.");
            view.showMessage("Connexion à la base de données échouée. Vérifiez les paramètres.");
        }

        view.setVisible(true);

    }
}
