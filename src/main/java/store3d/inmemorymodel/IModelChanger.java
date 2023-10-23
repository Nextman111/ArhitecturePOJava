package store3d.inmemorymodel;

public interface IModelChanger {
    public void NotifyChange();
    void  registerModelChanger(IModelChangedObserver o);
    void  removeModelChanger(IModelChangedObserver o);
}
