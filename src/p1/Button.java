package p1;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class Button extends JButton implements MouseListener{
  public Button(String str){
    super(str);
    //Gr�ce � cette instruction, notre objet va s'�couter
    //D�s qu'un �v�nement de la souris sera intercept�, il en sera averti
    this.addMouseListener(this);
  }

  //M�thode appel�e lors du clic de souris
  public void mouseClicked(MouseEvent event) { }

  //M�thode appel�e lors du survol de la souris
  public void mouseEntered(MouseEvent event) { }

  //M�thode appel�e lorsque la souris sort de la zone du bouton
  public void mouseExited(MouseEvent event) { }

  //M�thode appel�e lorsque l'on presse le bouton gauche de la souris
  public void mousePressed(MouseEvent event) { }

  //M�thode appel�e lorsque l'on rel�che le clic de souris
  public void mouseReleased(MouseEvent event) { }       
}