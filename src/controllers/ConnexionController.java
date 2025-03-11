package controllers;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.sql.SQLException;

import controllers.FAccueilController;
import models.ConnexionDAO;
import models.User;
import models.UserDao;
import views.FAccueilView;
import views.FConnexionView;
public class ConnexionController {
	
	private ConnexionDAO connexion = new ConnexionDAO ("localhost","root","" ,"aichi") ;
	private FConnexionView view ; 
	private UserDao userDao = new UserDao() ;
	  
	public ConnexionController(FConnexionView view) {
		this.view = view ;
		
		view.addValiderListener(new ActionListener() {

			private boolean isValid;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = view.getLogin();
				String password = view.getMotDePasse();
				
				User user = new User(username,password);
				try {
					System.out.println(userDao.test());
					 isValid = UserDao.verifyUser(user);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if( isValid == false) {
					view.showMessage("Nom utilisateur ou mots de passe invalide");
				}else {
					FAccueilView view = new FAccueilView();
					new FAccueilController(view);
					view.setVisible(true);
				}
				
				
				
				
				
				
			}});
		//addQuitterListener
		view.addQuitterListener(new ActionListener() {

			//private boolean isValid;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				view.fermerFenetre();

							
				
			}});		
	}
	

	
	
	

}
