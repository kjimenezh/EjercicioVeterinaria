
package Excepciones;

/**
 *
 * @author kjimenezh
 */
public class Dog extends Pet implements ILicensable{
    protected License license;
    public Dog(String name, License license){
        super(name);
        this.license = license;
    }
    @Override
    public void speak(){
        System.out.println("Ladrar");
    }
    public License getLicence(){
        return this.license;
    }
}
