public class U2 extends Rocket{

    U2(){
        super(120, 0, 9980);
    }

    public boolean launch(){
        double randomNumber = Math.random()*((double) cargoCarried / cargoLimit);
        return randomNumber >= 0.04*((double) cargoCarried / cargoLimit);
    }

    public boolean land(){
        double randomNumber = Math.random()*((double) cargoCarried / cargoLimit);
        return randomNumber >= 0.08*((double) cargoCarried / cargoLimit);
    }
}
