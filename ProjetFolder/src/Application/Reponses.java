package Application;

public class Reponses{
    final int TAILLEDIALOGUE = 5;
    final int NBREPONSE = 3;


    /***Tableau de Toutes les réponses de L'UTILISATEUR ***/
    private String[][] tabReponsesUtil = new String[TAILLEDIALOGUE][NBREPONSE];

    /***Tableau de Toutes les réponses du BOT ***/
    private String[][] tabReponsesBot = new String[TAILLEDIALOGUE+1][NBREPONSE];

    private String DerniereReponse;

    private int serieMauvaiseReponse = 0;
    private int ReponsePrec;




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

    public void setReponsePrec(int i){
        ReponsePrec =i;
    }

    public int getReponsePrec(){
        return ReponsePrec;
    }

    public boolean testMauvaiseBonne(int i){
        return
    }

    public boolean testArretSerieMauvaise(){
        return serieMauvaiseReponse>3;
    }


    public String[][] getTabReponsesUtil() {
        return tabReponsesUtil;
    }

    public String[][] getTabReponsesBot() {
        return tabReponsesBot;
    }

    private void InitReponsesUtil()
    {
        // TODO init Les Réponses de l'utilisateur
        tabReponsesUtil[0][0] = "Ah ouais, tu te mets bien toi ! Fais attention en rentrant...Enfin au pire restes là bas non ?";
        tabReponsesUtil[0][1] = "Tu t’amuses bien ? Dommage que je sois pas là :D";
        tabReponsesUtil[0][2] = "Trop cool ! J’aurais aimé être là… Lève ton verre en mon nom x)";

        tabReponsesUtil[1][0] = "Euuhhh… je sais pas si c’est une bonne idée.. tu devrais plutot rester dormir !";
        tabReponsesUtil[1][1] = "C’est chaud non ? T’es vraiment bourré non ?";
        tabReponsesUtil[1][2] = " Gagne un vodka pong contre Thomas pour moi !";

        tabReponsesUtil[2][0] = "Mec, tu devrais rester dormir là bas… Au pire prends un UBER";
        tabReponsesUtil[2][1] = "mec tu geres pas… t’es bourré hein x)";
        tabReponsesUtil[2][2] = "tu rentres bientot ? tu feras chauffer le moteur !!";

        tabReponsesUtil[3][0] = "fais un petit effort mec.. pense aux consequences";
        tabReponsesUtil[3][1] = "Alex, essaye de pas faire le con non plus..";
        tabReponsesUtil[3][2] = "jsuis sur en voiture tu vas lentement..on parie ? :)";

        tabReponsesUtil[4][0] = "franchement demande à dormir… ils vont pas dire non et puis j’ai pas envie qu’il t’arrive quelque chose";
        tabReponsesUtil[4][1] = "jte fais confiance mais fait le bon choix ";
        tabReponsesUtil[4][2] = "t’en fais pas, jte connais tu conduis mieux quand t’es bourré ;)";


    }

    private void InitReponsesBot()
    {
        // TODO init Les Réponses du bot

        tabReponsesBot[0][0] = "Heyyyyyy, tu va bien ??? C’est le feu ! bon par contre je suis vraiment bourré… ";
        tabReponsesBot[0][1] =  tabReponsesBot[0][0];
        tabReponsesBot[0][2] =  tabReponsesBot[0][0];

        tabReponsesBot[1][0] = "ouais je sais pas si je devrais rester..J’avais prévu de rentrer !";
        tabReponsesBot[1][1] = "ca aurait été cool en effet… j’espere juste que tu viendras la prochaine fois ! Meme si t’es pas la, la fete continue hein !";
        tabReponsesBot[1][2] = " allé un de plus !! pour la route !";

        tabReponsesBot[2][0] = "ouais, je sais pas si j’ai toute ma tête… Mais je passe un bon moment j’ai pas envie de le terminer tout de suite !!";
        tabReponsesBot[2][1] = "jsuis assez bourré… mais ça va je GERE";
        tabReponsesBot[2][2] = "jsuis a fond maintenant ! la fete que commencer !";

        tabReponsesBot[3][0] = "mouais ca coute cher apres.. j’habite loin";
        tabReponsesBot[3][1] = "apres meme bourré on peut conduire facile !";
        tabReponsesBot[3][2] = "euuuuuh, j’ai ma voiture et je suis chaud pour aller à fond !";

        tabReponsesBot[4][0] = "mais je sais pas si je peux squatter comme ca… tu penses c’est une bonne idée ?";
        tabReponsesBot[4][1] = "je sais ce que je fais oublie pas que je suis le meilleur ! fais moi confiance";
        tabReponsesBot[4][2] = " hate de rouler a FOND sur la route !";

        tabReponsesBot[5][0] = "ouai, jvais rester je pense… je leur demande et jtenvoi un sms apres !";
        tabReponsesBot[5][1] = "tu sais quoi, jvois et jte dis, a tout a lheure";
        tabReponsesBot[5][2] = "t’inquiete jsuis chaud en voiture… je vais rentrer en voiture du coup !";


    }

}
