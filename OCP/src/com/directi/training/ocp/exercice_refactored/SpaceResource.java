package com.directi.training.ocp.exercice_refactored;

public class SpaceResource extends Resource {

    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();

        resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);

        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) {
    }

    private void markSpaceSlotBusy(int resourceId) {
    }

    private int findFreeSpaceSlot() {
        return 0;
    }

}
