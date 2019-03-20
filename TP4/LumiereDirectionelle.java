package TP4;

import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;

/**
 * Une lumi�re directionnelle repr�sente une source de lumi�re.
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LumiereDirectionelle extends Lumiere
{

    private float[] m_direction = {0.0f,0.0f,0.0f,0.0f};
    
    /**
     * Constructeur de la classe LumiereDirectionnelle, il prend quatre arguments
     * @param _vecteurAmbiant composante ambiante de la lumi�re
     * @param _vecteurDiffus composante diffuse de la lumiere
     * @param _vecteurSpeculaire composante sp�culaire de la lumi�re
     * @param _direction vecteur donnant la direction des rayons �mis
     */
    public LumiereDirectionelle(Vecteur3D _vecteurAmbiant, Vecteur3D _vecteurDiffus, 
                             Vecteur3D _vecteurSpeculaire, Vecteur3D _direction)
    {
        super(_vecteurAmbiant, _vecteurDiffus, _vecteurSpeculaire);
        m_direction[0] = _direction.getX();
        m_direction[1] = _direction.getY();
        m_direction[2] = _direction.getZ();
        m_direction[3] = 1.0f;        
    }
    
    /**
     * On initialise la valeur du vecteur de direction pour cette instance de classe 
     * de lumi�re directionelle apr�s avoir appel� la m�thode d'initialisation de la 
     * classe parente
     */
    public void initialise()
    {
        super.initialise();
        
        FloatBuffer buffDirection = BufferUtils.createFloatBuffer(4).put(m_direction);
        buffDirection.position(0);

        GL11.glLight(m_currentLight, GL11.GL_AMBIENT, buffDirection);
        
    }

}
