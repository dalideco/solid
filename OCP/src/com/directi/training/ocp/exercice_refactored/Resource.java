package com.directi.training.ocp.exercice_refactored;

public abstract class Resource {
    public abstract int allocate();
    public abstract void free(int resourceId);
}
