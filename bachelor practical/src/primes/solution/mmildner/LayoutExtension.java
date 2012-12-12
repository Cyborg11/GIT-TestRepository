package primes.solution.mmildner;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class LayoutExtension
{
	private GridBagConstraints gbc;
	
	public LayoutExtension()
	{
		gbc = new GridBagConstraints();
	}
	
	/**
	 * Methode um eine Komponente einem Container mit einem GridBagLayout hinzuzufügen.
	 * 
	 * @param cont Container, der die Komponente beinhalten soll
	 * @param gbl GridBagLayout
	 * @param comp Komponente, die hinzugefügt werden soll
	 * @param x X-Position der Komponente 
	 * @param y Y-Position der Komponente
	 * @param height Höhe der Komponente
	 * @param width Breite der Komponente
	 * @param weightx Platzbedarf in X-Richtung
	 * @param weighty Platzbedarf in Y-Richtung
	 * @param top Freier Platz in Pixel nach oben
	 * @param left Freier Platz in Pixel nach links
	 * @param bottom Freier Platz in Pixel nach unten
	 * @param right Freier Platz in Pixel nach rechts
	 */
	
	public void addComponent(	Container cont, GridBagLayout gbl, Component comp,
								int x, int y, int height, int width, double weightx,
								double weighty, int top, int left, int bottom, int right
							)
	{
		setGBCValues(x, y, height, width, weightx, weighty, -1, -1, top, left, bottom, right);
		gbl.setConstraints(cont, gbc);
		cont.add(comp, gbc);		
	}
	
	/**
	 * Methode um eine Komponente einem Container mit einem GridBagLayout hinzuzufügen.
	 * 
	 * @param cont Container, der die Komponente beinhalten soll
	 * @param gbl GridBagLayout
	 * @param comp Komponente, die hinzugefügt werden soll
	 * @param x X-Position der Komponente 
	 * @param y Y-Position der Komponente
	 * @param height Höhe der Komponente
	 * @param width Breite der Komponente
	 * @param weightx Platzbedarf in X-Richtung
	 * @param weighty Platzbedarf in Y-Richtung
	 * @param fill Gibt an, in welche Richtung vergrößert werden darf
	 * @param top Freier Platz in Pixel nach oben
	 * @param left Freier Platz in Pixel nach links
	 * @param bottom Freier Platz in Pixel nach unten
	 * @param right Freier Platz in Pixel nach rechts
	 */
	
	public void addComponent(	Container cont, GridBagLayout gbl, Component comp,
								int x, int y, int height, int width, double weightx,
								double weighty, int fill, int top, int left,
								int bottom, int right
							)
	{
		setGBCValues(x, y, height, width, weightx, weighty, -1, fill, top, left, bottom, right);
		gbl.setConstraints(cont, gbc);
		cont.add(comp, gbc);		
	}
	
	/**
	 * Methode um eine Komponente einem Container mit einem GridBagLayout hinzuzufügen.
	 * 
	 * @param cont Container, der die Komponente beinhalten soll
	 * @param gbl GridBagLayout
	 * @param comp Komponente, die hinzugefügt werden soll
	 * @param x X-Position der Komponente 
	 * @param y Y-Position der Komponente
	 * @param height Höhe der Komponente
	 * @param width Breite der Komponente
	 * @param weightx Platzbedarf in X-Richtung
	 * @param weighty Platzbedarf in Y-Richtung
	 * @param anchor Legt die Ausrichtung der Komponente im Rechteck fest
	 * @param fill Gibt an, in welche Richtung vergrößert werden darf
	 * @param top Freier Platz in Pixel nach oben
	 * @param left Freier Platz in Pixel nach links
	 * @param bottom Freier Platz in Pixel nach unten
	 * @param right Freier Platz in Pixel nach rechts
	 */
	
	public void addComponent(	Container cont, GridBagLayout gbl, Component comp,
								int x, int y, int height, int width, double weightx,
								double weighty, int anchor, int fill, int top, int left,
								int bottom, int right
							)
	{
		setGBCValues(x, y, height, width, weightx, weighty, anchor, fill, top, left, bottom, right);
		gbl.setConstraints(cont, gbc);
		cont.add(comp, gbc);		
	}
	
	private void setGBCValues(	int x, int y, int height, int width, double weightx,
								double weighty, int anchor, int fill, int top, int left,
								int bottom, int right
							 )
	{
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		if (anchor == -1)
		{
			gbc.anchor = GridBagConstraints.CENTER;
		}
		else
		{
			gbc.anchor = anchor;
		}
		if (fill == -1)
		{
			gbc.fill = GridBagConstraints.NONE;
		}
		else
		{
			gbc.fill = fill;
		}
		gbc.insets = new Insets(top, left, bottom, right);
		gbc.ipadx = 0;
		gbc.ipady = 0;		
	}	
}
