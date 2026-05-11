package Ea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public interface i {
    default boolean a() {
        return false;
    }

    void b(Activity activity, Bundle bundle);

    default boolean onNewIntent(Intent intent) {
        return false;
    }

    default void c(Activity activity) {
    }

    default void d(Activity activity) {
    }

    default void e(Activity activity) {
    }

    default void f(Activity activity) {
    }

    default void onUserLeaveHint(Activity activity) {
    }
}
