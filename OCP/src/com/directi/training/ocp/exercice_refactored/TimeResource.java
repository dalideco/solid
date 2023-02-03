package com.directi.training.ocp.exercice_refactored;

public class TimeResource extends Resource {

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotBusy(int resourceId) {
    }

    private int findFreeTimeSlot() {
        return 0;
    }

    private void markTimeSlotFree(int resourceId) {
    }
}
