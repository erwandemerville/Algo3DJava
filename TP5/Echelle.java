package TP5;

import org.lwjgl.opengl.GL11;
import TP4.Vecteur3D;

/**
 * Write a description of class Rotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Echelle extends Transformation
{


    /**
     * Ce constructeur fixe les coodonnées de mise à l'échelle en même temps qu'une référence
     * vers l'instance de noeud parent
     * @param _parent le noeud déclaré commeparent de 
     */
    public Echelle(Noeud _parent, Vecteur3D _vecteurEchele)
    {
       super(_parent);
       m_vecteuEchelle = _vecteurEchelle;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void tranforme(){
        GL11.glRotatef(m_VecteurEchelle.getX(), m_axe.getY(), m_axe.getZ());
    }
}