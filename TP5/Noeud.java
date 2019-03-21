package TP5;

import org.lwjgl.opengl.GL11;

/**
 * Abstract class Noeud - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Noeud
{
    // Un noeu peut avoir plusieurs enfants
    protected Vector<Noeud> m_enfants;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
