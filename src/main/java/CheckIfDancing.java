public class CheckIfDancing implements CheckSkills{

    @Override
    public boolean test(Athletes athletes) {
        return athletes.canDance;
    }
}
