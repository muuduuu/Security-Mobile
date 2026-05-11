package h1;

import android.content.Context;
import android.content.Intent;
import h1.s;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import l1.h;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33857b;

    /* renamed from: c, reason: collision with root package name */
    public final h.c f33858c;

    /* renamed from: d, reason: collision with root package name */
    public final s.e f33859d;

    /* renamed from: e, reason: collision with root package name */
    public final List f33860e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33861f;

    /* renamed from: g, reason: collision with root package name */
    public final s.d f33862g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f33863h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f33864i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f33865j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33866k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f33867l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f33868m;

    /* renamed from: n, reason: collision with root package name */
    public final String f33869n;

    /* renamed from: o, reason: collision with root package name */
    public final File f33870o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f33871p;

    /* renamed from: q, reason: collision with root package name */
    public final List f33872q;

    /* renamed from: r, reason: collision with root package name */
    public final List f33873r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f33874s;

    public h(Context context, String str, h.c sqliteOpenHelperFactory, s.e migrationContainer, List list, boolean z10, s.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, s.f fVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f33856a = context;
        this.f33857b = str;
        this.f33858c = sqliteOpenHelperFactory;
        this.f33859d = migrationContainer;
        this.f33860e = list;
        this.f33861f = z10;
        this.f33862g = journalMode;
        this.f33863h = queryExecutor;
        this.f33864i = transactionExecutor;
        this.f33865j = intent;
        this.f33866k = z11;
        this.f33867l = z12;
        this.f33868m = set;
        this.f33869n = str2;
        this.f33870o = file;
        this.f33871p = callable;
        this.f33872q = typeConverters;
        this.f33873r = autoMigrationSpecs;
        this.f33874s = intent != null;
    }

    public boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f33867l) || !this.f33866k) {
            return false;
        }
        Set set = this.f33868m;
        return set == null || !set.contains(Integer.valueOf(i10));
    }
}
