package h1;

import android.database.Cursor;
import i1.AbstractC3312b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C3598a;
import l1.h;

/* loaded from: classes.dex */
public class u extends h.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f33924g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private h f33925c;

    /* renamed from: d, reason: collision with root package name */
    private final b f33926d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33927e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33928f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(l1.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor X02 = db2.X0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = X02;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                kotlin.io.c.a(X02, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(l1.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor X02 = db2.X0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = X02;
                boolean z10 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                kotlin.io.c.a(X02, null);
                return z10;
            } finally {
            }
        }

        private a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f33929a;

        public b(int i10) {
            this.f33929a = i10;
        }

        public abstract void a(l1.g gVar);

        public abstract void b(l1.g gVar);

        public abstract void c(l1.g gVar);

        public abstract void d(l1.g gVar);

        public abstract void e(l1.g gVar);

        public abstract void f(l1.g gVar);

        public abstract c g(l1.g gVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33930a;

        /* renamed from: b, reason: collision with root package name */
        public final String f33931b;

        public c(boolean z10, String str) {
            this.f33930a = z10;
            this.f33931b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(h configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f33929a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f33925c = configuration;
        this.f33926d = delegate;
        this.f33927e = identityHash;
        this.f33928f = legacyHash;
    }

    private final void h(l1.g gVar) {
        if (!f33924g.b(gVar)) {
            c g10 = this.f33926d.g(gVar);
            if (g10.f33930a) {
                this.f33926d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f33931b);
            }
        }
        Cursor T10 = gVar.T(new C3598a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            Cursor cursor = T10;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            kotlin.io.c.a(T10, null);
            if (Intrinsics.b(this.f33927e, string) || Intrinsics.b(this.f33928f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f33927e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.c.a(T10, th);
                throw th2;
            }
        }
    }

    private final void i(l1.g gVar) {
        gVar.Z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(l1.g gVar) {
        i(gVar);
        gVar.Z(t.a(this.f33927e));
    }

    @Override // l1.h.a
    public void b(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
    }

    @Override // l1.h.a
    public void d(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean a10 = f33924g.a(db2);
        this.f33926d.a(db2);
        if (!a10) {
            c g10 = this.f33926d.g(db2);
            if (!g10.f33930a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f33931b);
            }
        }
        j(db2);
        this.f33926d.c(db2);
    }

    @Override // l1.h.a
    public void e(l1.g db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        g(db2, i10, i11);
    }

    @Override // l1.h.a
    public void f(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.f(db2);
        h(db2);
        this.f33926d.d(db2);
        this.f33925c = null;
    }

    @Override // l1.h.a
    public void g(l1.g db2, int i10, int i11) {
        List d10;
        Intrinsics.checkNotNullParameter(db2, "db");
        h hVar = this.f33925c;
        if (hVar == null || (d10 = hVar.f33859d.d(i10, i11)) == null) {
            h hVar2 = this.f33925c;
            if (hVar2 != null && !hVar2.a(i10, i11)) {
                this.f33926d.b(db2);
                this.f33926d.a(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f33926d.f(db2);
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            ((AbstractC3312b) it.next()).a(db2);
        }
        c g10 = this.f33926d.g(db2);
        if (g10.f33930a) {
            this.f33926d.e(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + g10.f33931b);
        }
    }
}
