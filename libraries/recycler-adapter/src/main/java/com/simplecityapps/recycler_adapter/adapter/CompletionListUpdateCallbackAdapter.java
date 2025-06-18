package com.simplecityapps.recycler_adapter.adapter;

public class CompletionListUpdateCallbackAdapter implements CompletionListUpdateCallback {

    @Override
    public void onInserted(int position, int count) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onRemoved(int position, int count) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onMoved(int fromPosition, int toPosition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onChanged(int position, int count, Object payload) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    public void onComplete() {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }
}