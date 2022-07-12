
import java.io.Serializable;

/*
From What's this "serialization" thing all about?:
--------------------------------------------------
  It lets you take an object or group of objects, put them on a disk or send them through a wire 
or wireless transport mechanism, then later, perhaps on another computer, reverse 
the process: resurrect the original object(s). 
  The basic mechanisms are to flatten object(s) into a one-dimensional stream of bits, 
and to turn that stream of bits back into the original object(s).
  Like the Transporter on Star Trek, it's all about taking something complicated and turning it 
into a flat sequence of 1s and 0s, then taking that sequence of 1s and 0s 
(possibly at another place, possibly at another time) and reconstructing the original 
complicated "something."
  So, implement the Serializable interface when you need to store a copy of the object, 
send them it to another process on the same system or over the network.
Because you want to store or send an object.
It makes storing and sending objects easy. It has nothing to do with security.
*/

public abstract class Oxima implements Serializable {
    
    private String arKykloforias;
    private String montelo;
    private int etosKykloforias;
    private Kinitiras kinitiras;
    
    public Oxima (String arKykloforias, String montelo, int etosKykloforias, Kinitiras kinitiras) {
        this.arKykloforias = arKykloforias;
        this.montelo = montelo;
        this.etosKykloforias = etosKykloforias;
        this.kinitiras = kinitiras;
    }
        
    public Oxima (String arKykloforias, String montelo, int etosKykloforias) {
        this.arKykloforias = arKykloforias;
        this.montelo = montelo;
        this.etosKykloforias = etosKykloforias;
    }
    
    public String getArKykloforias() {
        return arKykloforias;
    }
    
    public String toString() {
        return (arKykloforias + " " + montelo + " " +etosKykloforias + 
                " Κινητήρας: " + kinitiras);
    }
}
