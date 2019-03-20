package TP4;

import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;

/**
 * La classe LumierePonctuelle repr�sente une source de lumi�re ponctuelle.
 * Elle est d�finie par un point dans l'espace � partir duquel vont irradier
 * les rayons �mis par ceyye source lumineuse ponctuelle
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LumierePonctuelle extends Lumiere
{
    // Vecteur3D repr�sentant l'origine de la source lumineuse (appel� m_position)
     private float[] m_position = {0.0f,0.0f,0.0f,0.0f};
    
     /**
     * Constructeur de la classe LumierePonctuelle, il prend quatre arguments
     * @param _vecteurAmbiant composante ambiante de la lumi�re
     * @param _vecteurDiffus composante diffuse de la lumiere
     * @param _vecteurSpeculaire composante sp�culaire de la lumi�re
     * @param _position vecteur donnant la position de la lumi�re
     */
    public LumierePonctuelle(Vecteur3D _vecteurAmbiant, Vecteur3D _vecteurDiffus, 
                             Vecteur3D _vecteurSpeculaire, Vecteur3D _position)
    {
        super(_vecteurAmbiant, _vecteurDiffus, _vecteurSpeculaire);
        m_position[0] = _vecteurSpeculaire.getX();
        m_position[1] = _vecteurSpeculaire.getY();
        m_position[2] = _vecteurSpeculaire.getZ();
        m_position[3] = 1.0f;     
    }
    
    public LumierePonctuelle()
    {
        super();
        m_position[0] = 0.0f;
        m_position[1] = 0.0f;
        m_position[2] = 0.0f;
        m_position[3] = 1.0f;
    }

    /**
     * On initialise la valeur du vecteur de direction pour cette instance de classe 
     * de lumi�re directionelle apr�s avoir appel� la m�thode d'initialisation de la 
     * classe parente
     */
    public void initialise()
    {
        super.initialise();
        
        FloatBuffer buffPosition = BufferUtils.createFloatBuffer(4).put(m_position);
        buffPosition.position(0);

        GL11.glLight(m_currentLight, GL11.GL_AMBIENT, buffPosition);
        
    }
}
