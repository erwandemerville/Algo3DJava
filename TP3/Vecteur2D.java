package TP3;


/**
 * Write a description of class Vecteur2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vecteur2D
{
    // Atributs de la classe
    private float m_u=0.0f, m_v=0.0f;

    /**
     * Le constructeur par d�faut initialise
     * les deux composants du vecteur � z�ro
     */
    public Vecteur2D()
    {
        // initialise instance variables
        m_u = 0.0f;
        m_v = 0.0f;
    }

    /**
     * Ce constructeur prend deux param�tres :
     * les valeurs qui seront assign�es aux composantes
     * m_u et m_v de l'instance de Vecteur2D
     * 
     * @param _u la valeur de la composante u du vecteur
     * @param _v la valeur de la composante v du vecteur
     */
    public Vecteur2D(float _u, float _v)
    {
        m_u = _u;
        m_v = _v;
    }
    
     /**
     * Cette m�thode ajoute au vecteur courant le
     * vecteur pass� en param�tre. Les composantes du
     * vecteur pass� en param�tre sont ajout�e aux
     * composantes du vecteur repr�sent� par l'instance courante
     * 
     * @param _vec vecteur � ajouter � l'instance courante
     */
    public void add(Vecteur2D _vec)
    {
        m_u = _vec.getU();
        m_v = _vec.getV();
    }
    
     /**
     * accesseur pour la composante u
     * @return la valeur de la composante u
     */
    public float getU()
    {
        return m_u;
    }
    
     /**
     * accesseur pour la composante v
     * @return la valeur de la composante v
     */
    public float getV()
    {
        return m_u;
    }
    
     /**
     * mutateur pour la composante u
     * @param _u la valeur de la composante u
     */
    public void setU(float _u)
    {
        this.m_u = _u;
    }
    
     /**
     * mutateur pour la composante v
     * @param _v la valeur de la composante v
     */
    public void setV(float _v)
    {
        this.m_v = _v;
    }
    
     /**
     * Cette m�thode retourne la norme du vecteur, c'est �
     * dire la racine carr�e de la somme de carr�s des deux
     * composantes du vecteur
     */
    public float getMagnitude()
    {
        return (float)Math.sqrt(m_u*m_u + m_v*m_v);
    }
}
