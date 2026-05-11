package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class m {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f16564a;

        a(ByteBuffer byteBuffer) {
            this.f16564a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() {
            return this.f16564a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f16564a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public long c() {
            return m.c(this.f16564a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f16564a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f16564a.getShort());
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f16565a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16566b;

        b(long j10, long j11) {
            this.f16565a = j10;
            this.f16566b = j11;
        }

        long a() {
            return this.f16565a;
        }
    }

    private interface c {
        int a();

        void b(int i10);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int a10 = cVar.a();
            cVar.b(4);
            j10 = cVar.c();
            cVar.b(4);
            if (1835365473 == a10) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.b((int) (j10 - cVar.getPosition()));
            cVar.b(12);
            long c10 = cVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                int a11 = cVar.a();
                long c11 = cVar.c();
                long c12 = cVar.c();
                if (1164798569 == a11 || 1701669481 == a11) {
                    return new b(c11 + j10, c12);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static R0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return R0.b.h(duplicate);
    }

    static long c(int i10) {
        return i10 & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
