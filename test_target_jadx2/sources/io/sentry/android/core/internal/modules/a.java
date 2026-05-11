package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.K1;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    private final Context f34887d;

    public a(Context context, ILogger iLogger) {
        super(iLogger);
        this.f34887d = context;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            return c(this.f34887d.getAssets().open("sentry-external-modules.txt"));
        } catch (FileNotFoundException unused) {
            this.f35171a.c(K1.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e10) {
            this.f35171a.b(K1.ERROR, "Error extracting modules.", e10);
            return treeMap;
        }
    }
}
