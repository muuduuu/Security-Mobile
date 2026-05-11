package a6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1360i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final int f12628a = 1179403647;

    /* renamed from: b, reason: collision with root package name */
    private final FileChannel f12629b;

    public C1360i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f12629b = new FileInputStream(file).getChannel();
    }

    private long a(AbstractC1355d abstractC1355d, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            AbstractC1356e b10 = abstractC1355d.b(j12);
            if (b10.f12621a == 1) {
                long j13 = b10.f12623c;
                if (j13 <= j11 && j11 <= b10.f12624d + j13) {
                    return (j11 - j13) + b10.f12622b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public AbstractC1355d b() {
        this.f12629b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (j(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short e10 = e(allocate, 4L);
        boolean z10 = e(allocate, 5L) == 2;
        if (e10 == 1) {
            return new C1358g(z10, this);
        }
        if (e10 == 2) {
            return new C1359h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List c() {
        long j10;
        AbstractC1354c a10;
        this.f12629b.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC1355d b10 = b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(b10.f12612a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = b10.f12617f;
        int i10 = 0;
        if (j11 == 65535) {
            j11 = b10.c(0).f12625a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            AbstractC1356e b11 = b10.b(j12);
            if (b11.f12621a == 2) {
                j10 = b11.f12622b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j13 = 0;
        do {
            a10 = b10.a(j10, i10);
            long j14 = a10.f12610a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(a10.f12611b));
            } else if (j14 == 5) {
                j13 = a10.f12611b;
            }
            i10++;
        } while (a10.f12610a != 0);
        if (j13 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long a11 = a(b10, j11, j13);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(i(allocate, ((Long) it.next()).longValue() + a11));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12629b.close();
    }

    protected void d(ByteBuffer byteBuffer, long j10, int i10) {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int read = this.f12629b.read(byteBuffer, j10 + j11);
            if (read == -1) {
                throw new EOFException();
            }
            j11 += read;
        }
        byteBuffer.position(0);
    }

    protected short e(ByteBuffer byteBuffer, long j10) {
        d(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    protected int f(ByteBuffer byteBuffer, long j10) {
        d(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    protected long g(ByteBuffer byteBuffer, long j10) {
        d(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String i(ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short e10 = e(byteBuffer, j10);
            if (e10 == 0) {
                return sb2.toString();
            }
            sb2.append((char) e10);
            j10 = j11;
        }
    }

    protected long j(ByteBuffer byteBuffer, long j10) {
        d(byteBuffer, j10, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
