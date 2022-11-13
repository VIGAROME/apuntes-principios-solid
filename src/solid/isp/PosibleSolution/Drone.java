package solid.isp.PosibleSolution;

class Drone implements DroneSwitch {
    private boolean cameraOn;

    @Override
    public void startEngine() {
        // ...
    }


    @Override
    public void turnCamera_On() {
        cameraOn = true;
    }


    @Override
    public void turnCamera_Off() {
        cameraOn = false;
    }


}
