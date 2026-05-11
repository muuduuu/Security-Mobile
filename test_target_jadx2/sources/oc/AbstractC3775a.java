package oc;

import java.util.Timer;

/* renamed from: oc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3775a {
    public static final Timer a(String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }
}
