package C1;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x1.C5100d;
import x1.EnumC5097a;
import x1.z;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f748a = new B();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f749a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f750b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f751c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f752d;

        static {
            int[] iArr = new int[z.c.values().length];
            try {
                iArr[z.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f749a = iArr;
            int[] iArr2 = new int[EnumC5097a.values().length];
            try {
                iArr2[EnumC5097a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC5097a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f750b = iArr2;
            int[] iArr3 = new int[x1.o.values().length];
            try {
                iArr3[x1.o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[x1.o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[x1.o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[x1.o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[x1.o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f751c = iArr3;
            int[] iArr4 = new int[x1.s.values().length];
            try {
                iArr4[x1.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[x1.s.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f752d = iArr4;
        }
    }

    private B() {
    }

    public static final int a(EnumC5097a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = a.f750b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new lc.m();
    }

    public static final Set b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i10 = 0; i10 < readInt; i10++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    linkedHashSet.add(new C5100d.c(uri, readBoolean));
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(objectInputStream, null);
                Unit unit2 = Unit.f36324a;
                kotlin.io.c.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final EnumC5097a c(int i10) {
        if (i10 == 0) {
            return EnumC5097a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC5097a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final x1.o d(int i10) {
        if (i10 == 0) {
            return x1.o.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return x1.o.CONNECTED;
        }
        if (i10 == 2) {
            return x1.o.UNMETERED;
        }
        if (i10 == 3) {
            return x1.o.NOT_ROAMING;
        }
        if (i10 == 4) {
            return x1.o.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return x1.o.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final x1.s e(int i10) {
        if (i10 == 0) {
            return x1.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return x1.s.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final z.c f(int i10) {
        if (i10 == 0) {
            return z.c.ENQUEUED;
        }
        if (i10 == 1) {
            return z.c.RUNNING;
        }
        if (i10 == 2) {
            return z.c.SUCCEEDED;
        }
        if (i10 == 3) {
            return z.c.FAILED;
        }
        if (i10 == 4) {
            return z.c.BLOCKED;
        }
        if (i10 == 5) {
            return z.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(x1.o networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = a.f751c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == x1.o.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i11;
    }

    public static final int h(x1.s policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = a.f752d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new lc.m();
    }

    public static final byte[] i(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    C5100d.c cVar = (C5100d.c) it.next();
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(objectOutputStream, null);
                kotlin.io.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(z.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f749a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new lc.m();
        }
    }
}
