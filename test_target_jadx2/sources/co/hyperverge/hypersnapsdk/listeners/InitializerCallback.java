package co.hyperverge.hypersnapsdk.listeners;

import co.hyperverge.hypersnapsdk.objects.HVError;

/* loaded from: classes.dex */
public interface InitializerCallback {
    void onError(HVError hVError);

    void onSuccess();
}
