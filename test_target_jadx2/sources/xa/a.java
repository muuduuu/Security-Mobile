package Xa;

import i2.EnumC3313a;
import java.util.Iterator;
import kotlin.collections.AbstractC3574i;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0220a Companion;
    private final EnumC3313a[] dataSources;
    public static final a NONE = new a("NONE", 0, EnumC3313a.LOCAL, EnumC3313a.REMOTE);
    public static final a DISK = new a("DISK", 1, EnumC3313a.DATA_DISK_CACHE, EnumC3313a.RESOURCE_DISK_CACHE);
    public static final a MEMORY = new a("MEMORY", 2, EnumC3313a.MEMORY_CACHE);

    /* renamed from: Xa.a$a, reason: collision with other inner class name */
    public static final class C0220a {
        public /* synthetic */ C0220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(EnumC3313a value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it = a.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AbstractC3574i.v(((a) obj).dataSources, value)) {
                    break;
                }
            }
            a aVar = (a) obj;
            return aVar == null ? a.NONE : aVar;
        }

        private C0220a() {
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, DISK, MEMORY};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new C0220a(null);
    }

    private a(String str, int i10, EnumC3313a... enumC3313aArr) {
        this.dataSources = enumC3313aArr;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
