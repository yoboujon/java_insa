package partie4;

import java.util.ArrayList;
import java.util.Date;

/**
 * La classe <code>Voiture</code> possède une liste statique interne de voiture.
 * Pour créer une voiture il suffit de donner une <code>vitesse</code> d'origine.
 * Attention à modifier la puissance, elle est réglée à 10 à la création de la classe. Ce qui peut empêcher une accélération trop brutale.
 * Le nom et la date de création ne sont pas initialisée au début.
 * La voiture est à l'arrêt à sa création
 * @author Yohan Boujon
 * @version 1.0
 */
public class Voiture {
    int puissance = 10;
    double vitesse = 0;
    boolean estDemarre = false;
    String nom;
    Date dateCreation;

    private static ArrayList<Voiture> listeVoitures = new ArrayList<Voiture>();

    /**
     * Permet de construire une voiture avec une <code>vitesse</code> v donnée.
     * @param v (vitesse)
     */
    public Voiture(double v) {
        this.vitesse = v;
        listeVoitures.add(this);
    }

    /**
     * Retourne la <code>vitesse</code> (double) de la <code>Voiture</code>
     * @see partie4.Voiture#accelere(double)
     * @return vitesse
     */
    public double getVitesse() {
        return this.vitesse;
    }

    /**
     * Retourne la <code>puissance</code> (int) de la <code>Voiture</code>
     * @see partie4.Voiture#setPuissance(int)
     * @see partie4.Voiture#accelere(double)
     * @see partie4.Voiture#demarre(int)
     * @return puissance
     */
    public int getPuissance() {
        return this.puissance;
    }

    /**
     * Retourne la liste statique de <code>Voitures</code>
     * @return liste de voitures
     */
    public static ArrayList<Voiture> getListeVoitures() {
        return listeVoitures;
    }

    /**
     * Retourne le <code>nom</code> (String) de la <code>Voiture</code>
     * @see partie4.Voiture#setNom(String)
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne <code>true</code> si la <code>Voiture</code> est démarrée, <code>false</code> sinon.
     * @see partie4.Voiture#demarre()
     * @return estDémarrée
     */
    public boolean isDemarre() {
        return this.estDemarre;
    }

    /**
     * Retourne la <code>date</code> (Date) de la <code>Voiture</code>
     * @see partie4.Voiture#setDate(Date)
     * @return date
     */
    public Date getDate() {
        return this.dateCreation;
    }

    /**
     * Permet de régler la <code>puissance</code> (int) de la <code>Voiture</code>.
     * @see partie4.Voiture#accelere(double)
     * @see partie4.Voiture#demarre(int)
     * @param p (puissance)
     */
    public void setPuissance(int p) {
        this.puissance = p;
    }

    /**
     * Permet d'augmenter la <code>vitesse</code> de +<code>a</code>.
     * <br>Il faut que l'accélération + la vitesse soit inférieur à la <code>puissance</code>
     * <ul>
     * <li>Si elles sont inférieures ou égales à la puissance, alors la <code>vitesse</code> sera modifiée</li>
     * <li>Dans le cas contraire, le programme renverra une erreur à la sortie.</li>
     * </ul>
     * @param a (acceleration)
     */
    public void accelere(double a) {
        if ((a + this.vitesse) <= this.puissance) {
            this.vitesse += a;
        } else {
            System.out.println("La vitesse(" + (a + this.vitesse) + ") voulue est supérieure à la puissance("
                    + this.puissance + ").");
        }
    }

    /**
     * Permet de régler le <code>nom</code> (String) de la <code>Voiture</code>.
     * @param n (nom)
     */
    public void setNom(String n) {
        this.nom = n;
    }

    /**
     * Permet démarrer la <code>Voiture</code>. Force la valeur <code>estDemarre</code> à <code>true</code>.
     * <br> Il est possible de démarrer avec une vitesse donnée.
     * @see partie4.Voiture#demarre(int)
     */
    public void demarre() {
        this.estDemarre = true;
    }

    /**
     * Permet de démarrer la <code>Voiture</code>, mais cette fois-ci avec une vitesse donnée.
     * La vitesse ne doit pas dépasser la puissance donnée.
     * @see partie4.Voiture#accelere(double)
     * @see partie4.Voiture#demarre()
     * @param v (vitesse initiale)
     */
    public void demarre(int v) {
        if (v <= this.puissance) {
            this.vitesse = v;
            this.estDemarre = true;
        } else {
            System.out.println("La vitesse(" + v + ") est supérieure à la puissance(" + this.puissance + ").");
        }
    }

    /**
     * Permet de choisir la <code>date</code> de création de la <code>Voiture</code>
     * @param d (date)
     */
    public void setDate(Date d)
    {
        this.dateCreation = d;
    }
}
