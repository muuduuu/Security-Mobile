package h7;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: h7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3294j {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f33981a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f33981a == null) {
                    f33981a = (SharedPreferences) o7.d.a(new CallableC3295k(context));
                }
                sharedPreferences = f33981a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
