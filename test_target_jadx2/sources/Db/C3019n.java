package db;

import expo.modules.kotlin.exception.CodedException;

/* renamed from: db.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3019n extends CodedException {
    public C3019n(String str) {
        super("Failed to resolve activity to handle the intent of type '" + str + "'", null, 2, null);
    }
}
