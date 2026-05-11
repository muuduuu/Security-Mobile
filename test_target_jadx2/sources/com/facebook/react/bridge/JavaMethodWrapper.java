package com.facebook.react.bridge;

import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3.AbstractC3747a;
import org.conscrypt.BuildConfig;
import r4.AbstractC4012a;
import s5.C4314b;

/* loaded from: classes.dex */
class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Boolean.valueOf(readableArray.getBoolean(i10));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Double.valueOf(readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Float.valueOf((float) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return Integer.valueOf((int) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getString(i10);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getArray(i10);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return DynamicFromArray.create(readableArray, i10);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return readableArray.getMap(i10);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            if (readableArray.isNull(i10)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i10));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i10), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i10 + 1));
        }
    };
    private static final boolean DEBUG = n3.c.a().b(AbstractC3747a.f37915d);

    private static abstract class ArgumentExtractor<T> {
        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i10);

        public int getJSArgumentsNeeded() {
            return 1;
        }

        private ArgumentExtractor() {
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z10) {
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z10) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else {
            if (length <= 0 || parameterTypes[length - 1] != Promise.class) {
                return;
            }
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        int i10 = 0;
        while (i10 < clsArr.length) {
            Class cls = clsArr[i10];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_PROMISE;
                AbstractC4012a.b(i10 == clsArr.length - 1, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (cls != Dynamic.class) {
                    throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                }
                argumentExtractorArr[i10] = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            i10 += argumentExtractorArr[i10].getJSArgumentsNeeded();
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z10) {
        StringBuilder sb2 = new StringBuilder(clsArr.length + 2);
        if (z10) {
            sb2.append(returnTypeToChar(method.getReturnType()));
            sb2.append('.');
        } else {
            sb2.append("v.");
        }
        int i10 = 0;
        while (i10 < clsArr.length) {
            Class cls = clsArr[i10];
            if (cls == Promise.class) {
                AbstractC4012a.b(i10 == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            sb2.append(paramTypeToChar(cls));
            i10++;
        }
        return sb2.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int i10 = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) AbstractC4012a.c(this.mArgumentExtractors)) {
            i10 += argumentExtractor.getJSArgumentsNeeded();
        }
        return i10;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    private static String createInvokeExceptionMessage(String str) {
        return "Could not invoke " + str;
    }

    private String getAffectedRange(int i10, int i11) {
        if (i11 <= 1) {
            return BuildConfig.FLAVOR + i10;
        }
        return BuildConfig.FLAVOR + i10 + "-" + ((i10 + i11) - 1);
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        C4314b.a(0L, "processArguments").b("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName()).c();
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            C4314b.b(0L).c();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) AbstractC4012a.c(this.mSignature);
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        C4314b.a(0L, "callJavaModuleMethod").b("method", str).c();
        if (DEBUG) {
            n3.c.a().c(AbstractC3747a.f37915d, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            }
            if (this.mJSArgumentsNeeded != readableArray.size()) {
                throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                    if (i10 >= argumentExtractorArr.length) {
                        try {
                            this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                            C4314b.b(0L).c();
                            return;
                        } catch (IllegalAccessException e10) {
                            e = e10;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (InvocationTargetException e12) {
                            if (!(e12.getCause() instanceof RuntimeException)) {
                                throw new RuntimeException(createInvokeExceptionMessage(str), e12);
                            }
                            throw ((RuntimeException) e12.getCause());
                        }
                    }
                    this.mArguments[i10] = argumentExtractorArr[i10].extractArgument(jSInstance, readableArray, i11);
                    i11 += this.mArgumentExtractors[i10].getJSArgumentsNeeded();
                    i10++;
                } catch (UnexpectedNativeTypeException | NullPointerException e13) {
                    throw new NativeArgumentsParseException(e13.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i11, this.mArgumentExtractors[i10].getJSArgumentsNeeded()) + ")", e13);
                }
            }
        } catch (Throwable th) {
            C4314b.b(0L).c();
            throw th;
        }
    }
}
