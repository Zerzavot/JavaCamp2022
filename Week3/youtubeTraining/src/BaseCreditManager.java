public abstract class BaseCreditManager implements CreditManager{
    @Override
    public abstract void calculate();
    // tamamlanmamislar abstract seklinde tutulur

    @Override
    public void save() {
        System.out.println("Saved");
    }
    // tamamlanmislar

}
