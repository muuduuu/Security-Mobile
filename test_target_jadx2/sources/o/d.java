package O;

import A.AbstractC0700h0;
import A.B;
import M.A;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6825a = {12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6826b = {12445, 13632, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final String f6827c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f6828d;

    /* renamed from: e, reason: collision with root package name */
    private static final A f6829e;

    /* renamed from: f, reason: collision with root package name */
    private static final A f6830f;

    /* renamed from: g, reason: collision with root package name */
    private static final A f6831g;

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f6832h;

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f6833i;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f6834j;

    /* renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f6835k;

    /* renamed from: l, reason: collision with root package name */
    public static final O.g f6836l;

    class a implements A {
        a() {
        }

        @Override // M.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    class b implements A {
        b() {
        }

        @Override // M.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    class c implements A {
        c() {
        }

        @Override // M.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* renamed from: O.d$d, reason: collision with other inner class name */
    public static class C0137d extends f {
        public C0137d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected int f6837a;

        /* renamed from: b, reason: collision with root package name */
        protected int f6838b = -1;

        /* renamed from: c, reason: collision with root package name */
        protected int f6839c = -1;

        /* renamed from: d, reason: collision with root package name */
        protected int f6840d = -1;

        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected f(String str, String str2) {
            int i10;
            int i11;
            int i12;
            try {
                i10 = d.y(35633, str);
                try {
                    i11 = d.y(35632, str2);
                    try {
                        i12 = GLES20.glCreateProgram();
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        e = e10;
                        i12 = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e11) {
                    e = e11;
                    i11 = -1;
                    i12 = i11;
                    if (i10 != -1) {
                        GLES20.glDeleteShader(i10);
                    }
                    if (i11 != -1) {
                        GLES20.glDeleteShader(i11);
                    }
                    if (i12 != -1) {
                        GLES20.glDeleteProgram(i12);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e12) {
                e = e12;
                i10 = -1;
                i11 = -1;
            }
            try {
                d.g("glCreateProgram");
                GLES20.glAttachShader(i12, i10);
                d.g("glAttachShader");
                GLES20.glAttachShader(i12, i11);
                d.g("glAttachShader");
                GLES20.glLinkProgram(i12);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(i12, 35714, iArr, 0);
                if (iArr[0] == 1) {
                    this.f6837a = i12;
                    c();
                } else {
                    throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i12));
                }
            } catch (IllegalArgumentException e13) {
                e = e13;
                if (i10 != -1) {
                }
                if (i11 != -1) {
                }
                if (i12 != -1) {
                }
                throw e;
            } catch (IllegalStateException e14) {
                e = e14;
                if (i10 != -1) {
                }
                if (i11 != -1) {
                }
                if (i12 != -1) {
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f6837a, "aPosition");
            this.f6840d = glGetAttribLocation;
            d.j(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f6837a, "uTransMatrix");
            this.f6838b = glGetUniformLocation;
            d.j(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f6837a, "uAlphaScale");
            this.f6839c = glGetUniformLocation2;
            d.j(glGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f6837a);
        }

        public void d(float f10) {
            GLES20.glUniform1f(this.f6839c, f10);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f6838b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f6837a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f6840d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f6840d, 2, 5126, false, 0, (Buffer) d.f6833i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        /* renamed from: e, reason: collision with root package name */
        private int f6841e;

        /* renamed from: f, reason: collision with root package name */
        private int f6842f;

        /* renamed from: g, reason: collision with root package name */
        private int f6843g;

        public g(B b10, e eVar) {
            this(b10, g(b10, eVar));
        }

        private void c() {
            c();
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f6837a, "sTexture");
            this.f6841e = glGetUniformLocation;
            d.j(glGetUniformLocation, "sTexture");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f6837a, "aTextureCoord");
            this.f6843g = glGetAttribLocation;
            d.j(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f6837a, "uTexMatrix");
            this.f6842f = glGetUniformLocation2;
            d.j(glGetUniformLocation2, "uTexMatrix");
        }

        private static A g(B b10, e eVar) {
            if (!b10.d()) {
                return d.f6829e;
            }
            y0.f.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f6831g : d.f6830f;
        }

        @Override // O.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f6841e, 0);
            GLES20.glEnableVertexAttribArray(this.f6843g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f6843g, 2, 5126, false, 0, (Buffer) d.f6835k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f6842f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(B b10, A a10) {
            super(b10.d() ? d.f6828d : d.f6827c, d.v(a10));
            this.f6841e = -1;
            this.f6842f = -1;
            this.f6843g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f6827c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f6828d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f6829e = new a();
        f6830f = new b();
        f6831g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f6832h = fArr;
        f6833i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f6834j = fArr2;
        f6835k = m(fArr2);
        f6836l = O.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e10) {
            AbstractC0700h0.d("GLUtils", e10.toString(), e10);
        }
    }

    public static void f(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    public static void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    public static void h(Thread thread) {
        y0.f.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z10) {
        y0.f.j(z10 == atomicBoolean.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] k(String str, B b10) {
        int[] iArr = f6825a;
        if (b10.b() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f6826b;
        }
        AbstractC0700h0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map o(B b10, Map map) {
        Object gVar;
        e eVar;
        HashMap hashMap = new HashMap();
        e[] values = e.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = values[i10];
            A a10 = (A) map.get(eVar2);
            if (a10 != null) {
                gVar = new g(b10, a10);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(b10, eVar2);
            } else {
                y0.f.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (b10.d()) {
                    gVar = new C0137d();
                } else {
                    A a11 = (A) map.get(eVar);
                    gVar = a11 != null ? new g(b10, a11) : new g(b10, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            hashMap.put(eVar2, gVar);
        }
        return hashMap;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        g("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i10;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(A a10) {
        try {
            String a11 = a10.a("sTexture", "vTextureCoord");
            if (a11 != null && a11.contains("vTextureCoord") && a11.contains("sTexture")) {
                return a11;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) y0.f.g(matcher.group(1))) + "." + ((String) y0.f.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        g("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AbstractC0700h0.l("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }
}
