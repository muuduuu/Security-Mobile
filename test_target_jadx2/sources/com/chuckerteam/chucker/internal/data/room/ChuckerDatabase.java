package com.chuckerteam.chucker.internal.data.room;

import P2.a;
import P2.c;
import android.content.Context;
import h1.r;
import h1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "Lh1/s;", "<init>", "()V", "LP2/c;", "F", "()LP2/c;", "LP2/a;", "G", "()LP2/a;", "p", C4870a.f43493a, "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class ChuckerDatabase extends s {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.chuckerteam.chucker.internal.data.room.ChuckerDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChuckerDatabase a(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            applicationContext.getDatabasePath("chuck.db").delete();
            s d10 = r.a(applicationContext, ChuckerDatabase.class, "chucker.db").e().d();
            Intrinsics.checkNotNullExpressionValue(d10, "databaseBuilder(applicationContext, ChuckerDatabase::class.java, DB_NAME)\n                .fallbackToDestructiveMigration()\n                .build()");
            return (ChuckerDatabase) d10;
        }

        private Companion() {
        }
    }

    public abstract c F();

    public abstract a G();
}
