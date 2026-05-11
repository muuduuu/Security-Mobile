package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class A {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(A a10) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(A a10) {
        return a.b(a10);
    }

    static RemoteInput[] b(A[] aArr) {
        if (aArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aArr.length];
        for (int i10 = 0; i10 < aArr.length; i10++) {
            A a10 = aArr[i10];
            remoteInputArr[i10] = a(null);
        }
        return remoteInputArr;
    }
}
