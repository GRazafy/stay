package Application;

public class Reponses{
    final int TAILLEDIALOGUE = 5;
    final int NBREPONSE = 3;



    String[][] tabReponsesUtil = new String[TAILLEDIALOGUE][NBREPONSE];
    String[] tabReponsesBot = new String[TAILLEDIALOGUE];




    public Reponses(){
        
    }


    public String[][] getTabReponsesUtil() {
        return tabReponsesUtil;
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
