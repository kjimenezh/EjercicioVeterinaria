
package Excepciones;

/**
 *
 * @author kjimenezh
 */
public class Retriever extends Dog{
    public Retriever (String name, License license){
        super(name,license);
    }
    
    @Override
    public void speak(){
        System.out.println("Ladrar fuerte");
    }

}
