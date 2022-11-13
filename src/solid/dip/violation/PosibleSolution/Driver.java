package solid.dip.violation.PosibleSolution;

class Driver {
    private Carro racingCar;

    public Driver(Carro carro) {
        this.racingCar = carro;
    }

    void increaseSpeed() {
        this.racingCar.acelerar();
    }
}
