package TP5;

import org.lwjgl.opengl.GL11;
import TP4.Vecteur3D;

/**
 * Write a description of class Rotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rotation extends Transformation
{
    // instance variables - replace the example below with your own
    private float m_angle;
    private Vecteur3D m_axe;

    /**
     * Ce constructeur fixe les coordonnees de rotation en même temps qu'une référence
     * vers l'instance de noeud paren
     * @param _parent le noeud déclaré comme parent de l'instance courante (his)
     * @param _axe l'axe de rotation
     * @param _angle l'angle de rotation
     */
    public Rotation(Noeud _parent, Vecteur3D _axe, float _angle)
    {
       super(_parent);
       m_axe = _axe;
       m_angle = _angle;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void tranforme(){
        GL11.glRotatef(m_angle, m_axe.getX(), m_axe.getY(), m_axe.getZ());
    }
}
