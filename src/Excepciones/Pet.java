
package Excepciones;

/**
 *
 * @author kjimenezh
 */
public abstract class Pet implements ISpeaking{
    protected String name;

    public Pet(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
}
