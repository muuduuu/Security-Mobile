package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC2204c0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2766r2 extends AbstractC2204c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2782t2 f26306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2766r2(C2782t2 c2782t2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c2782t2);
        this.f26306a = c2782t2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            C2760q3 c2760q3 = this.f26306a.f25694a;
            c2760q3.a().o().a("Opening the local database failed, dropping and recreating it");
            c2760q3.w();
            if (!c2760q3.e().getDatabasePath("google_app_measurement_local.db").delete()) {
                c2760q3.a().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f26306a.f25694a.a().o().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC2811x.b(this.f26306a.f25694a.a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        strArr = C2782t2.f26351e;
        AbstractC2811x.a(this.f26306a.f25694a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", strArr);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
