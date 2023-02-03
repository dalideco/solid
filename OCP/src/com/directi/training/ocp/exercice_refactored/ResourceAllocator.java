package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator {

    Resource resource;
    private int resourceId;

    ResourceAllocator(Resource resource) {
        this.resource = resource;
    }

    public void allocate() {
        this.resourceId = resource.allocate();
    }

    public void free() {
        resource.free(this.resourceId);
    }
}
