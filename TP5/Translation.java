package TP5;

import org.lwjgl.opengl.GL11;
/**
 * Write a description of class Translation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Translation extends Transformation
{
    // instance variables - replace the example below with your own
    private Vecteur3D m_coordonnees;

    /**
     * Ce constructeur fixe les ocordonnées de translation en même temps qu'une référence
     * vers l'instance de noeud paren
     * @param _parent le noeud déclaré comme parent de l'instance courante (his)
     * @param _coordonnees les coordonnées de translation.
     */
    public Translation(Noeud _parent, Vecteur3D _coordonnees)
    {
        super(_parent);
        m_coordonnees = _coordonnees;
    }

    /**
     * Implémentation de la méthode abstraite transforme() déclarée initialement dans la
     * classe abstraite Transformation. Elle consiste à appeler l'instruction OpenGL
     * glTranslatef avec troi coordo
     * 
     */
    public void transforme()
    {
        GL11.glTranslatef(m_coordonnees/getX(),m_coordonnees.getY(),m_coordonnees.getZ());
    }
}
