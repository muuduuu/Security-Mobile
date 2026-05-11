package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2204c0 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2204c0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, true == str.equals(BuildConfig.FLAVOR) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i11 = AbstractC2231f0.f24500b;
        Z.a();
    }
}
