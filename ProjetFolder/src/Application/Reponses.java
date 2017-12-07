package Application;

public class Reponses{
    final int TAILLEDIALOGUE = 5;
    final int NBREPONSE = 3;


    /***Tableau de Toutes les réponses de L'UTILISATEUR ***/
    private String[][] tabReponsesUtil = new String[TAILLEDIALOGUE][NBREPONSE];

    /***Tableau de Toutes les réponses du BOT ***/
    private String[] tabReponsesBot = new String[TAILLEDIALOGUE];

    private String DerniereReponse;

    private int serieMauvaiseReponse = 0;



    public Reponses(){

        /***Initialisation des Tableau de Réponses du BOT et de l'UTILISATEUR***/
        InitReponsesUtil();
        InitReponsesBot();
    }

    public void reponseChoisi(int i){
        switch (i){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }

    public boolean testMauvaiseBonne(){

    }

    public boolean testArretSerieMauvaise(){
        return serieMauvaiseReponse>3;
    }


    public String[][] getTabReponsesUtil() {
        return tabReponsesUtil;
    }

    public String[] getTabReponsesBot() {
        return tabReponsesBot;
    }

    private void InitReponsesUtil()
    {
        // TODO init Les Réponses de l'utilisateur
    }

    private void InitReponsesBot()
    {
        // TODO init Les Réponses du bot
    }

}
