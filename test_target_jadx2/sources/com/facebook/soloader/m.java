package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class m extends G {

    /* renamed from: f, reason: collision with root package name */
    protected final File f23065f;

    /* renamed from: g, reason: collision with root package name */
    protected final String f23066g;

    protected static final class a extends G.c implements Comparable {

        /* renamed from: c, reason: collision with root package name */
        final ZipEntry f23067c;

        /* renamed from: d, reason: collision with root package name */
        final int f23068d;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f23067c = zipEntry;
            this.f23068d = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f23020a.compareTo(aVar.f23020a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23067c.equals(aVar.f23067c) && this.f23068d == aVar.f23068d;
        }

        public int hashCode() {
            return (this.f23068d * 31) + this.f23067c.hashCode();
        }
    }

    protected class b extends G.e {

        /* renamed from: a, reason: collision with root package name */
        protected a[] f23069a;

        /* renamed from: b, reason: collision with root package name */
        private final ZipFile f23070b;

        /* renamed from: c, reason: collision with root package name */
        private final G f23071c;

        b(G g10) {
            this.f23070b = new ZipFile(m.this.f23065f);
            this.f23071c = g10;
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] b() {
            return e();
        }

        @Override // com.facebook.soloader.G.e
        public void c(File file) {
            byte[] bArr = new byte[32768];
            for (a aVar : e()) {
                InputStream inputStream = this.f23070b.getInputStream(aVar.f23067c);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23070b.close();
        }

        a[] d() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(m.this.f23066g);
            String[] j10 = SysUtil.j();
            Enumeration<? extends ZipEntry> entries = this.f23070b.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = compile.matcher(nextElement.getName());
                if (matcher.matches()) {
                    int groupCount = matcher.groupCount();
                    String group = matcher.group(groupCount - 1);
                    String group2 = matcher.group(groupCount);
                    int e10 = SysUtil.e(j10, group);
                    if (e10 >= 0) {
                        linkedHashSet.add(group);
                        a aVar = (a) hashMap.get(group2);
                        if (aVar == null || e10 < aVar.f23068d) {
                            hashMap.put(group2, new a(group2, nextElement, e10));
                        }
                    }
                }
            }
            this.f23071c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] e() {
            a[] aVarArr = this.f23069a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] d10 = d();
            this.f23069a = d10;
            return d10;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f23065f = file;
        this.f23066g = str2;
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C2003f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f23065f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f23065f.getName();
        }
    }

    public boolean v() {
        b bVar = new b(this);
        try {
            boolean z10 = bVar.d().length != 0;
            bVar.close();
            return z10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
