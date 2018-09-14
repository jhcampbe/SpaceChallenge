public class U1 extends Rocket{

    U1(){
        super(100, 0, 7258);
    }

    public boolean launch(){
        double randomNumber = Math.random()*((double) cargoCarried / cargoLimit);
        return randomNumber >= 0.05*((double) cargoCarried / cargoLimit);
    }

    public boolean land(){
        double randomNumber = Math.random()*((double) cargoCarried / cargoLimit);
        return randomNumber >= 0.01*((double) cargoCarried / cargoLimit);
    }

}
