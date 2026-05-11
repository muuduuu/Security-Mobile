package z1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5238b {

    /* renamed from: z1.b$a */
    public static final class a extends AbstractC5238b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45658a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: z1.b$b, reason: collision with other inner class name */
    public static final class C0670b extends AbstractC5238b {

        /* renamed from: a, reason: collision with root package name */
        private final int f45659a;

        public C0670b(int i10) {
            super(null);
            this.f45659a = i10;
        }

        public final int a() {
            return this.f45659a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0670b) && this.f45659a == ((C0670b) obj).f45659a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f45659a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f45659a + ')';
        }
    }

    public /* synthetic */ AbstractC5238b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5238b() {
    }
}
