package com.spengilley.mvptemplate.ui.common;

/**
 * Base Fragment Presenter interface which should be used when
 * An init method is required to inject view into presenter
 */
public interface BaseFragmentPresenter<T> {
    void init(T view);
}
