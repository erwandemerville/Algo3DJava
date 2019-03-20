package TP4;

import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;

/**
 * Write a description of class LumiereSpot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LumiereSpot extends LumierePonctuelle
{
    // la direction principale de la lumi�re spot (tableau de r�els, dimension 3)
    float[] m_spotDirection = {0.0f, 0.0f, -1.0f};
    
    // l'angle de diffusion de la lumi�re spot 
    // (r�el compris entre 0 (distribution uniforme) et 128 (focus maximal) )
    float m_spotCutoff = 0;
    
    // L'att�nuation par rapport � la direction principale
    float m_spotExponent = 90;
    
         /**
     * Constructeur de la classe LumierePonctuelle, il prend quatre arguments
     * @param _vecteurAmbiant composante ambiante de la lumi�re
     * @param _vecteurDiffus composante diffuse de la lumiere
     * @param _vecteurSpeculaire composante sp�culaire de la lumi�re
     * @param _position vecteur donnant la position de la lumi�re
     * @param _spotDirection vecteur donnant la direction du faisceau du spot
     * @param _spotCutoff r�el donnant l'angle d'ouverture du spot
     * @param _spotExponent r�el donnant l'att�nuarion des rayons s'�cartant de la directio principale
     */
    public LumiereSpot(Vecteur3D _vecteurAmbiant, Vecteur3D _vecteurDiffus, 
                             Vecteur3D _vecteurSpeculaire, Vecteur3D _spotPosition, 
                             Vecteur3D _spotDirection, float _spotCutoff, float _spotExponent)
    {
        super(_vecteurAmbiant, _vecteurDiffus, _vecteurSpeculaire, _spotPosition);
        
        m_spotDirection[0] = _spotDirection.getX();
        m_spotDirection[1] = _spotDirection.getY();
        m_spotDirection[2] = _spotDirection.getZ();  
        
        m_spotCutoff = _spotCutoff;
        m_spotExponent = _spotExponent;
    }

    /**
     * Constructor for objects of class LumiereSpot
     */
    public LumiereSpot()
    {
        super(); 
        m_spotDirection[0] = 0.0f;
        m_spotDirection[1] = 0.0f;
        m_spotDirection[2] = 0.0f; 
    }

    public void initialise()
    {
        super.initialise();
        
        FloatBuffer buffDirection = BufferUtils.createFloatBuffer(4).put(m_spotDirection);
        buffDirection.position(0);

        GL11.glLight(m_currentLight, GL11.GL_AMBIENT, buffDirection);
        GL11.glLightf(m_currentLight, GL11.GL_SPOT_CUTOFF, m_spotCutoff);
        GL11.glLightf(m_currentLight, GL11.GL_SPOT_EXPONENT, m_spotExponent);
        
    }
}
