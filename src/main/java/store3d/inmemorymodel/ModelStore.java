package store3d.inmemorymodel;

import store3d.modelelements.Camera;
import store3d.modelelements.Flash;
import store3d.modelelements.PoligonalModel;
import store3d.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{
    //    region public fields
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<IModelChangedObserver> changedObservers = new ArrayList<>();

    //    endregion

    //    region public properties


    @Override
    public void NotifyChange() {
        for (IModelChangedObserver observer  : changedObservers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangedObserver o) {
        changedObservers.add(o);
    }

    @Override
    public void removeModelChanger(IModelChangedObserver o) {
        changedObservers.remove(o);
    }

    //    endregion


    //    region constructors

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras, Collection<IModelChangedObserver> changedObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changedObservers = changedObservers;
    }

    public ModelStore() {
    }
//    endregion
}
