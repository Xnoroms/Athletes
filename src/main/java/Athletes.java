public class Athletes {
        String name;
        boolean canFastRun;
        boolean canHighJump;
        boolean canDance;

    public Athletes(String name, boolean canFastRun, boolean canHighJump, boolean canDance) {
        this.name = name;
        this.canFastRun = canFastRun;
        this.canHighJump = canHighJump;
        this.canDance = canDance;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFastRun() {
        return canFastRun;
    }

    public boolean isCanHighJump() {
        return canHighJump;
    }

    public boolean isCanDance() {
        return canDance;
    }

    public String toString(){
        return getName();
    }

}
