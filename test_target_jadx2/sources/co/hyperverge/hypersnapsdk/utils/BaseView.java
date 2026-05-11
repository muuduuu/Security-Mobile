package co.hyperverge.hypersnapsdk.utils;

/* loaded from: classes.dex */
public interface BaseView<T> {
    T getPresenter();

    void onBackPress();

    void setPresenter(T t10);
}
