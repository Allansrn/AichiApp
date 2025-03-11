package controllers;

import views.FAccueilView;
import views.FArticlesView;
import views.FClientsView;
import views.FCommandesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAccueilController {
    private FAccueilView view;

    public FAccueilController(FAccueilView view) {
        this.view = view;
        initController();
    }
    

    private void initController() {
        view.addQuitterListener(new QuitterListener());
        view.addArticlesListener(new ArticlesListener());
        view.addClientsListener(new ClientsListener());
        view.addCommandesListener(new CommandesListener());;
    }

    class QuitterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
    	
    	
    	
    }
    
    class ArticlesListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.setInfoText("Affichage des Articles");
			afficherArticles();
		}
    	
    	
    	
    }
    
    class ClientsListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.setInfoText("Affichage des Clients");
			afficherClients();
		}
    	
    	
    	
    }
    
    class CommandesListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.setInfoText("Affichage des Commandes");
			afficherCommandes();		}
    	
    	
    	
    }
    
    /*private void quitterApplication() {
        System.exit(0);
    }*/

    private void afficherArticles() {
        // Logique pour afficher la vue des articles
        System.out.println("Affichage des articles");
        FArticlesView articlesView = new FArticlesView(this);
        articlesView.setVisible(true);
        FArticlesController controller = new FArticlesController(articlesView);
        controller.initController();
        
        
    }

    private void afficherClients() {
        FClientsView clientsView = new FClientsView();
        clientsView.setVisible(true); // Affiche la vue
        FClientController clientsController = new FClientController(clientsView);
        clientsController.initController(); // Initialise les événements et la logique
    }

    private void afficherCommandes() {
        FCommandesView commandesView = new FCommandesView(view);
        commandesView.setVisible(true); // Affiche la vue
        FCommandesController commandesController = new FCommandesController(commandesView);
        commandesController.initController(); // Initialise les événements et la logique
    }
}
