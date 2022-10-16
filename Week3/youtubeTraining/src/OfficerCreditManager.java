public class OfficerCreditManager implements CreditManager{
    @Override
    public void calculate() {
        System.out.println(" Officer Credit calculated");
    }

    @Override
    public void save() {
        System.out.println("Officer Credit saved");
    }
}
