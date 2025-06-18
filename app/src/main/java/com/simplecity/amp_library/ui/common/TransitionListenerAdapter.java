package com.simplecity.amp_library.ui.common;

import android.annotation.TargetApi;
import android.os.Build;
import android.transition.Transition;

@TargetApi(Build.VERSION_CODES.KITKAT)
public abstract class TransitionListenerAdapter implements Transition.TransitionListener {

    @Override
    public void onTransitionStart(Transition transition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onTransitionEnd(Transition transition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onTransitionCancel(Transition transition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onTransitionPause(Transition transition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }

    @Override
    public void onTransitionResume(Transition transition) {
        // This method is intentionally left empty to allow subclasses to override only the methods they need.
    }
}
